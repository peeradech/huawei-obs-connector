package huaweiobsconnector;

import java.io.IOException;

import com.obs.services.ObsClient;
import com.obs.services.exception.ObsException;

public class Test {
	public static void main(String[] args) {
		ObsClient obsClient = null;
		try {
			String endPoint = "https://obs.ap-southeast-2.myhuaweicloud.com";
			String ak = "LGHXLMKQBYKJBDVORUMJ";
			String sk = "kf4D2tnbIuGSDkIm8gZtb117rJErjhZxf39v0Ne6";
			// Create an instance of ObsClient.
			obsClient = new ObsClient(ak, sk, endPoint);
			// Call APIs to perform related operations, for example, uploading an object.
		} catch (ObsException e) {
			System.out.println("Response Code: " + e.getResponseCode());
			System.out.println("Error Message: " + e.getErrorMessage());
			System.out.println("Error Code:" + e.getErrorCode());
			System.out.println("Request ID:" + e.getErrorRequestId());
			System.out.println("Host ID:" + e.getErrorHostId());
		} finally {
			// Close the instance of ObsClient. If this instance is a global one, you do not
			// need to close it every time you complete calling a method.
			// After you call the ObsClient.close method to close an instance of ObsClient,
			// the instance cannot be used any more.
			if (obsClient != null) {
				try {
					obsClient.close();
				} catch (IOException e) {
				}
			}
		}
	}

}
