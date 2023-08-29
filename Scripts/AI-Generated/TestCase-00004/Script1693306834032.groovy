import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_gioi-thieu-ve-an-tho-raw-foods-diet-va-phan-biet-raw-vegan-voi-fruitarian'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/2021/10/gioi-thieu-ve-an-tho-raw-foods-diet-va-phan-biet-raw-vegan-voi-fruitarian')

'step 2: Add visual checkpoint at Page_gioi-thieu-ve-an-tho-raw-foods-diet-va-phan-biet-raw-vegan-voi-fruitarian'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00004_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
