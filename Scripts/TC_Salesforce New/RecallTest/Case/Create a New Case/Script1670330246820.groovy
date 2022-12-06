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

WebUI.enhancedClick(findTestObject('Object Repository/OR_Salesforce New/Case/Page_Home  Salesforce/span_Cases'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_Recently Viewed  Cases  Salesforce/div_New'))

WebUI.scrollToElement(findTestObject('Object Repository/OR_Salesforce New/Case/Page_New Case  Salesforce/span_Additional Information'), 
    10)

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_New Case  Salesforce/button_New'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_New Case  Salesforce/span_New'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_New Case  Salesforce/a_--None--'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_New Case  Salesforce/a_Email'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_New Case  Salesforce/a_Medium'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_New Case  Salesforce/a_Highest'))

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Case/Page_New Case  Salesforce/input_Subject_123840'), 
    'Case for Testing')

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Case/Page_New Case  Salesforce/textarea_Description_124040'), 
    'This a case created for testing purpose')

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_New Case  Salesforce/span_Studio'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_New Case  Salesforce/lightning-primitive-icon'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_New Case  Salesforce/span_Save'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/OR_Salesforce New/Case/Page_00001063  Salesforce/span_Case 00001063 was created'), 
    'Case "00001063" was created.')

String caseCreated = WebUI.getText(findTestObject('Object Repository/OR_Salesforce New/Case/Page_00001063  Salesforce/span_Case 00001063 was created'))

WebUI.verifyMatch(caseCreated, 'Case "([0-9]+)" was created.', true, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_Salesforce New/Case/Page_00001063  Salesforce/span_Case 00001063 was created'), 20)

caseNumber = WebUI.getText(findTestObject('OR_Salesforce New/Case/Page_00001063  Salesforce/Page_00001070  Salesforce/lightning-formatted-text_Case Number'), 
    FailureHandling.OPTIONAL)

GlobalVariable.caseNumber=caseNumber


println('Case Number is: ' + caseNumber)

