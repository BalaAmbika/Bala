package Seleniumbuttons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class pageload_timeout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	 
	    
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.get("http:\\www.google.com");
	    //https://demoqa.com
	    

	}

}
