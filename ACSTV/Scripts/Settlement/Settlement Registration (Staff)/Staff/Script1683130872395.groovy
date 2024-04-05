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

WebUI.setText(findTestObject('SR_Staff_Ojbects/Page_UiuxAfisVn/input_Settlement Registration (Staff)_mat-input-2'), AgreementNo)

WebUI.click(findTestObject('SR_Staff_Ojbects/Page_UiuxAfisVn/mat-icon_search'))

WebUI.click(findTestObject('SR_Staff_Ojbects/Page_UiuxAfisVn/button_edit'))

WebUI.setText(findTestObject('SR_Staff_Ojbects/Page_UiuxAfisVn/input_Agreement Date_mat-input-35'), Settlement_Date)

WebUI.takeScreenshot(((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Settlement\\Settlement Registration (Staff)\\' + 
    AgreementNo) + '\\Edit\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.click(findTestObject('SR_Staff_Ojbects/Page_UiuxAfisVn/button_Save'))

WebUI.takeScreenshot(((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Settlement\\Settlement Registration (Staff)\\' + 
    AgreementNo) + '\\Save\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.click(findTestObject('SR_Staff_Ojbects/Page_UiuxAfisVn/button_close'))

WebUI.click(findTestObject('SR_Staff_Ojbects/Page_UiuxAfisVn/button_forward'))

WebUI.takeScreenshot(((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Settlement\\Settlement Registration (Staff)\\' + 
    AgreementNo) + '\\Forward\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.click(findTestObject('SR_Staff_Ojbects/Page_UiuxAfisVn/button_close'))