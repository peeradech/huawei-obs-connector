// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package huaweiobsconnector.actions;

import java.io.InputStream;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import com.obs.services.ObsClient;
import com.obs.services.exception.ObsException;
import com.obs.services.model.ObjectMetadata;
import com.obs.services.model.PutObjectRequest;
import huaweiobsconnector.HuaweiHelper;

/**
 * Streaming upload uses java.io.InputStream as the data source of an object. You can call ObsClient.putObject to upload the data streams to OBS. Sample code is as follows:
 * 
 * Reference: https://support.huaweicloud.com/intl/en-us/sdk-java-devg-obs/obs_21_0600.html
 */
public class PutObject extends CustomJavaAction<java.lang.Void>
{
	private IMendixObject __config;
	private huaweiobsconnector.proxies.HuaweiConfig config;
	private java.lang.String bucket;
	private java.lang.String key;
	private IMendixObject __file;
	private system.proxies.FileDocument file;
	private huaweiobsconnector.proxies.AccessControlList acl;

	public PutObject(IContext context, IMendixObject config, java.lang.String bucket, java.lang.String key, IMendixObject file, java.lang.String acl)
	{
		super(context);
		this.__config = config;
		this.bucket = bucket;
		this.key = key;
		this.__file = file;
		this.acl = acl == null ? null : huaweiobsconnector.proxies.AccessControlList.valueOf(acl);
	}

	@java.lang.Override
	public java.lang.Void executeAction() throws Exception
	{
		this.config = __config == null ? null : huaweiobsconnector.proxies.HuaweiConfig.initialize(getContext(), __config);

		this.file = __file == null ? null : system.proxies.FileDocument.initialize(getContext(), __file);

		// BEGIN USER CODE
		HuaweiHelper.printConfig(config);
		
		ObsClient client = HuaweiHelper.GetStsClient(config);
		InputStream is = Core.getFileDocumentContent(getContext(), file.getMendixObject());
		ObjectMetadata metadata = new ObjectMetadata();
		PutObjectRequest req = new PutObjectRequest();

		try {
			initializeObjectMetadata(metadata);
			
			HuaweiHelper.LOGGER.debug(String.format("PutObject request: Bucket name = %s, Object name = %s", this.bucket, this.key));
			req.setBucketName(this.bucket);
			req.setObjectKey(this.key);
			req.setInput(is);
			req.setMetadata(metadata);
			
			if (this.acl != null)
			{
				req.setAcl(HuaweiHelper.getACL(this.acl));
			}
			
			client.putObject(req);
			client.setObjectAcl(this.bucket, this.key, HuaweiHelper.getACL(this.acl));
		} catch (ObsException obsEx) {
			HuaweiHelper.LOGGER.error(String.format("Message: %s, Response: %s", obsEx.getErrorMessage(), obsEx.getResponseStatus()));
			throw obsEx;
		} catch (Exception e) {
			throw e;
		} finally {
			//client.close();
		}
		
		return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "PutObject";
	}

	// BEGIN EXTRA CODE
	private void initializeObjectMetadata(ObjectMetadata metadata) 
	{
		if (this.file.getHasContents())
		{
			HuaweiHelper.LOGGER.trace(String.format("File name: %s, Size: %s", this.file.getName(), this.file.getSize()));
			try {
				InputStream input = Core.getFileDocumentContent(getContext(), this.file.getMendixObject());
				String mimeType = HuaweiHelper.getMimeType(input);
				HuaweiHelper.LOGGER.trace(String.format("Mime-Type: %s", mimeType));
				
				if (this.file.getName().toLowerCase().indexOf(".pdf") >= 0)
					metadata.setContentType("application/pdf");
				else
					metadata.setContentType(mimeType);
				
				metadata.setContentLength(this.file.getSize());
			} catch (Exception sex)
			{
				HuaweiHelper.LOGGER.error(sex.getMessage());
				sex.printStackTrace();
			}
		}
	}
	// END EXTRA CODE
}
