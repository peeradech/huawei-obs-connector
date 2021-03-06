// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package huaweiobsconnector.actions;

import java.util.ArrayList;
import java.util.List;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.obs.services.ObsClient;
import com.obs.services.model.ListObjectsRequest;
import com.obs.services.model.ObjectListing;
import huaweiobsconnector.HuaweiHelper;
import huaweiobsconnector.proxies.Prefix;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class ListPrefixes extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private IMendixObject __huaweiConfig;
	private huaweiobsconnector.proxies.HuaweiConfig huaweiConfig;
	private java.lang.String bucket;

	public ListPrefixes(IContext context, IMendixObject huaweiConfig, java.lang.String bucket)
	{
		super(context);
		this.__huaweiConfig = huaweiConfig;
		this.bucket = bucket;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.huaweiConfig = __huaweiConfig == null ? null : huaweiobsconnector.proxies.HuaweiConfig.initialize(getContext(), __huaweiConfig);

		// BEGIN USER CODE
		HuaweiHelper.printConfig(huaweiConfig);
		
		ObsClient client = HuaweiHelper.GetStsClient(huaweiConfig);
		List<String> prefixes = new ArrayList<String>();
		List<IMendixObject> mxObjects = new ArrayList<IMendixObject>();
		ListObjectsRequest request = new ListObjectsRequest(this.bucket);
		
		request.setMaxKeys(1000);
		// Set folder isolators to slashes.
		request.setDelimiter("/");
		ObjectListing objectListing = client.listObjects(request);
		
		prefixes.add("");
		prefixes.addAll(objectListing.getCommonPrefixes());

		prefixes.forEach(prefix -> {
			HuaweiHelper.LOGGER.trace(String.format("Object key: %s", prefix));
			
			Prefix mxPrefix = new Prefix(getContext());
			mxPrefix.setPrefix(prefix);
			mxObjects.add(mxPrefix.getMendixObject());
		});
		
//		client.close();
		return mxObjects;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ListPrefixes";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
