package test.com.launchbrowser;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class NewTest1 extends BaseTest {
	ElementFetch ele= new ElementFetch();
	LoginPageEvents loginPage= new LoginPageEvents();


  @Test(priority = 1, enabled = true)
  //dataProvider="logindata",dataProviderClass=ExcelReader.class
  public void loginsuccessfuly() throws AWTException, InterruptedException
  {
	  logger.info("creating disign config page");
	  loginPage.entercredentials();
	  logger.info("disign config page created");

  }
  
  @Test(priority = 2, enabled = true)
  public void designconfigupdate() throws AWTException
  {
	  logger.info("updating disign config page");
	  loginPage.designconfigupdate1();
	  logger.info("disign config page updated");
  }
}

