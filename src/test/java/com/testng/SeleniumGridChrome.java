package com.testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridChrome {

	@Test
	public void test1() throws MalformedURLException
	{
		ChromeOptions options = new ChromeOptions();
        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, options);
        driver.get("https://www.amazon.in/");
        System. out.println("Title: " + driver.getTitle());
        driver.quit();
	}
}
