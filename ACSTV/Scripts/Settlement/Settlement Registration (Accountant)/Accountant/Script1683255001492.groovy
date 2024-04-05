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

WebUI.click(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/button_arrow_drop_down'))

WebUI.click(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/button_Agreement Number'))

WebUI.setText(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/input_Settlement Registration (Accountant)__517606'), 
    AgreementNo)

WebUI.click(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/button_search'))

WebUI.click(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/a_301015102857'))

WebUI.takeScreenshot((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Settlement\\Settlement Registration (Accountant)\\' + AgreementNo + '\\Details\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.click(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/button_edit'))

WebUI.takeScreenshot((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Settlement\\Settlement Registration (Accountant)\\' + AgreementNo + '\\Edit\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.click(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/div_Invoice 1_mat-select-arrow-wrapper ng-t_65e897'))

WebUI.click(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/span_Option'))

WebUI.takeScreenshot((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Settlement\\Settlement Registration (Accountant)\\' + AgreementNo + '\\Activation Option\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.click(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/button_Save'))

WebUI.takeScreenshot((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Settlement\\Settlement Registration (Accountant)\\' + AgreementNo + '\\Save\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.click(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/button_close'))

WebUI.click(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/button_check'))

WebUI.takeScreenshot((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Settlement\\Settlement Registration (Accountant)\\' + AgreementNo + '\\Approved\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.click(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/button_close'))

/* 

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/div_Settlementchevron_right'))

WebUI.click(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/div_Settlement Registration (Accountant)'))

*/