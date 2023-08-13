package Seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab=new ChromeDriver();
		ab.get("http:\\www.letskodeit.com/practice");
	
		//full page scrolling:
		ab.executeScript("window.Scrollby(0,document.body.ScrollHeight)");
		Thread.sleep(3000);
		ab.executeScript("window.Scrollby(0,-document.body.ScrollHeight)");
		Thread.sleep(3000);
		
		//page will scroll what you want to allow:
		ab.executeScript("window.Scrollby(0,500)");
		Thread.sleep(3000);
		ab.executeScript("window.Scrollby(0,-500)");
		Thread.sleep(3000);
		ab.quit();


	}

}
