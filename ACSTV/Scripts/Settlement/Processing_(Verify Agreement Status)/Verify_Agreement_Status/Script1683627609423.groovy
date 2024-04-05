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

Date today = new Date()

String todaysDate = today.format('dd-MM-YYYY')

String nowTime = today.format('hh.mm.ss a')

WebUI.delay(5)

WebUI.setText(findTestObject('Dashboard_Objects/For_Verification/input_Processing_mat-input-10'), AgreementNo)

WebUI.click(findTestObject('Dashboard_Objects/For_Verification/Search'))

WebUI.waitForElementPresent(findTestObject('Dashboard_Objects/For_Verification/div_IDCard'), 5)

WebUI.verifyElementAttributeValue(findTestObject('Dashboard_Objects/For_Verification/div_IDCard'), 'title', IDCard, 1)

WebUI.verifyElementAttributeValue(findTestObject('Dashboard_Objects/For_Verification/div_FINAL_APPROVED'), 'title', Agreement_Status, 1)

WebUI.takeScreenshot(((((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Credit Assessment\\Processing\\' + IDCard) + '\\') + Agreement_Status) + '\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.delay(1)

