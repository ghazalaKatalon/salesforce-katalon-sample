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

CustomKeywords.'webKeywords.ApplicationFunction.global_Search_Salesforce'(GlobalVariable.CASENUMBER)

WebUI.waitForElementVisible(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/a_Test Demo'), 
    GlobalVariable.MDELAY)

WebUI.click(findTestObject('OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/span', [('caseNo') : GlobalVariable.CASENUMBER]))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/a_Delete'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/h2_Delete Case'), 
    'Delete Case')

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/button_Delete'))

