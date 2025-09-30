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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys

// Wait and click User Access Logs
//WebUI.openBrowser('')

//WebUI.navigateToUrl('https://hospital-connect-dev.revone.io/')

//WebUI.setText(findTestObject('Object Repository/Page_RevOne/input_Email_LoginInput_UserNameOrEmailAddress'), 'admin@bpktechmail.com')

//WebUI.setEncryptedText(findTestObject('Object Repository/Page_RevOne/input_Password_passwordInput'), 'oOPfrP0qswM=')

//WebUI.click(findTestObject('Object Repository/Page_RevOne/button_Forgot password_Action'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_RevOne/span_User Access Logs_lpx-menu-item-text hi_e1ede2'), 30)
WebUI.click(findTestObject('Object Repository/Page_RevOne/span_User Access Logs_lpx-menu-item-text hi_e1ede2'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_RevOne/span_Administration_lpx-menu-item-text hidd_7477db'), 30)
WebUI.click(findTestObject('Object Repository/Page_RevOne/span_Administration_lpx-menu-item-text hidd_7477db'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_RevOne/span_Roles_lpx-menu-item-text hidden-in-hov_47be33'), 30)
WebUI.click(findTestObject('Object Repository/Page_RevOne/span_Roles_lpx-menu-item-text hidden-in-hov_47be33'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Users  RevOne/input_New user_form-control ng-untouched ng_88468f'), 30)
WebUI.setText(findTestObject('Object Repository/Page_Users  RevOne/input_New user_form-control ng-untouched ng_88468f'), 'TestUser8')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Users  RevOne/button_Phone number_dropdown-toggle btn btn_ee009b'), 30)
WebUI.click(findTestObject('Object Repository/Page_Users  RevOne/button_Phone number_dropdown-toggle btn btn_ee009b'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Users  RevOne/div_Permissions_abp-ellipsis ng-star-inserted'), 30)
WebUI.click(findTestObject('Object Repository/Page_Users  RevOne/div_Permissions_abp-ellipsis ng-star-inserted'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Users  RevOne/button_Cancel_confirm'), 30)
WebUI.click(findTestObject('Object Repository/Page_Users  RevOne/button_Cancel_confirm'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Users  RevOne/p_No data available_abp-toast-message'))
