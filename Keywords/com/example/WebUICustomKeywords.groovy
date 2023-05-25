package com.example
import groovy.json.JsonSlurper

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.util.KeywordUtil
import java.text.SimpleDateFormat



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory

import com.deque.html.axecore.selenium.AxeBuilder;
import com.deque.html.axecore.selenium.AxeReporter;
import com.deque.html.axecore.selenium.ResultType;
import com.deque.html.axecore.results.Results;
import com.deque.html.axecore.results.Rule;
import static com.deque.html.axecore.selenium.AxeReporter.getReadableAxeResults;


public class WebUICustomKeywords {

	/**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up 
	 * @return true if element present, otherwise false
	 */
	@Keyword
	def isElementPresent(TestObject to, int timeout){
		//Use Katalon built-in function to find elements with time out 1 seconds
		List<WebElement> elements = WebUiBuiltInKeywords.findWebElements(to, timeout)
		return elements.size() > 0
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table 
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}

	/**
	 * Get all cells of HTML table row
	 * @param row a WebElement instance represent for HTML table row 
	 * @param tagName HTML column tag name, usually is TD/TH
	 * @return All cells inside HTML table row 
	 */
	@Keyword
	def List<WebElement> getHtmlTableColumns(WebElement row, String tagName) {
		List<WebElement> selectedColumns = row.findElements(By.tagName(tagName))
		return selectedColumns
	}

	@Keyword
	def checkAccessibility() {
		Results results = new AxeBuilder().analyze(DriverFactory.getWebDriver())
		List<Rule> violations = results.getViolations()
		if(violations.size() == 0){
			KeywordUtil.logInfo("No Violation Found")
		}
		String AxeReportPath = RunConfiguration.getReportFolder()+ File.separator
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new java.util.Date())
		String AxeViolationReportPath=AxeReportPath + "AccessibilityViolations_" + timeStamp
		AxeReporter.writeResultsToJsonFile(AxeViolationReportPath,results)
		KeywordUtil.logInfo("Violation Report Path"+ AxeViolationReportPath)

		if(getReadableAxeResults(ResultType.Violations.getKey(),DriverFactory.getWebDriver(),violations) ){
			AxeReporter.writeResultsToTextFile(AxeViolationReportPath,
					AxeReporter.getAxeResultString())
		}
	}


	@Keyword
	def powerbi() {

		URL url = new URL("https://api.powerbi.com/beta/80a9c7a6-df40-44fc-a8ea-fff5c04ba485/datasets/a6614749-34a4-4c7c-ae12-974c2f94de5a/rows?key=sWWGVanNPYSknpnxKQp61vm2D5fWFd7fWF7mgx6KgQh3D20YOlfeVdD5zwIKhmYJN9RaclF%2FnjOq8c7n2dtxUA%3D%3D");
		HttpURLConnection httpConn = (HttpURLConnection)url.openConnection();
		httpConn.setRequestMethod("POST");
		httpConn.setRequestProperty("Content-Type","application/json");
		httpConn.setDoOutput(true);
		OutputStreamWriter writer = new OutputStreamWriter(httpConn.getOutputStream());
		writer.write("[\n{\n\"Test\" :\"AAAAA555555\"\n}\n]");
		writer.flush();
		writer.close();
		httpConn.getOutputStream().close();
		InputStream responseStream = httpConn.getResponseCode() / 100 == 2 ? httpConn.getInputStream() : httpConn.getErrorStream();
		Scanner s = new Scanner(responseStream).useDelimiter("\\A");
		String response = s.hasNext() ? s.next() : "";
		println(response);
	}
}