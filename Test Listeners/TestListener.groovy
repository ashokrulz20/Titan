import com.katalon.KatalonHelper
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import internal.GlobalVariable as GlobalVariable

class TestListener {
	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		KatalonHelper.updateInfo()
	}
	
	
	int numberOfFaultyTestCases = 0
	
		@AfterTestCase
		def sampleAfterTestCase(TestCaseContext testCaseContext) {
			println testCaseContext.getTestCaseId()     // MyBrilliantTestCase
			println testCaseContext.getTestCaseStatus() // PASSED, FAILED, ERROR
			println testCaseContext.testCaseId
			
			//String a;
			
			//a = testCaseContext.getTestCaseId();
			
			println("getMessage: "+ testCaseContext.getMessage());
			println("testCaseStatus: "+ testCaseContext.testCaseStatus);
			println("testCaseId: "+ testCaseContext.testCaseId);
			println("testCaseVariables: "+ testCaseContext.testCaseVariables);
			println("getTestCaseVariables: "+ testCaseContext.getTestCaseVariables());
			println("testCaseId: "+ testCaseContext.testCaseId);
			
			//power bi
			
			String powerbivar1 = "[\n{\n\"Test\" :\"&RR\"\n}\n]"
			powerbivar1 = powerbivar1.replace("&RR", testCaseContext.testCaseId)
			URL url = new URL("https://api.powerbi.com/beta/80a9c7a6-df40-44fc-a8ea-fff5c04ba485/datasets/a6614749-34a4-4c7c-ae12-974c2f94de5a/rows?key=sWWGVanNPYSknpnxKQp61vm2D5fWFd7fWF7mgx6KgQh3D20YOlfeVdD5zwIKhmYJN9RaclF%2FnjOq8c7n2dtxUA%3D%3D");
			HttpURLConnection httpConn = (HttpURLConnection)url.openConnection();
			httpConn.setRequestMethod("POST");
			httpConn.setRequestProperty("Content-Type","application/json");
			httpConn.setDoOutput(true);
			OutputStreamWriter writer = new OutputStreamWriter(httpConn.getOutputStream());
			//writer.write("[\n{\n\"Test\" :\"AACLIAMS555555\"\n}\n]");
			writer.write(powerbivar1);
			writer.flush();
			writer.close();
			httpConn.getOutputStream().close();
			InputStream responseStream = httpConn.getResponseCode() / 100 == 2 ? httpConn.getInputStream() : httpConn.getErrorStream();
			Scanner s = new Scanner(responseStream).useDelimiter("\\A");
			String response = s.hasNext() ? s.next() : "";
			println("Response Code: "+ response);
			
			
			
			//
				if (testCaseContext.getTestCaseStatus() != "PASSED") {
					numberOfFaultyTestCases += 1
				}
		}
	
		@AfterTestSuite
		def afterTestSuite(TestSuiteContext testSuiteContext) {
			println("Failed Test Cases: " + numberOfFaultyTestCases)
			println("testSuiteId: "+ testSuiteContext.testSuiteId);
		}
		@AfterTestSuite
		def powerbi() {
			
					
				}
		
		
		
}