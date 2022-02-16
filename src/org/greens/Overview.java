package org.greens;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.HttpScheme;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Overview {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\TextGreens\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> linkscount = driver.findElements(By.tagName("a"));
		int size = linkscount.size();
		System.out.println(size);
		int brokencount=0;
		for (int i = 0; i <linkscount.size(); i++) {
			WebElement link  = linkscount.get(i);
			String attribute = link.getAttribute("href");
			URL url = new URL(attribute);
			URLConnection connection = url.openConnection();
			HttpsURLConnection urlConnection =(HttpsURLConnection) connection;
			Thread.sleep(5000);
			//urlConnection.connect();
			int responseCode = urlConnection.getResponseCode();
			if(responseCode!=200) {
				System.out.println(attribute);
				brokencount++;
			}	
		}
		System.out.println("Broken Link count :" +brokencount);


	}}