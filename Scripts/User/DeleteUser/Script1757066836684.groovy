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


// Wait and click User Access Logs
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_RevOne/span_User Access Logs_lpx-menu-item-text hi_e1ede2'), 10)
WebUI.click(findTestObject('Object Repository/Page_RevOne/span_User Access Logs_lpx-menu-item-text hi_e1ede2'))

// Wait and click Administration
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_RevOne/span_Administration_lpx-menu-item-text hidd_7477db'), 10)
WebUI.click(findTestObject('Object Repository/Page_RevOne/span_Administration_lpx-menu-item-text hidd_7477db'))

// Wait and click Roles
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_RevOne/span_Roles_lpx-menu-item-text hidden-in-hov_47be33'), 10)
WebUI.click(findTestObject('Object Repository/Page_RevOne/span_Roles_lpx-menu-item-text hidden-in-hov_47be33'))

// Wait and set text in New user field
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Users  RevOne/input_New user_form-control ng-untouched ng_88468f'), 10)
WebUI.setText(findTestObject('Object Repository/Page_Users  RevOne/input_New user_form-control ng-untouched ng_88468f'), 'TestUser8')

// Wait and click Phone number dropdown
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Users  RevOne/button_Phone number_dropdown-toggle btn btn_ee009b'), 10)
WebUI.click(findTestObject('Object Repository/Page_Users  RevOne/button_Phone number_dropdown-toggle btn btn_ee009b'))

// Wait and click Permissions option
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Users  RevOne/button_Permissions_dropdown-item ng-star-inserted'), 10)
WebUI.click(findTestObject('Object Repository/Page_Users  RevOne/button_Permissions_dropdown-item ng-star-inserted'))

// Wait and click Cancel
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Users  RevOne/button_Cancel_confirm'), 10)
WebUI.click(findTestObject('Object Repository/Page_Users  RevOne/button_Cancel_confirm'))

// Wait and verify toast message appears instead of doubleClick
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Users  RevOne/p_No data available_abp-toast-message'), 10)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Users  RevOne/p_No data available_abp-toast-message'), 10)


