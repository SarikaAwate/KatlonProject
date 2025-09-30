import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForElementVisible(findTestObject('InviteUser/Administrator_Menu'), 30)
WebUI.click(findTestObject('InviteUser/Administrator_Menu'))
WebUI.waitForElementVisible(findTestObject('InviteUser/IdentityManagement_Menu'), 30)
WebUI.click(findTestObject('InviteUser/IdentityManagement_Menu'))
WebUI.waitForElementVisible(findTestObject('InviteUser/InviteUser_menu'), 30)
WebUI.click(findTestObject('InviteUser/InviteUser_menu'))

WebUI.setText(findTestObject('InviteUser/InviteUser__firstName'), 'Test')

WebUI.setText(findTestObject('InviteUser/InviteUser__lastName'), 'User')

WebUI.setText(findTestObject('InviteUser/InviteUser__email'), 'Abctest1@gmail.com')

WebUI.click(findTestObject('InviteUser/select__role'))

WebUI.selectOptionByValue(findTestObject('InviteUser/select__role'), 'admin', false)

WebUI.click(findTestObject('InviteUser/Page_RevOne/InviteUser_Button'))



// Wait up to 10 seconds for the toast to appear
TestObject toastSuccess = findTestObject('Object Repository/InviteUser/Page_RevOne/Toast-message-SucessfullyInvitationSent')
TestObject toastWarning = findTestObject('Object Repository/InviteUser/Page_RevOne/WarningToaster')

int timeout = 30
boolean found = false

for (int i = 0; i < timeout; i++) {
    if (WebUI.waitForElementVisible(toastSuccess, 1, FailureHandling.OPTIONAL)) {
        String toastSuccess1 = WebUI.getText(toastSuccess, FailureHandling.OPTIONAL)
        System.out.println("Toast text: " + toastSuccess1)
		assert toastSuccess1.contains('Invitation is sent to the user')
        found = true
        break
    } else if (WebUI.waitForElementVisible(toastWarning, 1, FailureHandling.OPTIONAL)) {
        String toastWarning1 = WebUI.getText(toastWarning, FailureHandling.OPTIONAL)
        System.out.println("Toast text: " + toastWarning1)
        found = true
		assert  toastWarning1.contains('Already sent an email invite ')
        break
    }
    WebUI.delay(1) // small wait before next check
}