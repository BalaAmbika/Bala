package Seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab=new ChromeDriver();
		ab.get("http:\\www.letskodeit.com/practice");
		
		WebElement ele = ab.findElementById("multiple-select-example");
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("orange");
		s.selectByValue("peach");
		Thread.sleep(3000);
		
		s.deselectByIndex(2);
		Thread.sleep(3000);
		ab.quit();
		
		

	}

}
