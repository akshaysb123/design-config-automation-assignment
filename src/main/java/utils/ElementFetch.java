package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementFetch {
	public WebElement getWebEement(String indentifierType,String identifierValue)
	{
		switch(indentifierType) {
		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(identifierValue));
		case "ID":
			return BaseTest.driver.findElement(By.id(identifierValue));
		case "CLASS":
			return BaseTest.driver.findElement(By.className(identifierValue));

			default:
				return null;

		}
	}
	public List<WebElement> getWebEements(String indentifierType,String identifierValue)
	{
		switch(indentifierType) {
		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(identifierValue));
		case "ID":
			return BaseTest.driver.findElements(By.id(identifierValue));
		case "CLASS":
			return BaseTest.driver.findElements(By.className(identifierValue));

			default:
				return null;

		}
	}
}
