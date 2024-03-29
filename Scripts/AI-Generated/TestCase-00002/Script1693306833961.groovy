import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page_home click on hyperlink_172_trien_khai_du_an_dai_hoc_khong_rac_t --> navigate to Page_trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien_'

testObj = findTestObject('Object Repository/Page_home/hyperlink_172_trien_khai_du_an_dai_hoc_khong_rac_t')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien_ click on hyperlink_172_trien_khai_du_an_dai_hoc_khong_rac_t'

testObj = findTestObject('Object Repository/Page__trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien/hyperlink_172_trien_khai_du_an_dai_hoc_khong_rac_t')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/.*/.*/trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: Add visual checkpoint at Page_trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien_'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00002_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
