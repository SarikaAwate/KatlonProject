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
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.waitForElementVisible(findTestObject('Hospital/Page_RevOne/AdministrationMenu'), 10)

WebUI.click(findTestObject('Hospital/Page_RevOne/AdministrationMenu'))

WebUI.waitForElementVisible(findTestObject('Hospital/Page_RevOne/HospitalConfigurationMenu'), 10)

WebUI.click(findTestObject('Hospital/Page_RevOne/HospitalConfigurationMenu'))

WebUI.waitForElementVisible(findTestObject('Hospital/Page_RevOne/HospitalMenu'), 10)

WebUI.click(findTestObject('Hospital/Page_RevOne/HospitalMenu'))

WebUI.waitForElementVisible(findTestObject('Hospital/Page_RevOne/AddHospitalButton'), 10)

WebUI.click(findTestObject('Hospital/Page_RevOne/AddHospitalButton'))

WebUI.waitForElementVisible(findTestObject('Hospital/Page_RevOne/Name_TextBox'), 10)

WebUI.sendKeys(findTestObject('Hospital/Page_RevOne/Name_TextBox'), Name)

WebUI.setText(findTestObject('Hospital/Page_RevOne/ClientName_TextBox'), ClientName)

WebUI.setText(findTestObject('Hospital/Page_RevOne/Client Id_TextBox'), ClientId)

WebUI.setText(findTestObject('Hospital/Page_RevOne/Contact details_TextBox'), Contact)

WebUI.click(findTestObject('Hospital/Page_RevOne/Is Integration Enabled_Toggle'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Hospital/Page_RevOne/OrgId_TextBox'), OrgId)

// Get today in required format (dd-MM-yyyy)
String today = LocalDate.now().format(DateTimeFormatter.ofPattern('dd-MM-yyyy'))

// Clear and set the date in textbox
TestObject dateField = findTestObject('Hospital/Page_RevOne/Integration start date_form-control')

WebUI.clearText(dateField)

WebUI.setText(dateField, today)

WebUI.waitForElementClickable(findTestObject('Hospital/Page_RevOne/SubmitButton'), 10)

WebUI.click(findTestObject('Hospital/Page_RevOne/SubmitButton'))

WebUI.delay(30)

