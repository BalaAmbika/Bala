package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class Both_linktext_partiallinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.seleniumeasy.com/");
		
		//ob.findElementByLinkText("Maven").click();
		
		ob.findElementByPartialLinkText("je").click();

	}

}
