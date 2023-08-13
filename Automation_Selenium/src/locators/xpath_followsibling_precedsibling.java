package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_followsibling_precedsibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab=new ChromeDriver();
		ab.get("http:\\www.mycontactform.com");
		
		//siblings
		
		 //sibings: child of same parent 
		ab.findElementByXPath("//*[@id='right_col_middle']//following-sibling::a").click();
		 String s = ab.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[2]//preceding-sibling::p").getText();
		System.out.println(s);

	}

}
