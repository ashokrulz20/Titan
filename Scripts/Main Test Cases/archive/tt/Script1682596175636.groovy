import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

String a

WebUI.navigateToUrl('https://qa-appevo01.cns-inc.com:5002/evoBrix/')

WebUI.setText(findTestObject('Object Repository/Page_Welcome to MMIS/input_Login_domainName'), 'CNSI')

WebUI.getAttribute(findTestObject('Object Repository/Page_Welcome to MMIS/input_Login_domainName'), EE)

WebUI.setText(findTestObject('Object Repository/Page_Welcome to MMIS/input_Login_userId'), EE)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Welcome to MMIS/input_Login_password'), 'SB1lws7eg6U=')

WebUI.click(findTestObject('Object Repository/Page_Welcome to MMIS/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Select the Profile/select_Select Profile1099 Financial Adjuste_8ab557'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Select the Profile/button_Go'))

WebUI.click(findTestObject('Object Repository/Page_My Reminders  evoBrix X/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_My Reminders  evoBrix X/a_Claims'))

WebUI.click(findTestObject('Object Repository/Page_My Reminders  evoBrix X/a_Submit Professional'))
