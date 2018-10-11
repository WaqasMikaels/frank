package mikaels.frank;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mikaels.frank.baseclass.BaseUi;
import mikaels.frank.resources.DSLLibDesktop;

public class ProgrammaticNetworksCampaignCreation {
	DSLLibDesktop dsl;
	  //public String xPath = "D:/Excels/MyExcel.xls";
	  //public String xPath = "D:/Excels/MyFirstExcel.xlsx";
	  //public String xlPath_Res = "D:/Excels/userStatuses.xlsx";
	  //public static String XData[][];
	  //public String xlData[][];
	  

	  @BeforeClass
	  public void beforeClass() throws Exception {
		  	dsl = new DSLLibDesktop();
			//dsl.launchCubixCo();
		  	//dsl.launchGoogle();
		  	//dsl.xlRead(xPath);
		  	dsl.launchFrank();
	  }
	  
	  @Test
	  public void Test01_Verify_Frank_Title() {
		  dsl.programmaticnetworkscampaigncreation.CheckFrankTitle();
	  }
	  
	  @Test
	  public void Test02_Perform_Signin() {
		  dsl.programmaticnetworkscampaigncreation.EnterEmailAddress();
		  dsl.programmaticnetworkscampaigncreation.EnterPassword();
		  dsl.programmaticnetworkscampaigncreation.ClickSignin();
	  }
	  
	  @Test
	  public void Test03_Verify_Signin() {
		  dsl.programmaticnetworkscampaigncreation.VerifyLogin();
	  }
	  
	  @Test
	  public void Test04_Click_Create_Campaign() {
		  dsl.programmaticnetworkscampaigncreation.ClickCreateCampaign();
	  }
	  
	  @Test
	  public void Test05_Campaign_Setup_Step() {
		  dsl.programmaticnetworkscampaigncreation.EnterCampaignName();
		  dsl.programmaticnetworkscampaigncreation.SelectChannels();
		  dsl.programmaticnetworkscampaigncreation.LinkGoogleAnalyticsAccount();
	  }
	  
	  @Test
	  public void Test06_Select_Location() {
		  dsl.programmaticnetworkscampaigncreation.SelectLocation();
	  }
	  
	  @Test
	  public void Test07_Click_Save_And_Continue() {
		  dsl.programmaticnetworkscampaigncreation.ClickSaveAndContinue();
	  }
	  
	  @Test
	  public void Test08_Select_Age_Group() {
		  dsl.programmaticnetworkscampaigncreation.ClickAgeGroup();
	  }
	  
	  @Test
	  public void Test09_Select_Target_Language_Speakers() {
		  dsl.programmaticnetworkscampaigncreation.ClickLanguage();
	  }
	 
	  @Test
	  public void Test10_Select_Specific_Interest() {
		  dsl.programmaticnetworkscampaigncreation.ClickInterest();
	  }
	  
	  @Test
	  public void Test11_Upload_1000_Contacts_txt_or_csv() throws IOException {
		  dsl.programmaticnetworkscampaigncreation.SelectEmailList();
	  }
	  
	  @Test
	  public void Test12_Click_Save_And_Continue2() {
		  dsl.programmaticnetworkscampaigncreation.ClickSaveAndContinue2();
	  }
	  
	  @Test
	  public void Test13_Click_Create_Adwords_Ad() {
		  dsl.programmaticnetworkscampaigncreation.ClickUploadAdwordsAd();
	  }
	  
	  @Test
	  public void Test14_Fill_Fb_Ad_Form() {
		  dsl.programmaticnetworkscampaigncreation.EnterWebsiteLink();
	  }
	  
	  @Test
	  public void Test15_Upload_Banners() throws IOException {
		  dsl.programmaticnetworkscampaigncreation.UploadBanners();
	  }
	  
	  @Test
	  public void Test16_Click_Continue_To_Billing() {
		  dsl.programmaticnetworkscampaigncreation.ClickContinueToBilling();
	  }
	  
	  @Test
	  public void Test17_Select_End_Date() {
		  dsl.programmaticnetworkscampaigncreation.SelectEndDate();
	  }
	  
	  @Test
	  public void Test18_Create_Campaign_And_Verify() {
		  dsl.programmaticnetworkscampaigncreation.VerifyCampaignCreatedSuccessMessage();
	  }
	  
	  @AfterClass
	  public void afterClass() throws Exception {
		  dsl.closeBrowser();
		  //xlwrite(xlPath_Res, XData);//Writes the results
		  //BaseUi.xlwrite(xlPath_Res, XData);
		  
	  }
}
