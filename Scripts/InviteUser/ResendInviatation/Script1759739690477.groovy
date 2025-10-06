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



WebUI.click(findTestObject('Object Repository/Page_RevOne/span_Patient History_lpx-menu-item-text hid_18f208'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_RevOne/span_User Access Logs_lpx-menu-item-text hi_e1ede2'), 20)
WebUI.click(findTestObject('Object Repository/Page_RevOne/span_User Access Logs_lpx-menu-item-text hi_e1ede2'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_RevOne/span_Administration_lpx-menu-item-text hidd_7477db'), 20)
WebUI.click(findTestObject('Object Repository/Page_RevOne/span_Administration_lpx-menu-item-text hidd_7477db'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_RevOne/span_Users_lpx-menu-item-text hidden-in-hov_d9d0f8'), 20)
WebUI.click(findTestObject('Object Repository/Page_RevOne/span_Users_lpx-menu-item-text hidden-in-hov_d9d0f8'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_RevOne/div_Test_datatable-body-cell-label'), 20)
WebUI.verifyElementText(findTestObject('Object Repository/Page_RevOne/div_Test_datatable-body-cell-label'), 'Abc@gmail.com')

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_RevOne/button_Edit_btn btn-sm btn-outline-primary _05f3c9'), 20)
WebUI.click(findTestObject('Object Repository/Page_RevOne/button_Edit_btn btn-sm btn-outline-primary _05f3c9'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_RevOne/p_abp-toast-message'), 20)
WebUI.verifyElementText(findTestObject('Object Repository/Page_RevOne/p_abp-toast-message'), 'Invitation is resent to the user')
