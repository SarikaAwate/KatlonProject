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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.click(findTestObject('InviteUser/Administrator_Menu'))

WebUI.click(findTestObject('InviteUser/IdentityManagement_Menu'))

WebUI.click(findTestObject('InviteUser/InviteUser_menu'))

WebUI.setText(findTestObject('InviteUser/InviteUser__firstName'), 'Test')

WebUI.setText(findTestObject('InviteUser/InviteUser__lastName'), 'User')

WebUI.setText(findTestObject('InviteUser/InviteUser__email'), 'Abc67i9o@gmail.com')

WebUI.click(findTestObject('InviteUser/select__role'))

WebUI.selectOptionByIndex(findTestObject('InviteUser/select__role'), 2)

WebUI.click(findTestObject('InviteUser/Page_RevOne/InviteUser_Button'))

String toastText =WebUI.getText(findTestObject('InviteUser/Page_RevOne/Toast-message-SucessfullyInvitationSent'))
assert toastText.contains('Invitation is sent to the user')

