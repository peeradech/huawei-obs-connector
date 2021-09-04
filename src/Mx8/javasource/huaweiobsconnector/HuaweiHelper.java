package huaweiobsconnector;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.obs.services.ObsClient;
import com.obs.services.ObsConfiguration;
import com.obs.services.model.AccessControlList;
import com.obs.services.model.AuthTypeEnum;

import huaweiobsconnector.proxies.HuaweiConfig;
import huaweiobsconnector.proxies.ObsObject;
import huaweiobsconnector.proxies.constants.Constants;
import net.sf.jmimemagic.Magic;
import net.sf.jmimemagic.MagicException;
import net.sf.jmimemagic.MagicMatch;
import net.sf.jmimemagic.MagicMatchNotFoundException;
import net.sf.jmimemagic.MagicParseException;

/**
 * HuaweiHelper is Utility for connect to OBS
 * @author Peeradech W. (TBN Software Ltd.)
 *
 *
 * @see Reference: 
 * <ul>
 * <li>Documentation - https://support.huaweicloud.com/intl/en-us/sdk-java-devg-obs/obs_21_0001.html</li>
 * <li>Error - https://support.huaweicloud.com/intl/en-us/sdk-java-devg-obs/obs_21_2002.html</li>
 * </ul>
 */
public class HuaweiHelper
{
	
	public final static ILogNode LOGGER = Core.getLogger(Constants.getLogNode());
	public final static String ENDPOINT_PREFIX = "obs";
	public final static String ENDPOINT_SUFFIX = Constants.getDomainName();
	
//	private static Map<String, StsClient> stsCache = new HashMap<>();
	private static Map<String, ObsClient> obsCache = new HashMap<>();
	
	private static AuthTypeEnum authType = AuthTypeEnum.OBS;
	
	public static ObsClient GetStsClient(HuaweiConfig config) throws CoreException {
		
		if (obsCache.containsKey(config.getIdentifier())) {
			return obsCache.get(config.getIdentifier());
		} else {
			ObsConfiguration obsConfig = new ObsConfiguration();
			obsConfig.setEndPoint(config.getSelectedRegion().getEndpoint());
			obsConfig.setAuthType(authType);
			
			ObsClient newClient = new ObsClient(config.getAccessKey(), config.getSecretKey(), obsConfig);
			
			obsCache.put(config.getIdentifier(), newClient);
			return newClient;
		}
	}
	
	public static ObsObject getMxObsObject(IContext context, com.obs.services.model.ObsObject obj, String bucket) {
		ObsObject mxObsObject = new ObsObject(context);
		mxObsObject.setBucket(bucket);
		mxObsObject.setKey(obj.getObjectKey());
		mxObsObject.setSize(obj.getMetadata().getContentLength());
		mxObsObject.setLastChanged(obj.getMetadata().getLastModified());
		mxObsObject.setStorageClass(obj.getMetadata().getObjectStorageClass().name());
		return mxObsObject;
	}
	
	public static String getFilenameFromKey(String key) {
		int lastIndex = key.lastIndexOf('/');
		if (lastIndex != -1) {
			return key.substring(key.lastIndexOf('/'));
		} else {
			return key;
		}
	}
	
	public static String getEndpoint(String region) {
		return new StringBuilder().append(ENDPOINT_PREFIX)
				.append(region)
				.append(".")
				.append(ENDPOINT_SUFFIX).toString();
	}
	
	public static String getMimeType(InputStream ins) throws IOException, MagicParseException, MagicMatchNotFoundException, MagicException
	{
		byte[] data = IOUtils.toByteArray(ins);
		MagicMatch match = Magic.getMagicMatch(data);
		
		return match.getMimeType();
	}
	
	public static AccessControlList getACL(huaweiobsconnector.proxies.AccessControlList acl) {
		switch (acl) {
		case REST_CANNED_PRIVATE:
			return AccessControlList.REST_CANNED_PRIVATE;
		case REST_CANNED_PUBLIC_READ:
			return AccessControlList.REST_CANNED_PUBLIC_READ;
		case REST_CANNED_PUBLIC_READ_WRITE:
			return AccessControlList.REST_CANNED_PUBLIC_READ_WRITE;
		case REST_CANNED_PUBLIC_READ_DELIVERED:
			return AccessControlList.REST_CANNED_PUBLIC_READ_DELIVERED;
		case REST_CANNED_PUBLIC_READ_WRITE_DELIVERED:
			return AccessControlList.REST_CANNED_PUBLIC_READ_WRITE_DELIVERED;
		case REST_CANNED_AUTHENTICATED_READ:
			return AccessControlList.REST_CANNED_AUTHENTICATED_READ;
		case REST_CANNED_BUCKET_OWNER_READ:
			return AccessControlList.REST_CANNED_BUCKET_OWNER_READ;
		case REST_CANNED_BUCKET_OWNER_FULL_CONTROL:
			return AccessControlList.REST_CANNED_BUCKET_OWNER_FULL_CONTROL;
		case REST_CANNED_LOG_DELIVERY_WRITE:
			return AccessControlList.REST_CANNED_LOG_DELIVERY_WRITE;
		default:
			return null;
		}
	}
	
	public static void printConfig(HuaweiConfig config) {
		HuaweiHelper.LOGGER.trace(String.format("API Credential: AccessKey = %s, SecretKey = %s", config.getAccessKey(), config.getSecretKey()));
;	}
}