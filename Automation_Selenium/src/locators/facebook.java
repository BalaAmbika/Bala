package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http:\\www.facebook.com");
		
		ob.findElementById("email").sendKeys("Bala123");
		
		ob.findElementByName("pass").sendKeys("12345678");
		
		ob.findElementByName("login").click();
		
		

	}

}
