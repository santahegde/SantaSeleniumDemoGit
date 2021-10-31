package com.practice.Interview.Tests;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.practice.Interview.Constants.Urls;
import com.practice.Interview.Helper.LoginHelper;
import com.practice.Interview.Helper.TestBase;
import com.practice.Interview.Pages.LinkedInLoginPage;

public class LinkedLoginTest extends TestBase {
	@Test
	private void testLinkedInWithWrongPassword()  {
		LoginHelper loginHelper = new LoginHelper();
		loginHelper.loginWithUserNameAndPassword();
		driver.navigate ().refresh ();
		Assert.assertEquals(driver.getTitle(), "LinkedIn Login, Sign in | LinkedIn");
	


//		LinkedInLoginPage loginPage = new LinkedInLoginPage();
//		driver.get(Urls.loginUrl);
//		
//		loginPage.username.sendKeys("heggar@yahoo.com");
//		loginPage.passwrod.sendKeys("kelaginmannige");
//		loginPage.loginButton.click();
//		Assert.assertTrue(linkedInLoginPage.userNameErrorMessage.isDisplayed());
//		System.out.println("Test executed successfully");
//		System.out.println("Closing browser in next 10 seconds");
//		Thread.sleep(10000);
	}

//	@Test
//	private void openForgotPasswordLinkInNewWindow() throws InterruptedException {
//		LinkedInLoginPage loginPage = new LinkedInLoginPage();
//		Actions actions = new Actions(driver);
//		driver.get(Urls.loginUrl);
//		Thread.sleep(10000);
//		actions.keyDown(Keys.CONTROL).perform();
//		loginPage.forgotPasswordLink.click();
//		String parentWindowHandle = driver.getWindowHandle();
//		Set<String> handles = driver.getWindowHandles();
//		Assert.assertEquals(handles.size(), 2);
//		loginPage.joinNowLink.click();
//		handles = driver.getWindowHandles();
//		Assert.assertEquals(handles.size(), 3);
//		actions.keyUp(Keys.CONTROL).perform();
////		Iterator<String> handleIterator = handles.iterator();
////		while (handleIterator.hasNext()) {
////			String handle = handleIterator.next();
////			driver.switchTo().window(handle);
////			// This if loop executes only for child windows
////			if(!handle.equals(parentWindowHandle))	{
////				System.out.println(driver.getTitle());
////			}
////			
////		}
//		for(String handle : handles) {
//			if(parentWindowHandle != handle)	{
//				System.out.println(driver.getTitle());
//			}
//		}
//		
//		driver.switchTo().window(parentWindowHandle);
//		loginPage.username.sendKeys("santalogicworked");
//	}

	@AfterMethod
	private void afterMethod() {
		driver.quit();
	}
}
