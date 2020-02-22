package com.trip.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trip.base.TestBase;
import com.trip.pages.ReviewPage;

public class ReviewTest extends TestBase {

	ReviewPage reviewPage;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		reviewPage = new ReviewPage();
		Thread.sleep(5000);
	}

	@Test
	public void verifyReview() throws InterruptedException {
		reviewPage.reviewDetails();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
