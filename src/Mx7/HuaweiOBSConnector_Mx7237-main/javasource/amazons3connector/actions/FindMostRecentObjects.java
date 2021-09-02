// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package amazons3connector.actions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import amazons3connector.AmazonHelper;
import amazons3connector.proxies.S3Object;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.ListObjectsV2Request;
import software.amazon.awssdk.services.s3.model.ListObjectsV2Response;

/**
 * This provides an optimized method to obtain the most recent files, matching a certain pattern.
 * 
 * It will paginate through all the objects, matching the prefix.
 * The Amazon API doesn't offer such a filtering / sorting method, so therefore it's made optimized in this action.
 */
public class FindMostRecentObjects extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private IMendixObject __awsConfig;
	private amazons3connector.proxies.AwsConfig awsConfig;
	private java.lang.String bucket;
	private java.lang.String prefix;
	private java.lang.String pattern;
	private java.lang.Long limit;

	public FindMostRecentObjects(IContext context, IMendixObject awsConfig, java.lang.String bucket, java.lang.String prefix, java.lang.String pattern, java.lang.Long limit)
	{
		super(context);
		this.__awsConfig = awsConfig;
		this.bucket = bucket;
		this.prefix = prefix;
		this.pattern = pattern;
		this.limit = limit;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.awsConfig = __awsConfig == null ? null : amazons3connector.proxies.AwsConfig.initialize(getContext(), __awsConfig);

		// BEGIN USER CODE
		ArrayList<S3Object> result = new ArrayList<>();
		S3Client client = AmazonHelper.GetS3Client(awsConfig);
		String continuationToken = null;
		
		while (true) {
			ListObjectsV2Request req = ListObjectsV2Request.builder()
					.bucket(bucket)
					.maxKeys(1)
					.prefix(prefix)
					.continuationToken(continuationToken)
					.build();
			ListObjectsV2Response res = client.listObjectsV2(req);
			for (software.amazon.awssdk.services.s3.model.S3Object obj : res.contents()) {
				if (pattern == null || 
						AmazonHelper.getFilenameFromKey(obj.key()).matches(pattern)) {
					result.add(AmazonHelper.getMxS3Object(getContext(), obj, bucket));
				}
			}
			result.sort(new Comparator<S3Object>() {
				@Override
				public int compare(S3Object o1, S3Object o2) {
					return o2.getLastChanged().compareTo(o1.getLastChanged());
				}
			});
			
			if (result.size() > limit) {
				ArrayList<S3Object> truncatedList = new ArrayList<>();
				truncatedList.addAll(result.subList(0, limit.intValue()));
				result = truncatedList;
			}
			
			if ((continuationToken = res.nextContinuationToken()) == null) 
				break;
		}
		List<IMendixObject> resultMx = new LinkedList<>();
		for (S3Object s3Obj : result) resultMx.add(s3Obj.getMendixObject());
		return resultMx;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "FindMostRecentObjects";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
