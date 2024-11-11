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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-inc--demo.sandbox.my.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/OR Salesforce/Page_Login  Salesforce/input_Username_username'), 'mohit.kumar@katalon.com.demo')

WebUI.setEncryptedText(findTestObject('Object Repository/OR Salesforce/Page_Login  Salesforce/input_Password_pw'), 'HWHXedaqLCdga/pq1EsgRw==')

WebUI.click(findTestObject('Object Repository/OR Salesforce/Page_Login  Salesforce/input_Password_Login'))

WebUI.waitForElementPresent(findTestObject('Object Repository/OR Salesforce/Page_Home  Salesforce/button_App Launcher'), 
    20)

WebUI.enhancedClick(findTestObject('Object Repository/OR Salesforce/Page_Home  Salesforce/span_Leads'))

WebUI.waitForElementVisible(findTestObject('Object Repository/OR Salesforce/Page_Recently Viewed  Leads  Salesforce/a_New'), 
    20)

WebUI.click(findTestObject('Object Repository/OR Salesforce/Page_Recently Viewed  Leads  Salesforce/div_New'))

WebUI.waitForElementVisible(findTestObject('Object Repository/OR Salesforce/Page_New Lead  Salesforce/h2_New Lead'), 20)

WebUI.click(findTestObject('Object Repository/OR Salesforce/Page_New Lead  Salesforce/button_--None--'))

WebUI.click(findTestObject('Object Repository/OR Salesforce/Page_New Lead  Salesforce/span_Mr'))

WebUI.setText(findTestObject('Object Repository/OR Salesforce/Page_New Lead  Salesforce/input_First Name_firstName'), 'Mohit')

WebUI.setText(findTestObject('Object Repository/OR Salesforce/Page_New Lead  Salesforce/input__lastName'), 'Kumar')

WebUI.click(findTestObject('Object Repository/OR Salesforce/Page_New Lead  Salesforce/button_New'))

WebUI.click(findTestObject('Object Repository/OR Salesforce/Page_New Lead  Salesforce/span_Working'))

WebUI.click(findTestObject('Object Repository/OR Salesforce/Page_New Lead  Salesforce/button_--None--_1'))

WebUI.click(findTestObject('Object Repository/OR Salesforce/Page_New Lead  Salesforce/span_Leadership'))

WebUI.enhancedClick(findTestObject('Object Repository/OR Salesforce/Page_New Lead  Salesforce/button_--None--_1_2'))

WebUI.click(findTestObject('Object Repository/OR Salesforce/Page_New Lead  Salesforce/span_Business Email'))

WebUI.setText(findTestObject('Object Repository/OR Salesforce/Page_New Lead  Salesforce/input__Email'), 'mohit.kumar@katalon.com')

WebUI.verifyElementText(findTestObject('Object Repository/OR Salesforce/Page_New Lead  Salesforce/span_Contact Information'), 
    'Contact Information')

WebUI.click(findTestObject('Object Repository/OR Salesforce/Page_New Lead  Salesforce/button_Save'))

WebUI.closeBrowser()

