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

WebUI.waitForElementClickable(findTestObject('Object Repository/NewUser/Page_RevOne/span_User Access Logs_lpx-menu-item-text hi_e1ede2'), 
    10)

WebUI.click(findTestObject('Object Repository/NewUser/Page_RevOne/span_User Access Logs_lpx-menu-item-text hi_e1ede2'))

WebUI.waitForElementClickable(findTestObject('Object Repository/NewUser/Page_RevOne/span_Administration_lpx-menu-item-text hidd_7477db'), 
    10)

WebUI.click(findTestObject('Object Repository/NewUser/Page_RevOne/span_Administration_lpx-menu-item-text hidd_7477db'))

WebUI.waitForElementClickable(findTestObject('Object Repository/NewUser/Page_RevOne/span_Roles_lpx-menu-item-text hidden-in-hov_47be33'), 
    10)

WebUI.click(findTestObject('Object Repository/NewUser/Page_RevOne/span_Roles_lpx-menu-item-text hidden-in-hov_47be33'))

WebUI.waitForElementClickable(findTestObject('Object Repository/NewUser/Page_Users  RevOne/button_Users_d-inline-flex align-items-cent_5fc07c'), 
    10)

WebUI.click(findTestObject('Object Repository/NewUser/Page_Users  RevOne/button_Users_d-inline-flex align-items-cent_5fc07c'))

WebUI.waitForElementVisible(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_User name_user-name'), 10)

WebUI.setText(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_User name_user-name'), 'TestUser8')

WebUI.waitForElementVisible(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_Password_password'), 10)

WebUI.setEncryptedText(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_Password_password'), '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.waitForElementVisible(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_Name_name'), 10)

WebUI.setText(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_Name_name'), 'Test')

WebUI.waitForElementVisible(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_Surname_surname'), 10)

WebUI.setText(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_Surname_surname'), 'User')

WebUI.waitForElementClickable(findTestObject('Object Repository/NewUser/Page_Users  RevOne/div_Roles_ngb-nav-0-panel'), 
    10)

WebUI.click(findTestObject('Object Repository/NewUser/Page_Users  RevOne/div_Roles_ngb-nav-0-panel'))

WebUI.waitForElementVisible(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_Email address_email'), 10)

WebUI.setText(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_Email address_email'), 'Test1@gmail.com')

WebUI.waitForElementVisible(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_Phone number_phone-number'), 
    10)

WebUI.setText(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_Phone number_phone-number'), '8989898989')

WebUI.waitForElementClickable(findTestObject('Object Repository/NewUser/Page_Users  RevOne/a_User Information_ngb-nav-1'), 
    10)

WebUI.click(findTestObject('Object Repository/NewUser/Page_Users  RevOne/a_User Information_ngb-nav-1'))

//WebUI.waitForElementClickable(findTestObject('Object Repository/NewUser/Page_Users  RevOne/label_admin_form-check-label ng-star-inserted'), 10)
//WebUI.click(findTestObject('Object Repository/NewUser/Page_Users  RevOne/label_admin_form-check-label ng-star-inserted'))
WebUI.waitForElementClickable(findTestObject('Object Repository/NewUser/Page_Users  RevOne/label_Roles_form-check-label ng-star-inserted'), 
    10)

WebUI.click(findTestObject('Object Repository/NewUser/Page_Users  RevOne/label_Roles_form-check-label ng-star-inserted'))

//WebUI.waitForElementClickable(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_admin_roles-2'), 10)
//WebUI.click(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_admin_roles-2'))
//label[@for='roles-0']
WebUI.waitForElementClickable(findTestObject('Object Repository/NewUser/Page_Users  RevOne/form_New user_ng-star-inserted ng-dirty ng-_d1524f'), 
    10)

WebUI.click(findTestObject('Object Repository/NewUser/Page_Users  RevOne/form_New user_ng-star-inserted ng-dirty ng-_d1524f'))

WebUI.waitForElementClickable(findTestObject('Object Repository/NewUser/Page_Users  RevOne/a_New user_ngb-nav-0'), 10)

WebUI.click(findTestObject('Object Repository/NewUser/Page_Users  RevOne/a_New user_ngb-nav-0'))

WebUI.waitForElementClickable(findTestObject('Object Repository/NewUser/Page_Users  RevOne/button_Cancel_btn btn-primary'), 
    10)

WebUI.click(findTestObject('Object Repository/NewUser/Page_Users  RevOne/button_Cancel_btn btn-primary'))

//WebUI.delay(2)
WebUI.waitForElementVisible(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_New user_form-control ng-untouched ng_88468f'), 
    30)

WebUI.setText(findTestObject('Object Repository/NewUser/Page_Users  RevOne/input_New user_form-control ng-untouched ng_88468f'), 
    'TestUser8')

WebUI.waitForElementClickable(findTestObject('Object Repository/NewUser/Page_Users  RevOne/div_Delete_ng-star-inserted'), 
    10)

a = WebUI.getText(findTestObject('Object Repository/NewUser/Page_Users  RevOne/div_Delete_ng-star-inserted'))

assert a.contains('TestUser8')

