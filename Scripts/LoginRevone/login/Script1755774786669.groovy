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
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)
WebUI.maximizeWindow()
WebUI.delay(5)
// Wait for email field to be present before typing
WebUI.waitForElementVisible(findTestObject('Object Repository/login/Page_RevOne/input_Email_LoginInput_UserNameOrEmailAddress'), 20)
WebUI.setText(findTestObject('Object Repository/login/Page_RevOne/input_Email_LoginInput_UserNameOrEmailAddress'),GlobalVariable.Username)

WebUI.waitForElementVisible(findTestObject('Object Repository/login/Page_RevOne/input_Password_passwordInput'), 20)
WebUI.setText(findTestObject('Object Repository/login/Page_RevOne/input_Password_passwordInput'),GlobalVariable.Password)

WebUI.waitForElementClickable(findTestObject('Object Repository/login/Page_RevOne/button_Password_togglePassword'), 20)
WebUI.click(findTestObject('Object Repository/login/Page_RevOne/button_Password_togglePassword'))

WebUI.waitForElementClickable(findTestObject('Object Repository/login/Page_RevOne/button_Forgot password_Action'), 20)
WebUI.click(findTestObject('Object Repository/login/Page_RevOne/button_Forgot password_Action'))

// Wait for dashboard breadcrumb text
WebUI.waitForElementVisible(findTestObject('Object Repository/login/Page_RevOne/span_HL7 Mapping_lpx-breadcrumb-item-text n_821826'), 30)
WebUI.delay(30)
Dashbaord = WebUI.getText(findTestObject('Object Repository/login/Page_RevOne/span_HL7 Mapping_lpx-breadcrumb-item-text n_821826'))

assert Dashbaord.contains("Home")
System.out.println(Dashbaord)