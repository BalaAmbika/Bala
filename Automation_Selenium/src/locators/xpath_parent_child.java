package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_parent_child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab=new ChromeDriver();
		ab.get("http:\\www.mycontactform.com");
		//parent
		//child
		 
		//  parent=> child 
				ab.findElementByXPath("//*[@id=\"right_col_bottom\"]//child::p[4]").click();
		 
		//  child=> parent
				ab.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[2]//parent::div");
				

	}

}
