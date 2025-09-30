import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class RevOneListener
 {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
    def beforeTestCase(TestCaseContext testCaseContext) 
	{
    if (testCaseContext.getTestCaseId().contains("NewUser") || 
        testCaseContext.getTestCaseId().contains("login")|| 
	    testCaseContext.getTestCaseId().contains("Login"))
	{
        println "⏭️ Skipping login for: " + testCaseContext.getTestCaseId()
    } 
	else 
	{
        println "👉 Running login before test case: " + testCaseContext.getTestCaseId()
       // WebUI.callTestCase(findTestCase('Test Cases/LoginRevone/LoginPositive'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(
			findTestCase('Test Cases/LoginRevone/LoginPositive'),
			[('Email') : GlobalVariable.Username,
			 ('Password') : GlobalVariable.Password],
			FailureHandling.STOP_ON_FAILURE
		)
    }
}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	 def takeScreenshotAndClose(TestCaseContext testCaseContext)
	  {
        if (testCaseContext.getTestCaseStatus() == "FAILED") 
			{
            
			WebUI.takeScreenshot()
            }
        
        // Always close the browser after each test case
        WebUI.closeBrowser()
    }

	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}

	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@AfterTestSuite
	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}
}