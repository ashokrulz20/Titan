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

WebUI.navigateToUrl('https://qa-appevo01.cns-inc.com:5002/evoBrix/')

WebUI.setText(findTestObject('Object Repository/Page_Welcome to MMIS/input_Login_domainName'), 'CNSI')

WebUI.setText(findTestObject('Object Repository/Page_Welcome to MMIS/input_Login_userId'), 'automationuser')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Welcome to MMIS/input_Login_password'), 'SB1lws7eg6U=')

WebUI.click(findTestObject('Object Repository/Page_Welcome to MMIS/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Select the Profile/select_Select Profile1099 Financial Adjuste_8ab557'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Select the Profile/button_Go'))

WebUI.click(findTestObject('Object Repository/Page_My Reminders  evoBrix X/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_My Reminders  evoBrix X/a_Reference'))

WebUI.click(findTestObject('Object Repository/Page_My Reminders  evoBrix X/a_List Codes'))

WebUI.click(findTestObject('Object Repository/Page_Procedure Codes List  evoBrix X/button_Add'))

WebUI.switchToWindowTitle('Procedure Code | evoBrix X')

WebUI.setText(findTestObject('Object Repository/Page_Procedure Code  evoBrix X/input_Procedure Code_procedureCode'), '1AQA5')

WebUI.click(findTestObject('Object Repository/Page_Procedure Code  evoBrix X/input_Procedure Code_procedureCode'))

WebUI.click(findTestObject('Object Repository/Page_Procedure Code  evoBrix X/div_Procedure Code Required'))

WebUI.setText(findTestObject('Object Repository/Page_Procedure Code  evoBrix X/input_Procedure Code_procedureCode'), '1AQA5')

WebUI.setText(findTestObject('Object Repository/Page_Procedure Code  evoBrix X/textarea_Short Description_shortDescription'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/Page_Procedure Code  evoBrix X/textarea_Long Description_longDescription'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/Page_Procedure Code  evoBrix X/input_MUE_procedureUnits'), '1')

WebUI.click(findTestObject('Object Repository/Page_Procedure Code  evoBrix X/i_Start Date_icon icon-calendar'))

WebUI.click(findTestObject('Object Repository/Page_Procedure Code  evoBrix X/div_March 2023SuMoTuWeThFrSa262728123456789_c92c4d'))

WebUI.click(findTestObject('Object Repository/Page_Procedure Code  evoBrix X/td_1'))

WebUI.click(findTestObject('Object Repository/Page_Procedure Code  evoBrix X/button_Ok'))

WebUI.switchToWindowTitle('Procedure Codes List | evoBrix X')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Procedure Codes List  evoBrix X/select_Filter ByAge RangeAge Range by Modif_b64bd6'), 
    'Procedure Code|a', true)

WebUI.setText(findTestObject('Object Repository/Page_Procedure Codes List  evoBrix X/input_Procedure Code_pgProcedureList_Filter1_1'), 
    '1AQA5')

WebUI.click(findTestObject('Object Repository/Page_Procedure Codes List  evoBrix X/input_Procedure Code_pgProcedureList_Grid1__28c48d'))

WebUI.click(findTestObject('Object Repository/Page_Procedure Codes List  evoBrix X/a_1AQA5'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procedure Details  evoBrix X/td_Page IDpgProcedureGeneral(Reference)'), 
    'Page ID: pgProcedureGeneral(Reference)')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procedure Details  evoBrix X/strong_Procedure Code ID'), 
    'Procedure Code ID :')

WebUI.click(findTestObject('Object Repository/Page_Procedure Details  evoBrix X/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Procedure Codes List  evoBrix X/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_My Reminders  evoBrix X/img_Notepad_admin'))

WebUI.click(findTestObject('Object Repository/Page_My Reminders  evoBrix X/a_Logout'))

WebUI.closeBrowser()

CustomKeywords.'com.example.WebUICustomKeywords.getHtmlTableColumns'(null, '')

