// This file was generated by Mendix Modeler.
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
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.obs.services.ObsClient;
import com.obs.services.model.GetObjectRequest;
import huaweiobsconnector.HuaweiHelper;
import system.proxies.FileDocument;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetObject extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __huaweiConfig;
	private huaweiobsconnector.proxies.HuaweiConfig huaweiConfig;
	private java.lang.String bucket;
	private java.lang.String key;
	private java.lang.String fileDocumentType;

	public GetObject(IContext context, IMendixObject huaweiConfig, java.lang.String bucket, java.lang.String key, java.lang.String fileDocumentType)
	{
		super(context);
		this.__huaweiConfig = huaweiConfig;
		this.bucket = bucket;
		this.key = key;
		this.fileDocumentType = fileDocumentType;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		this.huaweiConfig = __huaweiConfig == null ? null : huaweiobsconnector.proxies.HuaweiConfig.initialize(getContext(), __huaweiConfig);

		// BEGIN USER CODE
		HuaweiHelper.printConfig(huaweiConfig);
		
		ObsClient client = HuaweiHelper.GetStsClient(huaweiConfig);
		if (!Core.isSubClassOf(FileDocument.entityName, fileDocumentType)) {
			throw new CoreException("Provided type is not of FileDocument!");
		}
		
		GetObjectRequest req = new GetObjectRequest(this.bucket, this.key);
		
		String fileName = key.substring(key.lastIndexOf('/') + 1);
		IMendixObject target = Core.instantiate(getContext(), fileDocumentType);
		InputStream is = client.getObject(req).getObjectContent();
		Core.storeFileDocumentContent(getContext(), target, fileName, is);
		
		return target;		
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GetObject";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
