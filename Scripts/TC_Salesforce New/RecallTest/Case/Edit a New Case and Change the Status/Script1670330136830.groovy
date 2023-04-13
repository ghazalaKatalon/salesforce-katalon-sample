import internal.GlobalVariable as GlobalVariable
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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_00001063  Salesforce/button_Edit'))

WebUI.scrollToElement(findTestObject('Object Repository/OR_Salesforce New/Case/Page_Edit 00001063  Salesforce/span_Additional Information'), 
    10)

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_Edit 00001063  Salesforce/button_New'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_Edit 00001063  Salesforce/span_SC In Review'))

WebUI.click(findTestObject('OR_Salesforce New/Case/Page_Edit 00001063  Salesforce/a_--None-- Type'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_Edit 00001063  Salesforce/a_Problem'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_Edit 00001063  Salesforce/a_--None--Case Reason'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_Edit 00001063  Salesforce/a_Existing problem'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case/Page_Edit 00001063  Salesforce/span_Save'))

WebUI.waitForElementVisible(findTestObject('OR_Salesforce New/Case/Page_00001063  Salesforce/span_Case 00001063 was saved'), 
    5, FailureHandling.OPTIONAL)

String caseSaved = WebUI.getText(findTestObject('Object Repository/OR_Salesforce New/Case/Page_00001063  Salesforce/span_Case 00001063 was saved'), 
    FailureHandling.OPTIONAL)

println('Case Saved: ' + caseSaved)

WebUI.verifyMatch(caseSaved, ('Case "' + GlobalVariable.caseNumber) + '" was saved.', true, FailureHandling.OPTIONAL)

WebUI.delay(5)

