package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_following_preceding {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab=new ChromeDriver();
		ab.get("http:\\www.mycontactform.com");
		//following
		//preceding
		
		//syntax://*[@loc/attribte='value']
				// username=> pass
				ab.findElementByXPath("//*[@id='user']//following::input").sendKeys("hi");
				//pass=> user
				ab.findElementByXPath("//*[@id='pass']//preceding::input").sendKeys("hello");
				

	}

}
