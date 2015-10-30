package API;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fanatics.seed.SeedFramework;

import EcomConstants.Ecom_Constants;
import Specs.Checkout;


public class ShippingAddressVerification {
	
	private SeedFramework seedFramework;
	private static Logger log = Logger.getLogger(Checkout.class.getName());

	@BeforeSuite
	public void OpenConn() {
		if (log.isInfoEnabled())
			log.info("In Before Suite method for ShippingAddressVerification.");
		   this.seedFramework = new SeedFramework();
		   this.seedFramework.initApacheHttpClient(Ecom_Constants.shippingAddressUrl);
		   this.seedFramework.initRestAssured();
		if (log.isInfoEnabled())
			log.info("Exiting Before Suite method for ShippingAddressVerification.");   
	}
	
	@DataProvider(name=Ecom_Constants.shippingAddressDataProvider)
	public Object[][] shippingAddress() {
		if (log.isInfoEnabled())
			log.info("In DataProvider method : shippingAddress.");
		
		try {
				this.seedFramework.initFileScanner(Ecom_Constants.shippingAddressRequestPayload);
		} catch(FileNotFoundException fnfex) {
			System.out.println("ShippingAddressRequest.yml file not found.");
		}
		
			this.seedFramework.getFileScanner().readFileContentsIntoArrayList();
			ArrayList<String> alshippingAddressRequest = this.seedFramework.getFileScanner().getFileContents();
			
		try {
				this.seedFramework.initFileScanner(Ecom_Constants.shippingAddressResponsePayload);
			} catch(FileNotFoundException fnfex) {
				System.out.println("ShippingAddressResponse.yml file not found.");
			}
		
			this.seedFramework.getFileScanner().readFileContentsIntoArrayList();
			ArrayList<String> alshippingAddressResponse = this.seedFramework.getFileScanner().getFileContents();
				
		if (log.isInfoEnabled())
			log.info("Exiting DataProvider method : shippingAddress.");		
		return new Object[][] { {alshippingAddressRequest.get(0),alshippingAddressResponse.get(0)},
								{alshippingAddressRequest.get(1),alshippingAddressResponse.get(1)},
								{alshippingAddressRequest.get(2),alshippingAddressResponse.get(2)},
								{alshippingAddressRequest.get(3),alshippingAddressResponse.get(3)},
								{alshippingAddressRequest.get(4),alshippingAddressResponse.get(4)},
								{alshippingAddressRequest.get(5),alshippingAddressResponse.get(5)},
								{alshippingAddressRequest.get(6),alshippingAddressResponse.get(6)},
								{alshippingAddressRequest.get(7),alshippingAddressResponse.get(7)},
								{alshippingAddressRequest.get(8),alshippingAddressResponse.get(8)},
								{alshippingAddressRequest.get(9),alshippingAddressResponse.get(9)}
							  };
	}
	
	@Test(dataProvider = Ecom_Constants.shippingAddressDataProvider)
	public void testShippingAddressVerification(String request, String response) {
		if (log.isInfoEnabled()) {
			log.info("In method : testShippingAddressResponseVerification.");
			log.info("Executing test for the payload : " + request);
			log.info("Expected response is : " + response);
		}
			this.seedFramework.getApacheHttpClient().setStringEntity(request);
			this.seedFramework.getApacheHttpClient().setContentTypeJson();
			this.seedFramework.getApacheHttpClient().setEntityForPostRequest();
			this.seedFramework.getApacheHttpClient().executePostRequest();
			Assert.assertEquals(this.seedFramework.getApacheHttpClient().getContentFromEntity(),response);
		if (log.isInfoEnabled()) 
			log.info("Exiting method : testShippingAddressVerification.");	
	}
	
	@DataProvider(name="ResponseTagVerification")
	public Object[][] ResponseTags() {
		if (log.isInfoEnabled())
			log.info("In DataProvider method : ResponseTags.");
		
		try {
			this.seedFramework.initFileScanner("/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/ShippingAddressRequestTagVerification.txt");
	} catch(FileNotFoundException fnfex) {
		System.out.println("ShippingAddressRequestTagVerification.yml file not found.");
	}
		
		this.seedFramework.getFileScanner().readFileContentsIntoArrayList();
		ArrayList<String> alshippingAddressRequest = this.seedFramework.getFileScanner().getFileContents();
		
		try {
			this.seedFramework.initFileScanner("/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/expectedOutput/ShippingAddressResponseTagVerification.txt");
	} catch(FileNotFoundException fnfex) {
		System.out.println("ShippingAddressResponseTagVerification.yml file not found.");
	}
		
		this.seedFramework.getFileScanner().readFileContentsIntoArrayList();
		ArrayList<String> alshippingAddressResponse = this.seedFramework.getFileScanner().getFileContents();
		
		if (log.isInfoEnabled())
			log.info("Exiting DataProvider method : ResponseTags.");
		return new Object[][] { {alshippingAddressRequest.get(0),alshippingAddressResponse.get(0)},
				{alshippingAddressRequest.get(1),alshippingAddressResponse.get(1)},
				{alshippingAddressRequest.get(2),alshippingAddressResponse.get(2)},
				{alshippingAddressRequest.get(3),alshippingAddressResponse.get(3)},
				{alshippingAddressRequest.get(4),alshippingAddressResponse.get(4)}
		};
	}
	
	@Test(dataProvider = "ResponseTagVerification")
	public void ShippingAddressResponseTagsVerification(String request, String response) {
		if (log.isInfoEnabled()) {
			log.info("In method : ShippingAddressResponseTagsVerification.");
			log.info("Executing test for the payload : " + request);
			log.info("Expected response (Tag Name) is : " + response.substring(0, response.indexOf("=")));
			log.info("Expected response (Tag Value) is : " + response.substring(response.indexOf("=")+1).replace("\"", ""));
		}
		this.seedFramework.getRestAssured().
		PostRequestUsingJson(Ecom_Constants.shippingAddressUrl, 
				request, 
				response.substring(0, response.indexOf("=")).replace("\"", ""), response.substring(response.indexOf("=")+1).replace("\"", ""));
		if (log.isInfoEnabled()) 
			log.info("Exiting method : ShippingAddressResponseTagsVerification.");
	}
	
	@AfterSuite
	public void closeConn() {
		if (log.isInfoEnabled())
			log.info("In After Suite method for ShippingAddressVerification.");
		this.seedFramework.getFileScanner().close();
		this.seedFramework.getApacheHttpClient().shutdownHttpClientConnection();
		if (log.isInfoEnabled())
			log.info("Exiting After Suite method for ShippingAddressVerification.");
	}
	
}
