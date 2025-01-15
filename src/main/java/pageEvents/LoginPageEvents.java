package pageEvents;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import base.BaseTest;
import pageObjects.LoginPageElements;
import utils.ElementFetch;
import utils.ExcelUtil;

public class LoginPageEvents extends BaseTest{

	ElementFetch ele= new ElementFetch();
	public void loginloaded ()
	{
		Assert.assertTrue(ele.getWebEements("XPATH", LoginPageElements.Email).size()>0, "Elememt not found");

	}
	public void entercredentials( ) throws AWTException, InterruptedException

	{
		ele.getWebEement("XPATH",LoginPageElements.Email).sendKeys("akshay.bashetti@hudini.io");
		ele.getWebEement("XPATH",LoginPageElements.Password).sendKeys("Testing@123");
		ele.getWebEement("XPATH",LoginPageElements.LoginButton).click();
		for(int i=1;i<=3;i++)
		{
			ele.getWebEement("XPATH", LoginPageElements.Buttonclick).click();

		}
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ele.getWebEement("XPATH",LoginPageElements.designconfigsection).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ele.getWebEement("XPATH", LoginPageElements.addbutton).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//ele.getWebEement("ID",LoginPageElements.name).sendKeys(ExcelUtil.fetchData("Brand", 2, 2));
		//ElementActions.sendKeysElement(LoginPageElements.name, ExcelUtil.fetchData("Hotel", 2, 2));
		//ele.getWebEement("ID", LoginPageElements.name).sendKeys( ExcelUtil.fetchData("Sheet1", 1, 1));

		ele.getWebEement("ID", LoginPageElements.name).sendKeys("test27");
		ele.getWebEement("XPATH", LoginPageElements.add).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ele.getWebEement("XPATH", LoginPageElements.search).sendKeys("test27");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ele.getWebEement("XPATH", LoginPageElements.tag).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ele.getWebEement("XPATH", LoginPageElements.arrow).click();
		//1st component
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//WebElement source = driver.findElement(By.xpath("//div[@id='basicComponentcontent']//div[contains(@class,'align-items-center justify-content-center')]"));
		//WebElement target = driver.findElement(By.xpath("//div[contains(@class,'d-flex align-items-center justify-content-center h-100')]"));
		WebElement source = ele.getWebEement("XPATH", LoginPageElements.drag1);
		WebElement target = ele.getWebEement("XPATH", LoginPageElements.target1);

		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();


		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ele.getWebEement("XPATH", LoginPageElements.paddingbtntop).sendKeys("1");
		ele.getWebEement("XPATH", LoginPageElements.paddingbtnbottem).sendKeys("1");
		ele.getWebEement("XPATH", LoginPageElements.H1dropdown).click();
		ele.getWebEement("XPATH", LoginPageElements.Visibletext).click();
		ele.getWebEement("XPATH", LoginPageElements.inputtext).sendKeys("testcomponent");
		ele.getWebEement("XPATH", LoginPageElements.Comonentcolapse).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//2nd component
		ele.getWebEement("XPATH", LoginPageElements.Carousalscontent).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//WebElement source1 = driver.findElement(By.xpath("//div[contains(text(),'6 - Large IMG w/Carousel')]"));
		//WebElement target1 = driver.findElement(By.xpath("//div[@class='droppable page-builder-space']"));
		WebElement source1 = ele.getWebEement("XPATH", LoginPageElements.drag2);
		WebElement target1 = ele.getWebEement("XPATH", LoginPageElements.target2);

		Actions actions1 = new Actions(driver);
		actions1.dragAndDrop(source1, target1).perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ele.getWebEement("XPATH", LoginPageElements.Hotelmoduledropdown).click();
		ele.getWebEement("XPATH", LoginPageElements.Visibletext1).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ele.getWebEement("XPATH", LoginPageElements.hotelcomadium).click();
		ele.getWebEement("XPATH", LoginPageElements.visibletext3).click();
		//ele.getWebEement("XPATH", null)

		//WebElement uploadElement1 = driver.findElement(By.xpath("//div[@class='mb-4 mt-4']//div[@class='d-flex align-items-center img-select justify-content-center']"));
		WebElement uploadElement1 = ele.getWebEement("XPATH", LoginPageElements.uploadelement1);
		uploadElement1.click();
		Robot robot = new Robot();
		robot.delay(2000);
		String filePath = "C:\\Users\\AkshayBashetti\\OneDrive - Mankara PTE LTD\\Desktop\\test\\large.jpg"; // Use the absolute path or create a relative path
		StringSelection stringSelection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//WebElement uploadElement2 = driver.findElement(By.xpath("(//div[@class='d-flex align-items-center img-select justify-content-center'])[2]"));
		WebElement uploadElement2 = ele.getWebEement("XPATH", LoginPageElements.uploadelement2);
		uploadElement2.click();
		Robot robot1 = new Robot();
		robot1.delay(2000);
		String filePath1 = "C:\\Users\\AkshayBashetti\\OneDrive - Mankara PTE LTD\\Desktop\\test\\large2.jpg"; // Use the absolute path or create a relative path
		StringSelection stringSelection1 = new StringSelection(filePath1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ele.getWebEement("XPATH", LoginPageElements.selectredirect).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ele.getWebEement("XPATH", LoginPageElements.slid2).click();
		ele.getWebEement("XPATH", LoginPageElements.slidremove2).click();
		ele.getWebEement("XPATH", LoginPageElements.slid3).click();
		ele.getWebEement("XPATH", LoginPageElements.slide3remove).click();
		ele.getWebEement("XPATH", LoginPageElements.slid4).click();
		ele.getWebEement("XPATH", LoginPageElements.slide4remove).click();
		ele.getWebEement("XPATH", LoginPageElements.colapse).click();


		//3rd component
		ele.getWebEement("XPATH", LoginPageElements.ImageComponents).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//WebElement source2 = driver.findElement(By.xpath("//div[contains(text(),'15 - Large Image')]"));
		//WebElement target2 = driver.findElement(By.xpath("//div[@class='page-builder-scroll scroll-styled']"));
		WebElement source2 = ele.getWebEement("XPATH", LoginPageElements.drag3);
		WebElement target2 = ele.getWebEement("XPATH", LoginPageElements.target3);

		Actions actions2 = new Actions(driver);
		actions2.dragAndDrop(source2, target2).perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//WebElement uploadElement3 = driver.findElement(By.xpath("(//div[contains(@class,'d-flex align-items-center img-select justify-content-center')])[1]"));
		WebElement uploadElement3 = ele.getWebEement("XPATH", LoginPageElements.uploadelement3);
		uploadElement3.click();
		Robot robot2 = new Robot();
		robot2.delay(2000);
		String filePath2 = "C:\\Users\\AkshayBashetti\\OneDrive - Mankara PTE LTD\\Desktop\\test\\test3.jpg"; // Use the absolute path or create a relative path
		StringSelection stringSelection2 = new StringSelection(filePath2);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection2, null);
		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ele.getWebEement("XPATH", LoginPageElements.collapse3).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement scroll = ele.getWebEement("XPATH", LoginPageElements.Save);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		js.executeScript("arguments[0].scrollTop = arguments[0].scrollIntoView(true);", scroll);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ele.getWebEement("XPATH", LoginPageElements.Save).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("page created");
	}


