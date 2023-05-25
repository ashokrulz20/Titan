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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-appevo01.cns-inc.com:5002/evoBrix/')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-appevo01.cns-inc.com:5002/evoBrix/')

WebUI.setText(findTestObject('Object Repository/Page_Welcome to MMIS/input_Login_domainName'), 'CNSI')

WebUI.rightClick(findTestObject('Object Repository/Page_Welcome to MMIS/input_Login_domainName'))

WebUI.rightClick(findTestObject('Object Repository/Page_Welcome to MMIS/input_Login_domainName'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to MMIS/div_LoginevoBrix XEnhance visibility, ensur_a82e44'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Welcome to MMIS/h5_Benefit Plans'), 'Benefit Plans')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Welcome to MMIS/input_Login_domainName'), '')

VariableManager variableManager = new VariableManager()

// Set the value of the variable.
variableManager.setVariable(EE, 'Hello, world!')

// Get the value of the variable.
String value = variableManager.getVariable('myVariable')

// Assert that the value of the variable is correct.
assertEquals('Hello, world!', value)

WebUI.setText(findTestObject('Object Repository/Page_Welcome to MMIS/input_Login_domainName'), EE)

WebUI.closeBrowser()

