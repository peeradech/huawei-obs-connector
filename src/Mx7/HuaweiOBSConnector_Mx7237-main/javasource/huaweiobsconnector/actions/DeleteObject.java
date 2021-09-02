// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package huaweiobsconnector.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.obs.services.ObsClient;
import com.obs.services.model.DeleteObjectRequest;
import huaweiobsconnector.HuaweiHelper;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class DeleteObject extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __huaweiConfig;
	private huaweiobsconnector.proxies.HuaweiConfig huaweiConfig;
	private java.lang.String bucket;
	private java.lang.String key;

	public DeleteObject(IContext context, IMendixObject huaweiConfig, java.lang.String bucket, java.lang.String key)
	{
		super(context);
		this.__huaweiConfig = huaweiConfig;
		this.bucket = bucket;
		this.key = key;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.huaweiConfig = __huaweiConfig == null ? null : huaweiobsconnector.proxies.HuaweiConfig.initialize(getContext(), __huaweiConfig);

		// BEGIN USER CODE
		HuaweiHelper.printConfig(huaweiConfig);
		
		ObsClient client = HuaweiHelper.GetStsClient(huaweiConfig);
		DeleteObjectRequest req = new DeleteObjectRequest(this.bucket, this.key);
		client.deleteObject(req);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "DeleteObject";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
