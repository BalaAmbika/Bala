package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class partial_linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http:\\www.facebook.com");
		
		//ob.findElementByLinkText("Forgotten password?").click();
		
		ob.findElementByPartialLinkText("Me").click();

	}

}
