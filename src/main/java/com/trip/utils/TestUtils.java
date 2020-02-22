package com.trip.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.trip.base.TestBase;

public class TestUtils extends TestBase {

	public static void switchToNewWindow() {
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}

	public static void hoverElement(WebElement ele) {
		int width = ele.getSize().getWidth();
		Actions action1 = new Actions(driver);
		action1.moveToElement(ele).moveByOffset((width / 2) - 2, 0).click().perform();

	}
}