	public void designconfigupdate1() throws AWTException
	{
		ele.getWebEement("XPATH",LoginPageElements.Email).sendKeys("akshay.bashetti@hudini.io");
		ele.getWebEement("XPATH",LoginPageElements.Password).sendKeys("Testing@123");
		ele.getWebEement("XPATH",LoginPageElements.LoginButton).click();
		for(int i=1;i<=3;i++)
		{
			ele.getWebEement("XPATH", LoginPageElements.Buttonclick).click();

		}
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		ele.getWebEement("XPATH",LoginPageElements.designconfigsection).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ele.getWebEement("XPATH", LoginPageElements.search).sendKeys( ExcelUtil.fetchData("Sheet1", 1, 1));
		//ele.getWebEement("XPATH", LoginPageElements.search).sendKeys("test27");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ele.getWebEement("XPATH", LoginPageElements.tag).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//ele.getWebEement("XPATH", LoginPageElements.inputtext).sendKeys( ExcelUtil.fetchData("Sheet1", 1, 1));
		ele.getWebEement("XPATH", LoginPageElements.inputtext).sendKeys("12");
		ele.getWebEement("XPATH", LoginPageElements.collapse4).click();
		ele.getWebEement("XPATH", LoginPageElements.collapse5).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//WebElement uploadElement3 = driver.findElement(By.xpath("(//div[contains(@class,'d-flex align-items-center img-select justify-content-center')])[1]"));
		WebElement uploadElement3 = ele.getWebEement("XPATH", LoginPageElements.uploadelement3);
		uploadElement3.click();
		Robot robot3 = new Robot();
		robot3.delay(2000);
		String filePath3 = "C:\\Users\\AkshayBashetti\\OneDrive - Mankara PTE LTD\\Desktop\\test\\test6.jpg"; // Use the absolute path or create a relative path
		StringSelection stringSelection2 = new StringSelection(filePath3);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection2, null);
		robot3.keyPress(KeyEvent.VK_CONTROL);
		robot3.keyPress(KeyEvent.VK_V);
		robot3.keyRelease(KeyEvent.VK_V);
		robot3.keyRelease(KeyEvent.VK_CONTROL);
		robot3.keyPress(KeyEvent.VK_ENTER);
		robot3.keyRelease(KeyEvent.VK_ENTER);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ele.getWebEement("XPATH", LoginPageElements.collapse6).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement scroll = ele.getWebEement("XPATH", LoginPageElements.Save);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		js.executeScript("arguments[0].scrollTop = arguments[0].scrollIntoView(true);", scroll);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ele.getWebEement("XPATH", LoginPageElements.Save).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("page is updated successfully");
		//logger.info("page updated")	;
	}
}

