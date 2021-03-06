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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Page_It-Right Platform/Username'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Page_It-Right Platform/password'), GlobalVariable.pwd)

WebUI.click(findTestObject('Page_It-Right Platform/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_It-Right Platform/span_WelcomeToggler'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_It-Right Platform/div_WelcomeMenu'), 0)

WebUI.click(findTestObject('Object Repository/Page_It-Right Platform/span_GBS'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DIR/button_Technical Sourcing'))

WebUI.click(findTestObject('Page_DIR/span_Flex_Organization'))

WebUI.selectOptionByValue(findTestObject('Page_DIR/select_Organization'), 'FLEX', true)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_DIR/i_Project-folder-open'), 2)

WebUI.click(findTestObject('Page_DIR/i_Project-folder-open'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_DIR/a_Back to Projects'), 2)

WebUI.verifyElementPresent(findTestObject('Page_DIR/a_PIR-TEST-0005'), 2)

WebUI.click(findTestObject('Page_DIR/i_QA Completed Date_fa fa-bars'))

WebUI.click(findTestObject('Page_DIR/a_Review'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_DIR/h3_Parts Review'), 2)

WebUI.verifyElementPresent(findTestObject('Page_DIR/span_PIR-TEST-0005'), 0)

WebUI.click(findTestObject('Page_DIR/button_Select product category'))

WebUI.verifyElementPresent(findTestObject('Page_DIR/div_Select product category'), 2)

WebUI.setText(findTestObject('Page_DIR/input_Select product category_form-control'), 'cer')

WebUI.click(findTestObject('Page_DIR/span_Ceramic Capacitor'))

WebUI.selectOptionByValue(findTestObject('Page_DIR/select_AccelerometerActive FilterAluminum C_f709df'), 'Ceramic Capacitor', 
    true)

WebUI.verifyElementPresent(findTestObject('Page_DIR/div_Commodity code'), 2)

WebUI.setText(findTestObject('Page_DIR/input_Commodity Prefix_attr  attr-input-blk'), 'CAP')

WebUI.click(findTestObject('Page_DIR/button_Package Orientation Datasheet Link_btn btn-default dropdown-toggle blue'))

WebUI.click(findTestObject('Page_DIR/button_Save'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_DIR/div_Save Success'), 2)

WebUI.click(findTestObject('Page_DIR/i_return-arrow'))

WebUI.verifyElementPresent(findTestObject('Page_DIR/a_Back to Projects'), 2)

WebUI.verifyElementPresent(findTestObject('Page_DIR/a_PIR-TEST-0005'), 2)

WebUI.click(findTestObject('Page_DIR/span_Welcome Thangasumathy Jayakumar'))

WebUI.click(findTestObject('Page_DIR/a_Logout'))

