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

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/lightning-primitive-icon'))

WebUI.waitForElementVisible(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/h2_Change Case Owner'), 
    GlobalVariable.MDELAY)

WebUI.setText(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/input_Pick an object_72299a'), 
    findTestData('SF/SFD').getValue('owner', 1))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/img_concat(, , mohit kumar, ,  in Users)_icon'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/button_Change Owner'))

WebUI.waitForElementVisible(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/div_Mohit KumarOpen Mohit Kumar Preview'), 
    GlobalVariable.MDELAY)

String caseSaved = WebUI.getText(findTestObject('OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/lightning-formatted-text_00013704'), 
    FailureHandling.OPTIONAL)

println('Case Saved: ' + caseSaved)

GlobalVariable.CASENUMBER = caseSaved

WebUI.verifyMatch(caseSaved, ('Case "' + GlobalVariable.CASENUMBER) + '" was saved.', true, FailureHandling.OPTIONAL)

