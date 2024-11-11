import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

response = WS.sendRequest(findTestObject('OR API/TestOps-Create a testops project'))

id = WS.getElementPropertyValue(response, 'id')

WS.comment('Project ID: ' + id)

name = WS.getElementPropertyValue(response, 'name')

WS.comment('Project Name: ' + name)

teamId = WS.getElementPropertyValue(response, 'teamId')

WS.comment('Team Id: ' + teamId)

status = WS.getElementPropertyValue(response, 'status')

WS.comment('Status: ' + status)

