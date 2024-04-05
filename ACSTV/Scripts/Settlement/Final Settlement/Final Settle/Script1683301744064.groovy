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

WebUI.setText(findTestObject('SR_Final_Settlement/Page_UiuxAfisVn/input_Clear All_mat-chip-list-input-1'), AgreementNo)

WebUI.sendKeys(findTestObject('SR_Final_Settlement/Page_UiuxAfisVn/input_Clear All_mat-chip-list-input-1'), Keys.chord(Keys.ENTER))

/* WebUI.setText(findTestObject('SR_Final_Settlement/Page_UiuxAfisVn/input_Final Settlement_mat-input-2'), SettlementDate)

WebUI.click(findTestObject('SR_Final_Settlement/Page_UiuxAfisVn/button_search')) */

WebUI.delay(2)

WebUI.takeScreenshot(((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Settlement\\Final Settlement\\Agreement List\\' + 
    AgreementNo) + '\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.click(findTestObject('SR_Final_Settlement/Page_UiuxAfisVn/div_Settlement Date_mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'))

WebUI.click(findTestObject('SR_Final_Settlement/Page_UiuxAfisVn/button_Settle'))

WebUI.delay(3)

WebUI.takeScreenshot(((((('D:\\Users\\rtdeguzman\\Documents\\Katalon\\Evidences - MNS\\Settlement\\Final Settlement\\Settled\\' + 
    AgreementNo) + '\\') + todaysDate) + ' ') + nowTime) + '.png')

WebUI.click(findTestObject('SR_Final_Settlement/Page_UiuxAfisVn/button_close'))

/*

WebUI.refresh()

WebUI.click(findTestObject('SR_Accountant_Objects/Page_UiuxAfisVn/div_Settlementchevron_right'))

WebUI.click(findTestObject('Object Repository/SR_Accountant_Objects/Page_UiuxAfisVn/div_Final Settlement'))

*/