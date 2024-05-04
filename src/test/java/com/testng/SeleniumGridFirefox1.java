package com.testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridFirefox1 {

	@Test
	public void test3() throws MalformedURLException
	{
		FirefoxOptions options = new FirefoxOptions();
        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, options);
        driver.get("https://www.redbus.in/");
        System. out.println("Title: " + driver.getTitle());
        driver.quit();
	}
}
