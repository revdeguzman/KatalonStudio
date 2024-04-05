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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.16.138.66:9999/app/welcome/signin')

WebUI.setText(findTestObject('Object Repository/First Approve/Page_UiuxAfisVn/input_Welcome to AFIS_username'), 'RDEGUZ')

WebUI.setEncryptedText(findTestObject('Object Repository/First Approve/Page_UiuxAfisVn/input_Username_password'), 'p4y+y39Ir5Pc2g9xt3QkeQ==')

WebUI.click(findTestObject('Object Repository/First Approve/Page_UiuxAfisVn/div_ON Financial Information SystemACS Trad_00f8fd'))

WebUI.click(findTestObject('Object Repository/First Approve/Page_UiuxAfisVn/button_Sign In'))

WebUI.click(findTestObject('Object Repository/First Approve/Page_UiuxAfisVn/button_menu'))

WebUI.click(findTestObject('Object Repository/First Approve/Page_UiuxAfisVn/div_Credit Assessmentchevron_right'))

WebUI.click(findTestObject('Object Repository/First Approve/Page_UiuxAfisVn/div_Dashboard'))

