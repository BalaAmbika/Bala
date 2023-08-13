package Seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver as=new ChromeDriver();
		as.get("http:\\www.google.com");
		
		as.manage().deleteAllCookies();
		Set<Cookie>s=as.manage().getCookies();
		System.out.println("Number of cookies "+s.size());
		
		as.quit();
		
		

	}

}
