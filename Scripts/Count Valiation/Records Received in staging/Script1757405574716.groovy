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

// Wait and double click Refresh (h4)
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_RevOne/h4_Refresh_fw-bold ng-star-inserted'), 10)
WebUI.doubleClick(findTestObject('Object Repository/Page_RevOne/h4_Refresh_fw-bold ng-star-inserted'))

// Wait and click Refresh (p)
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_RevOne/p_Refresh_mb-0 text-muted'), 10)
WebUI.click(findTestObject('Object Repository/Page_RevOne/p_Refresh_mb-0 text-muted'))

// Click again (sometimes UI needs second click)
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_RevOne/p_Refresh_mb-0 text-muted'), 10)
WebUI.click(findTestObject('Object Repository/Page_RevOne/p_Refresh_mb-0 text-muted'))

// Wait and click Home
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_RevOne/span_Home_lpx-menu-item-text hidden-in-hove_58474d'), 10)
WebUI.click(findTestObject('Object Repository/Page_RevOne/span_Home_lpx-menu-item-text hidden-in-hove_58474d'))

// Wait and click Success message
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_RevOne/div_SUCCESS_page-count ng-star-inserted'), 10)
WebUI.click(findTestObject('Object Repository/Page_RevOne/div_SUCCESS_page-count ng-star-inserted'))

