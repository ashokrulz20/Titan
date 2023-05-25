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

//for (def index : (0..3)) {
WebUI.click(findTestObject('Object Repository/Page_My Reminders  evoBrix X/a_Claims'))

WebUI.click(findTestObject('Object Repository/Page_My Reminders  evoBrix X/a_Submit Professional'))

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_Provider ID_billingNationalProviderID'), 
    '1245667229')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/select_NPIProvider ID'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_Address Line 1_Address1_providerAddressBean'), 
    '510 linn st')

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_-_POSTAL_CODE_providerAddressBean'), 
    '49010', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/button_Validate Address'))

WebUI.click(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/label_Yes'))

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_Beneficiary ID_beneficiaryMemberIdentifier'), 
    '0210815850')

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_Last Name_patientLastName'), 
    'Daxiaobr Sheedgtz')

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_First Name_patientFirstName'), 
    'Magiho')

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_mm_subClientDoBMM'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_dd_subClientDoBDD'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_yyyy_subClientDoBCCYY'), 
    '1995')

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_Patient Account No_patientAccountNo'), 
    '1234567890')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/select_00-des00-QA00-susaktv00-zgmgnfr01-dc_ce5552'), 
    '1202', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/select_ICD-10-CMICD-9-CM'), 
    'DA', true)

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_Diagnosis Codes 1_diagnosisCode1'), 
    'H348311')

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_Procedure Code_procedureCode'), 
    Procedure_Code_value)

WebUI.click(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_mm_serviceDateFromMonth'))

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_mm_serviceDateFromMonth'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_dd_serviceDateFromDate'), 
    '15')

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_yyyy_serviceDateFromYear'), 
    '2020')

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_mm_serviceToDateMonth'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_dd_serviceToDateDay'), 
    '16')

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_yyyy_serviceToDateYear'), 
    '2020')

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_Modifiers_modifiers1'), 
    Modifier)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/select_123456789101112'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/select_F-FemaleM-MaleU-Unknown'), 
    'F', true)

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_Submitted Charges_submittedCharges'), 
    '2000')

WebUI.click(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/fieldset_BASIC SERVICE LINE ITEMS          _c146bc'))

WebUI.setText(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/input_UnitsQuantity_unitsQuantity'), 
    '15')

WebUI.click(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/button_Add Service Line Item'))

WebUI.click(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/button_Submit Claim'))

WebUI.switchToWindowTitle('Submiited Professional Claim Details | evoBrix X')

WebUI.getText(findTestObject('Object Repository/Page_Submiited Professional Claim Details  _1abc0a/label_212311710000005000'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Object Repository/Page_Submiited Professional Claim Details  _1abc0a/label_1245667229'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Object Repository/Page_Submiited Professional Claim Details  _1abc0a/label_0210815850'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Submiited Professional Claim Details  _1abc0a/button_Close'))

WebUI.switchToWindowTitle('Submit Professional Claims | evoBrix X')

//}
WebUI.click(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/img_Notepad_admin'))

WebUI.click(findTestObject('Object Repository/Page_Submit Professional Claims  evoBrix X/a_Logout'))

WebUI.closeBrowser()

