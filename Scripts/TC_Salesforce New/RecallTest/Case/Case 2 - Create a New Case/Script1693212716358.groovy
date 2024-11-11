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

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_Recently Viewed  Cases  Salesforce/div_New'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case  Salesforce/span_On-Boarding Request'), 
    'On-Boarding Request')

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case  Salesforce/span_Legal Requirement_slds-radio--faux'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case  Salesforce/button_Next'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/h2_New Case On-Boarding Request'), 
    'New Case: On-Boarding Request')

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/input_Subject_Subject'), 
    findTestData('SF/SFD').getValue('name', 1))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/button_Open'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/span_Received'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/input__combobox-input-471'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/svg_Recent Accounts_slds-icon slds-icon_small'))

WebUI.scrollToElement(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/span_Request Information'), 
    GlobalVariable.MDELAY)

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/button_--None--'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/lightning-base-combobox-item_ENT'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/button_--None--_1'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/lightning-base-combobox-item_7 on-boarding _b21e69'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/input__Request_Date_and_Time__c'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/span_30'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/button_--None--_1_2'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/lightning-base-combobox-item_(GMT1400) Apia_50c48d'))

WebUI.scrollToElement(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/span_System Information'), 
    GlobalVariable.MDELAY)

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/input_Web Email_SuppliedEmail'), 
    findTestData('SF/SFD').getValue('email', 1))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/button_Medium'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/span_Urgent'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_New Case On-Boarding Request  Salesforce/button_Save'))

