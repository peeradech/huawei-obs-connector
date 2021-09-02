// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package amazons3connector.actions;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import amazons3connector.AmazonHelper;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.Bucket;
import software.amazon.awssdk.services.s3.model.ListBucketsResponse;

public class ListBuckets extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private IMendixObject __awsConfig;
	private amazons3connector.proxies.AwsConfig awsConfig;

	public ListBuckets(IContext context, IMendixObject awsConfig)
	{
		super(context);
		this.__awsConfig = awsConfig;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.awsConfig = __awsConfig == null ? null : amazons3connector.proxies.AwsConfig.initialize(getContext(), __awsConfig);

		// BEGIN USER CODE
		List<IMendixObject> result = new LinkedList<>();
		S3Client client = AmazonHelper.GetS3Client(awsConfig);
		ListBucketsResponse buckets = client.listBuckets();
		for (Bucket bucket : buckets.buckets()) {
			amazons3connector.proxies.Bucket mxBucket = new amazons3connector.proxies.Bucket(getContext());
			mxBucket.setName(bucket.name());
			mxBucket.setCreationDate(new Date(bucket.creationDate().toEpochMilli()));
			result.add(mxBucket.getMendixObject());
		}
		return result;		
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ListBuckets";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
