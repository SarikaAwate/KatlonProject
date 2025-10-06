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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

// ---------- Navigation ----------
WebUI.waitForElementPresent(findTestObject('Location/Page_RevOne/AdministrationMenu'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Location/Page_RevOne/AdministrationMenu'))

WebUI.waitForElementPresent(findTestObject('Location/Page_RevOne/HospitalConfigurationMenu'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Location/Page_RevOne/HospitalConfigurationMenu'))

WebUI.waitForElementPresent(findTestObject('Location/Page_RevOne/LocationMenu'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Location/Page_RevOne/LocationMenu'))

WebUI.waitForElementPresent(findTestObject('Location/Page_RevOne/AddHospitalLocationButton'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Location/Page_RevOne/AddHospitalLocationButton'))

// ---------- Form Filling ----------
WebUI.selectOptionByLabel(findTestObject('Location/Page_RevOne/HospitalDropdown'), HospitalName, false)

WebUI.setText(findTestObject('Location/Page_RevOne/LocationNameTextBox'), LocationName // fixed typo
    )

WebUI.setText(findTestObject('Location/Page_RevOne/LocationID_TextBox'), LocationID)

WebUI.setText(findTestObject('Object Repository/Location/Page_RevOne/Address'), Address)

WebUI.setText(findTestObject('Location/Page_RevOne/ZipCode_TextBox'), ZipCode)

WebUI.click(findTestObject('Location/Page_RevOne/ZipCode_TextBox'))

WebUI.click(findTestObject('Location/Page_RevOne/CityDropDown'))

WebUI.delay(30)

//Drpdown City
String City = WebUI.getText(findTestObject('Object Repository/Location/Page_RevOne/CityDropDown'))

println('✅ Selected dropdown value is: ' + City)

WebUI.verifyMatch(PopulatedCity, City, false, FailureHandling.STOP_ON_FAILURE)

//Drpdown State
String State = WebUI.getText(findTestObject('Object Repository/Location/Page_RevOne/StateDropdown'))

println('✅ Selected dropdown value is: ' + State)

WebUI.verifyMatch(PopulatedState, State, false, FailureHandling.STOP_ON_FAILURE)

// ---------- Final input + submit ----------
WebUI.setText(findTestObject('Location/Page_RevOne/Abbreviations (comma-separated)_TextBox'), Abbreviations)

WebUI.click(findTestObject('Location/Page_RevOne/LocationDropown'))

WebUI.selectOptionByLabel(findTestObject('Location/Page_RevOne/LocationDropdownCheckbox'), HospitalName, false)

WebUI.click(findTestObject('Location/Page_RevOne/LocationDropwon_Apply_Button'))

WebUI.getText(findTestObject(null))

