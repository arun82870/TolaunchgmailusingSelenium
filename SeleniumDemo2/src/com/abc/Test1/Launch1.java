// to open the gmail app and print the current url
package com.abc.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String url="http://www.gmail.com";// go to http://www.gmail.com
		driver.get(url);// open the link
		String curl=driver.getCurrentUrl();// what will current url open
		System.out.println(curl);// print the current urlk
		
		driver.close();// close the web 

	}

}