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

WebUI.setText(findTestObject('Dashboard_Objects/App_Process/input_Auto Refresh_mat-input-2'), RequestNumber)

WebUI.click(findTestObject('Dashboard_Objects/App_Process/Search'))

WebUI.click(findTestObject('Dashboard_Objects/App_Process/div_Waiting'))

WebUI.click(findTestObject('Object Repository/Dashboard_Objects/App_Process/a_003DHYN022'))

WebUI.click(findTestObject('Object Repository/Dashboard_Objects/App_Process/button_Pending'))

WebUI.setText(findTestObject('Object Repository/Dashboard_Objects/App_Process/textarea_Pending_remark'), 'Test')

WebUI.click(findTestObject('Dashboard_Objects/App_Process/label_ID'))

WebUI.click(findTestObject('Dashboard_Objects/App_Process/label_APPROVE'))

WebUI.click(findTestObject('Dashboard_Objects/App_Process/div_Propose Result_mat-select-arrow-wrapper ng-tns-c311-58'))

WebUI.click(findTestObject('Dashboard_Objects/App_Process/span_ORDINARY'))

WebUI.takeScreenshot(((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Credit Assessment\\Dashboard\\Waiting\\' + 
    RequestNumber) + '\\Judgement\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.click(findTestObject('Dashboard_Objects/App_Process/button_Save'))

WebUI.delay(3)

WebUI.takeScreenshot(((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Credit Assessment\\Dashboard\\Waiting\\' + 
    RequestNumber) + '\\Approved\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.click(findTestObject('Object Repository/Dashboard_Objects/App_Process/mat-icon_close'))

/*

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Dashboard_Objects/App_Process/div_Credit Assessmentchevron_right'))

WebUI.click(findTestObject('Object Repository/Dashboard_Objects/App_Process/div_Dashboard'))

*/

WebUI.setText(findTestObject('Dashboard_Objects/App_Process/input_Auto Refresh_mat-input-2'), RequestNumber)

WebUI.click(findTestObject('Dashboard_Objects/App_Process/Search'))

WebUI.click(findTestObject('Dashboard_Objects/App_Process/Tab_div_Pending'))

WebUI.click(findTestObject('Object Repository/Dashboard_Objects/App_Process/a_003DHYN022'))

WebUI.click(findTestObject('Object Repository/Dashboard_Objects/App_Process/button_Pending'))

WebUI.takeScreenshot(((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Credit Assessment\\Dashboard\\Pending\\' + 
    RequestNumber) + '\\Judgement\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.click(findTestObject('Dashboard_Objects/App_Process/button_Save'))

WebUI.delay(3)

WebUI.takeScreenshot(((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Credit Assessment\\Dashboard\\Pending\\' + 
    RequestNumber) + '\\Approved\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.click(findTestObject('Object Repository/Dashboard_Objects/App_Process/mat-icon_close'))

/*

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Dashboard_Objects/App_Process/div_Credit Assessmentchevron_right'))

WebUI.click(findTestObject('Object Repository/Dashboard_Objects/App_Process/div_Dashboard'))

*/