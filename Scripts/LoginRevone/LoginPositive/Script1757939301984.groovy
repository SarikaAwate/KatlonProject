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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()
WebUI.waitForElementVisible(findTestObject('login/Page_RevOne/Email'),30)
WebUI.setText(findTestObject('login/Page_RevOne/Email'), Email)
WebUI.waitForElementVisible(findTestObject('login/Page_RevOne/Password'),10)
WebUI.setText(findTestObject('login/Page_RevOne/Password'), Password)

WebUI.click(findTestObject('Object Repository/login/Page_RevOne/button_Password_togglePassword'))


WebUI.click(findTestObject('login/Page_RevOne/Login'))

TestObject errorMessageObj = findTestObject('Object Repository/login/Page_RevOne/InvalidUserNameandPassword')

TestObject dashboardObj = findTestObject('Object Repository/login/Page_RevOne/span_HL7 Mapping_lpx-breadcrumb-item-text n_821826')

if (WebUI.verifyElementPresent(errorMessageObj, 5, FailureHandling.OPTIONAL)) {
    String errorText = WebUI.getText(errorMessageObj // Now safely get the text
        )

    WebUI.comment('Invalid Login: Error message displayed - ' + errorText)

    assert true // Else check if dashboard element exists (Valid Login case)
    //(WebUI.verifyElementPresent(dashboardObj, 5, FailureHandling.OPTIONAL)) 
} else {
   // WebUI.delay(30)
	WebUI.waitForElementVisible(findTestObject('Object Repository/login/Page_RevOne/span_HL7 Mapping_lpx-breadcrumb-item-text n_821826'),45)
	
    String dashboardText = WebUI.getText(dashboardObj)

    if (dashboardText.contains('Home')) {
        WebUI.comment('Valid Login: Dashboard contains Home')

        assert true
    } else {
        WebUI.comment('Dashboard appeared but "Home" not found')

        assert false
    }
}

