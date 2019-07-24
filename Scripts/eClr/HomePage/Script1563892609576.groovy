import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-publishing.cdc.gov/eclearance/viewDocumentsToReviewList.action')

WebUI.click(findTestObject('Object Repository/Eclr_Home/Page_Documents to Review/a_POC_test'))

WebUI.click(findTestObject('Object Repository/Eclr_Home/Page_eClearance - Document Review/span_Description  Regulatory Info'))

WebUI.click(findTestObject('Object Repository/Eclr_Home/Page_eClearance - Document Review/img'))

WebUI.setText(findTestObject('Object Repository/Eclr_Home/Page_eClearance - Document Review/textarea_m'), 'sssssssssssssssss')

WebUI.click(findTestObject('Object Repository/Eclr_Home/Page_eClearance - Document Review/input_ Required Information_updateButton'))

WebUI.click(findTestObject('Object Repository/Eclr_Home/Page_eClearance - Document Review/img_2'))

WebUI.click(findTestObject('Object Repository/Eclr_Home/Page_eClearance - Document Review/input_Note to pause your review click Save for Later_NextButton'))

WebUI.setText(findTestObject('Object Repository/Eclr_Home/Page_eClearance - Document Review/textarea__comments'), 'jjkj')

WebUI.click(findTestObject('Object Repository/Eclr_Home/Page_eClearance - Document Review/input__checkinoption'))

WebUI.click(findTestObject('Object Repository/Eclr_Home/Page_eClearance - Document Review/input_ Required        Information_NextButton'))

WebUI.click(findTestObject('Object Repository/Eclr_Home/Page_eClearance - Document Review/input_Approve the document_rev'))

WebUI.click(findTestObject('Object Repository/Eclr_Home/Page_eClearance - Document Review/input__radiodisapproveOptions'))

WebUI.click(findTestObject('Object Repository/Eclr_Home/Page_eClearance - Document Review/input_NOTE_NextButton'))

WebUI.click(findTestObject('Object Repository/Eclr_Home/Page_eClearance - Document Review/a_Save For Later'))

WebUI.click(findTestObject('Object Repository/Eclr_Home/Page_eClearance - Document Review/img_View the Awaiting My Review List_CloseButton'))

WebUI.closeBrowser()

