package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class mycontactform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab=new ChromeDriver();
		ab.get("http:\\www.mycontactform.com");
		
		ab.findElementById("user").sendKeys("DhivyaKarthi123");
		
		ab.findElementByName("pass").sendKeys("12345");
		
		ab.findElementByClassName("btn_log").click();
	}

}
