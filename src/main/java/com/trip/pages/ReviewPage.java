package com.trip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trip.base.TestBase;
import com.trip.utils.TestUtils;

public class ReviewPage extends TestBase {

	@FindBy(xpath = "//div[@id=\"taplc_global_nav_component_0\"]/div//div[@class=\"i3bZ_gBa _2vChPWwI _1KTTRnER\"]/form/input[1]")
	WebElement search;

	@FindBy(xpath = "//div[@id=\"taplc_global_nav_component_0\"]/div//div[@class=\"i3bZ_gBa _2RTs3_Ee _2vChPWwI _1KTTRnER\"]/form/input[1]")
	WebElement insideSearch;

	@FindBy(xpath = "//div[@id=\"taplc_global_nav_component_0\"]/div//div[@class=\"i3bZ_gBa _2RTs3_Ee _2vChPWwI _1KTTRnER\"]//span[@class=\"_2LyoLJ4U _2HBN-k68\"]")
	WebElement btn;

	@FindBy(xpath = "(//div[@class=\"result-title\"])[1]")
	WebElement firstTitle;

	@FindBy(xpath = "//div[@class=\"hotels-community-content-common-ContextualCTA__currentOption--3Wd5D\"]/a")
	WebElement writeReviewBtn;

	@FindBy(id = "ReviewTitle")
	WebElement ReviewTitle;

	@FindBy(id = "ReviewText")
	WebElement ReviewText;

	@FindBy(id = "bubble_rating")
	WebElement rating;

	@FindBy(id = "qid12_bubbles")
	WebElement service;

	@FindBy(id = "qid13_bubbles")
	WebElement Location;

	@FindBy(id = "qid14_bubbles")
	WebElement Value;

	@FindBy(id = "SUBMIT")
	WebElement submitBtn;

	public ReviewPage() {
		PageFactory.initElements(driver, this);
	}

	public void reviewDetails() throws InterruptedException {

		search.sendKeys(Keys.SPACE);
		insideSearch.sendKeys("Club Mahindra");
		btn.click();
		firstTitle.click();
		TestUtils.switchToNewWindow();
		writeReviewBtn.click();
		TestUtils.switchToNewWindow();
		Thread.sleep(5000);

		TestUtils.hoverElement(rating);

		ReviewTitle.sendKeys("awesome place");

		ReviewText.sendKeys("place");

		TestUtils.hoverElement(service);
		TestUtils.hoverElement(Location);
		TestUtils.hoverElement(Value);

		submitBtn.click();

	}

}
