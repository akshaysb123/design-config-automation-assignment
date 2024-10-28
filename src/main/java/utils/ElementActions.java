package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;
import commons.Constants;




public class ElementActions extends BaseTest {

	public static WebDriver driver;
	WebElement element = null;
	Actions actions;

	public ElementActions(WebDriver driver) {
		ElementActions.driver = driver;
		this.actions = new Actions(driver);
	}

	public void navigateToPage(By selector) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(selector);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		element1.click();
	}

	public void clickUsingJS() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Specify the XPath of the element you want to interact with
		String xpath = "//div[@id='brand_select']"; // Replace with your actual XPath

		System.out.println("Hi1");

		// Find the element using JavaScript and store it in a variable
		String script = "return document.evaluate('" + xpath
				+ "', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;";
		WebElement element = (WebElement) js.executeScript(script);

		System.out.println("Hi2");

		// Now, you can interact with the element, for example, click it
		element.click();

		System.out.println("Hi3");

	}

	public WebElement getElement(By selector) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.DEFAULT_EXPLICIT_WAIT));
			wait.until(ExpectedConditions.presenceOfElementLocated(selector));

			element = driver.findElement(selector);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}

	public WebElement waitToFindElement(By selector) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.DEFAULT_EXPLICIT_WAIT));
			wait.until(ExpectedConditions.elementToBeClickable(selector));

			element = driver.findElement(selector);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}

	public boolean checkIfElementIsPresent(By selector) {

		boolean displayValue = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.DEFAULT_EXPLICIT_WAIT));
			wait.until(ExpectedConditions.presenceOfElementLocated(selector));

			element = driver.findElement(selector);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (element.isDisplayed()) {
			displayValue = true;
		}

		return displayValue;
	}

	public void sendKeysElement(By selector, String value) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.DEFAULT_EXPLICIT_WAIT));
			wait.until(ExpectedConditions.presenceOfElementLocated(selector));
			getElement(selector).sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
















