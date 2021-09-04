// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package amazons3connector.actions;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import amazons3connector.AmazonHelper;
import software.amazon.awssdk.core.ResponseInputStream;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.GetObjectResponse;
import system.proxies.FileDocument;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetObject extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __awsConfig;
	private amazons3connector.proxies.AwsConfig awsConfig;
	private java.lang.String bucket;
	private java.lang.String key;
	private java.lang.String fileDocumentType;

	public GetObject(IContext context, IMendixObject awsConfig, java.lang.String bucket, java.lang.String key, java.lang.String fileDocumentType)
	{
		super(context);
		this.__awsConfig = awsConfig;
		this.bucket = bucket;
		this.key = key;
		this.fileDocumentType = fileDocumentType;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		this.awsConfig = __awsConfig == null ? null : amazons3connector.proxies.AwsConfig.initialize(getContext(), __awsConfig);

		// BEGIN USER CODE
		if (!Core.isSubClassOf(FileDocument.entityName, fileDocumentType)) {
			throw new CoreException("Provided type is not of FileDocument!");
		}
		
		S3Client client = AmazonHelper.GetS3Client(awsConfig);
		GetObjectRequest req = GetObjectRequest.builder()
				.bucket(bucket)
				.key(key)
				.build();
		String fileName = key.substring(key.lastIndexOf('/') + 1);
		ResponseInputStream<GetObjectResponse> ris = client.getObject(req);
		IMendixObject target = Core.instantiate(getContext(), fileDocumentType);
		Core.storeFileDocumentContent(getContext(), target, fileName, ris);
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