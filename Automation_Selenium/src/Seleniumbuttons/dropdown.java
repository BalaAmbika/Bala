package Seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab=new ChromeDriver();
		ab.get("http:\\www.letskodeit.com/practice");
		
		WebElement ele=ab.findElementById("carselect");
		Select s=new Select(ele);
		//s.selectByIndex(1);
		//s.selectByValue("benz");
		//s.selectByVisibleText("Benz");
		
		s.selectByValue("Honda");
		

	}

}
