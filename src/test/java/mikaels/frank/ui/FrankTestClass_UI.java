package mikaels.frank.ui;

import junit.framework.Assert;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import mikaels.frank.baseclass.BaseUi;


public class FrankTestClass_UI extends BaseUi {
	WebDriver driver;
	

	public FrankTestClass_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css = "[id = 'hplogo']")
	private WebElement googleTitle;
	
	@FindBy(name = "email")
	private WebElement txtEmailAddress;
	
	@FindBy(css = "[id = 'password-input']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/form/div[5]/button")
	private WebElement btnSignin;
	
	@FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div[2]/div")
	private WebElement userName;
	
	@FindBy(css = "[class = 'ui secondary button']")
	private WebElement btnCreateCampaign;
	
	@FindBy(css = "[id = 'name']")
	private WebElement txtCampaignName;
	
	@FindBy(css = "[id = 'channels-facebook']")
	private WebElement chkbxChannelFacebook;
	
	@FindBy(css = "[id = 'channels-adwords']")
	private WebElement chkbxChannelAdwords;
	
	@FindBy(css = "[id = 'channels-rtb']")
	private WebElement chkbxChannelProgrammatic;
	
	@FindBy(xpath = "//*[@id=\"fb-pages\"]/div/input")
	private WebElement drdFacebookPages;
	
	@FindBy(xpath = "//*[@id=\"fb-pages\"]/div/div[2]/div[2]")
	private WebElement drdvalFirstFacebookPage;
	
	@FindBy(linkText = "Update accounts list")
	private WebElement btnGoogleAccounts;
	
	@FindBy(xpath = "//*[@id=\"locations-div\"]/div/div[1]")
	private WebElement drdLocation;
	
	@FindBy(xpath = "//*[@id=\"locations-div\"]/div/div[2]/div[1]")
	private WebElement drdvalFirstLocation;
	
	@FindBy(css = "[id = 'desktop']")
	private WebElement chkbxDeviceDesktop;
	
	@FindBy(css = "[id = 'mobile']")
	private WebElement chkbxDeviceMobile;
	
	@FindBy(css = "[id = 'save-objective']")
	private WebElement btnSaveAndContinue;
	
	@FindBy(css = "[id = 'gender-male']")
	private WebElement chkbxGenderMale;
	
	@FindBy(css = "[id = 'gender-female']")
	private WebElement chkbxGenderFemale;
	
	@FindBy(css = "[id = 'all-ages']")
	private WebElement chkbxAgeGroupAll;
	
	@FindBy(css = "[id = 'age-18-24']")
	private WebElement chkbxAgeGroup1824;
	
	@FindBy(css = "[id = 'age-25-34']")
	private WebElement chkbxAgeGroup2534;
	
	@FindBy(css = "[id = 'age-35-44']")
	private WebElement chkbxAgeGroup3544;
	
	@FindBy(css = "[id = 'age-45-54']")
	private WebElement chkbxAgeGroup4554;
	
	@FindBy(css = "[id = 'age-55-64']")
	private WebElement chkbxAgeGroup5564;
	
	@FindBy(css = "[id = 'age-65']")
	private WebElement chkbxAgeGroup65Plus;
	
	@FindBy(css = "[id = 'language-all']")
	private WebElement rbtnAny;
	
	@FindBy(css = "[id = 'language-specific']")
	private WebElement rbtnSpecific;
	
	@FindBy(xpath = "//*[@id=\"languages-field\"]/div/div[1]")
	private WebElement drdLanguageSpeakers;
	
	@FindBy(using = "[value = 'aar']")
	private WebElement drdvalAfar;
	
	@FindBy(xpath = "//*[@id=\"languages-field\"]/div/div[2]/div[1]")
	private WebElement drdvalFirstLanguage;
	
	@FindBy(css = "[class = 'twelve wide column']")
	private WebElement randomClick;
	
	@FindBy(xpath = "//*[@id=\"interests-field\"]/div[3]/div/input")
	private WebElement drdafSpecificInterest;
	
	@FindBy(xpath = "//*[@id=\"interests-field\"]/div[3]/div/div[1]")
	private WebElement drdbfSpecificInterest;
	
	@FindBy(xpath = "//*[@id=\"interests-field\"]/div[3]/div/div[2]/div[1]")
	private WebElement drdvalFirstInterest;
	
	@FindBy(xpath = "//*[@id=\"email-upload\"]/div/span/div/p[3]/span")
	private WebElement btnBrowseFiles;
	
	@FindBy(css = "[id = 'save-targets']")
	private WebElement btnSaveAndContinue2;
	
	@FindBy(xpath = "//*[@id=\"targets-language-div\"]/h2")
	private WebElement targetSpeakers;
	
	@FindBy(xpath = "//*[@id=\"interests-field\"]/div[1]/i")
	private WebElement infoIcon;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[4]/div[2]/div/div[3]/div/p/button")
	private WebElement uploadFbAd;
	
	@FindBy(css = "[id = 'post-input']")
	private WebElement txtPostText;
	
	@FindBy(css = "[id = 'headline-input']")
	private WebElement txtHeadline;
	
	@FindBy(css = "[id = 'intro-input']")
	private WebElement txtIntro;
	
	@FindBy(css = "[id = 'action-input']")
	private WebElement drdAction;
	
	@FindBy(css = "[id = 'website']")
	private WebElement txtWebLink;
	
	@FindBy(xpath = "//*[@id=\"upload-fb\"]/div/span/div/div")
	private WebElement btnUploadVisuals;
	
	@FindBy(css = "[class = 'ui purple button']")
	private WebElement btnSaveFbAd;
	
	@FindBy(css = "[id = 'save-creatives']")
	private WebElement btnContinue;
	
	@FindBy(css = "[id = 'end-date-input']")
	private WebElement txtEndDate;
	
	@FindBy(xpath = "//*[@id=\"checkout-form\"]/div[2]/div[2]/div[2]/div[1]/div[1]")
	private WebElement iconDateInfo;
	
	@FindBy(xpath = "//*[@id=\"checkout-form\"]/div[2]/div[2]/div[2]/div[4]/h2")
	private WebElement headingPaymentDetails;
	
	@FindBy (xpath = "//*[@id=\"checkout-form\"]/div[2]/div[2]/div[2]/div[6]/button")
	private WebElement btnSubmitCampaign;
	
	@FindBy (xpath = "//html/body/div[3]/div/div[1]/div[2]/div")
	private WebElement msgCampaignSuccess;
	
	public void CheckFrankTitle() {
		Assert.assertEquals("Frank.ai", driver.getTitle()); 
		// OR
		// isElementDisplayed(googleTitle);
	}
	
	public void EnterEmailAddress() {
		txtEmailAddress.sendKeys("waqas.ahmed@mikaels.com");
		hardwait(3);
	}
	
	public void EnterPassword() {
		txtPassword.sendKeys("Tiqaep5583");
		hardwait(3);
	}
	
	public void ClickSignin() {
		btnSignin.click();
		hardwait(5);
	}
	
	public void VerifyLogin() {
		isElementDisplayed(userName);
	}
	
	public void ClickCreateCampaign() {
		btnCreateCampaign.click();
		hardwait(5);
	}
	
	public void EnterCampaignName() {
		txtCampaignName.sendKeys("AutomationCampaign"+currentDate());
		hardwait(1);
	}
	
	public void SelectChannels() {
		//chkbxChannelFacebook.click();
		//hardwait(1);
		chkbxChannelAdwords.click();
		hardwait(1);
		chkbxChannelProgrammatic.click();
		hardwait(1);
	}
	
	public void SelectFacebookPage() {
		scrollDown(chkbxChannelFacebook);
		hardwait(3);
		drdFacebookPages.click();
		hardwait(1);
		drdvalFirstFacebookPage.click();
		hardwait(1);
	}
	
	public void SelectLocation() {
		scrollDown(btnGoogleAccounts);
		hardwait(3);
		drdLocation.click();
		hardwait(1);
		drdvalFirstLocation.click();
		hardwait(1);
	}
	
	public void SelectDevices() {
		chkbxDeviceDesktop.click();
		hardwait(1);
		chkbxDeviceMobile.click();
		hardwait(1);
	}
	
	public void ClickSaveAndContinue() {
		btnSaveAndContinue.click();
		hardwait(2);
	}
	
	//2. Select your audience
	
	public void ClickGender() {
		chkbxGenderFemale.click();
		hardwait(1);
		chkbxGenderMale.click();
		hardwait(1);
	}
	
	public void ClickAgeGroup() {
		chkbxAgeGroupAll.click();
		hardwait(1);
	}
	
	public void ClickLanguage() {
		rbtnAny.click();
		hardwait(1);
		/*rbtnSpecific.click();
		hardwait(1);
		scrollDown(chkbxAgeGroup4554);
		hardwait(1);
		drdLanguageSpeakers.click();
		hardwait(1);
		drdvalFirstLanguage.click();
		hardwait(1);*/
		
	}
	
	public void ClickInterest() {
		scrollDown(targetSpeakers);
		hardwait(3);
		clickUsingJS(drdbfSpecificInterest);
		hardwait(4);
		drdafSpecificInterest.sendKeys("Software");
		hardwait(3);
		drdvalFirstInterest.click();
		hardwait(1);
		infoIcon.click();
	}
	
	public void SelectEmailList() throws IOException {
		hardwait(3);
		btnBrowseFiles.click();
		hardwait(3);
		Runtime.getRuntime().exec("C:\\workspace\\codebase\\Fileupload.exe");
		hardwait(5);
	}
	
	public void ClickSaveAndContinue2() {
		scrollDown(btnBrowseFiles);
		btnSaveAndContinue2.click();
		hardwait(5);
	}
	
	public void ClickUploadFbAd() {
		uploadFbAd.click();
		hardwait(1);
	}
	
	public void EnterPostText() {
		txtPostText.sendKeys("This is from Post Text");
		hardwait(3);
	}
	
	public void EnterHeadline() {
		txtHeadline.sendKeys("THIS IS FROM HEADLINE");
		hardwait(3);
	}
	
	public void EnterIntroText() {
		txtIntro.sendKeys("This is from Intro Text");
		hardwait(3);
	}
	
	public void EnterWebsiteLink() {
		txtWebLink.sendKeys("http://www.mikaels.com/");
		hardwait(3);
	}
	
	public void UploadBanners() throws IOException {
		btnUploadVisuals.click();
		hardwait(3);
		Runtime.getRuntime().exec("C:\\workspace\\codebase\\Bannerupload.exe");
		hardwait(5);
		btnSaveFbAd.click();
	}
	
	public void ClickContinueToBilling() {
		hardwait(5);
		btnContinue.click();
	}
	
	public void SelectEndDate() {
		txtEndDate.click();
		hardwait(1);
		txtEndDate.sendKeys("10/1/2018");
		hardwait(1);
		iconDateInfo.click();
		scrollDown(headingPaymentDetails);
		btnSubmitCampaign.click();
		hardwait(10);
	}
	
	public void VerifyCampaignCreatedSuccessMessage() {
		hardwait(1);
		isElementDisplayed(msgCampaignSuccess);
	}
	
	/*public void CheckFooterCountryName() {
		isElementDisplayed(countryName);
		String footerCountryName = countryName.getText();
		if (footerCountryName.contentEquals("Pakistan")) {
			System.out.println("Country Name found");
		 
		}else {
			System.out.println("Country Name not found");
			
		}
	}*/
	
	
}
