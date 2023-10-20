package com.newpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Github_Baseclass {
	
	public static AndroidDriver driver;

	

	public static void login_normal() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");// Version is number here
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 6 Pro API 28");
		dc.setCapability("appPackage", "com.mythings.app");
		dc.setCapability("appActivity", "com.mythings.app.MainActivity");

		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		dc.setCapability(MobileCapabilityType.FULL_RESET, false);

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, dc);

	}

	public static void update() throws InterruptedException {

		Thread.sleep(35000);
		WebElement update_MayBeLater = driver
				.findElement(By.xpath("//android.widget.Button[@content-desc=\"Maybe Later\"]"));
		update_MayBeLater.click();
	}
	
	public static void add_transport() throws InterruptedException {

		Thread.sleep(40000);
		WebElement Plus_button2 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		Plus_button2.click();

		Thread.sleep(2500);
		WebElement Add_Item_3 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Add Item\"]"));
		Add_Item_3.click();
		Thread.sleep(5000);
		WebElement transport = driver.findElement(By.xpath(
				"//android.view.View[@content-desc=\"Select Category\"]/android.widget.ScrollView/android.view.View/android.view.View/android.view.View[1]"));
		transport.click();

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"(//android.view.View[@content-desc=\"Add Item\"])[1]/android.widget.ScrollView/android.widget.ImageView[1]"))
				.click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Upload\"]")).click();
		Thread.sleep(4000);

//	WebElement three_dots = driver
//			.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Show roots\"]"));
//
//	three_dots.click();
		Thread.sleep(4000);
		WebElement downloads = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ImageView[1]"));
		downloads.click();

//	Thread.sleep(4000);
//	driver.findElement(By.id("com.android.documentsui:id/icon_thumb")).click();

		Thread.sleep(10000);
		WebElement Properties_Name = driver.findElement(By.xpath(
				"(//android.view.View[@content-desc=\"Add Item\"])[1]/android.widget.ScrollView/android.widget.EditText[1]"));
		Properties_Name.click();
		Thread.sleep(3000);
		Properties_Name.sendKeys("VAN");

		Thread.sleep(10000);
		WebElement Description = driver.findElement(By.xpath(
				"(//android.view.View[@content-desc=\"Add Item\"])[1]/android.widget.ScrollView/android.widget.EditText[2]"));
		Description.click();
		Thread.sleep(3000);
		Description.sendKeys("It is four wheeler");

		Thread.sleep(5000);
		WebElement select_for_tag = driver.findElement(
				By.xpath("(//android.view.View[@content-desc=\"Add Item\"])[1]/android.widget.ScrollView"));
		select_for_tag.click();

		Thread.sleep(5000);
		WebElement additem = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Add New\"]"));
		additem.click();

		Thread.sleep(9000);
		WebElement tag = driver.findElement(By.xpath(
				"(//android.view.View[@content-desc=\"Add Item\"])[1]/android.widget.ScrollView/android.view.View[5]"));
		tag.click();

		Thread.sleep(4500);
		Actions actions = new Actions(driver);
		actions.sendKeys(tag, "#Van").sendKeys(Keys.ENTER).perform();

		Thread.sleep(5500);
		WebElement Add_Item = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Add Item\"])[2]"));
		Add_Item.click();

		Thread.sleep(2000);
		WebElement Done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
		Done.click();

		Thread.sleep(5500);
		WebElement profile = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]"));
		profile.click();

		Thread.sleep(1000);
		driver.navigate().back();
		
		System.out.println("ADD TRANSPORT COMPLETED");

	}

	
	
	

}
