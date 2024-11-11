package webKeywords

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable



class ApplicationFunction {




	@Keyword(keywordObject='WEB')
	def static enhanced_SetViewportSize(int width, int height) {
		WebDriver webDriver = DriverFactory.getWebDriver()
		int browserWidthGap = webDriver.manage().window().getSize().width - Integer.parseInt(WebUiBuiltInKeywords.executeJavaScript('return (window.innerWidth || 0)', null).toString())
		int browserHeightGap = webDriver.manage().window().getSize().height - Integer.parseInt(WebUiBuiltInKeywords.executeJavaScript('return (window.innerHeight || 0)', null).toString())
		float ratio = Float.parseFloat(WebUiBuiltInKeywords.executeJavaScript('return (window.devicePixelRatio || 1)', null).toString())
		int actualWidth = Math.round((width + browserWidthGap * ratio) / ratio)
		int actualHeight = Math.round((height + browserHeightGap * ratio) / ratio)
		WebUiBuiltInKeywords.setViewPortSize(actualWidth, actualHeight)
	}

	@Keyword(keywordObject='WEB')
	def static global_Search_Salesforce(String searchText) {
		WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/button_Search'))

		WebUI.setText(findTestObject('OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/input_Search_input-495', [('appName') : GlobalVariable.APPNAME]),
		searchText)

		WebUI.sendKeys(findTestObject('OR_Salesforce New/Case2/Page_00013701  Case  Salesforce/input_Search_input-495'), Keys.chord(
				Keys.ENTER))
	}
}
