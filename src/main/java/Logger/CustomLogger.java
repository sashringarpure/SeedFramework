package Logger;

import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import Specs.Checkout;

public class CustomLogger extends TestListenerAdapter {

	private static Logger log = Logger.getLogger(Checkout.class.getName());
	
	@Override
	public void onTestFailure(ITestResult tr) {
		if (log.isInfoEnabled())
			log.info("Test Failed : " + tr);
	}
	
	@Override
	public void onTestSkipped(ITestResult tr) {
		if (log.isInfoEnabled())
			log.info("Test Skipped : " + tr);
	}
	
	@Override
	public void onTestSuccess(ITestResult tr) {
		if (log.isInfoEnabled())
			log.info("Test Passed : " + tr);
	}
	

}
