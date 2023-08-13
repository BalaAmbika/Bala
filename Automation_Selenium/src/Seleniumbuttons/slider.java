package Seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
	    //classname objectnmae= new classname();
			ChromeDriver ob= new ChromeDriver();
			ob.get("https://jqueryui.com/slider/");
			// horizontal slider: move along xaxis , y value will be 0
			// vertical slider : move along yy axis, x value will be o
			ob.switchTo().frame(0);
			Actions ac= new Actions(ob);
			WebElement ele = ob.findElementById("slider");
			ac.dragAndDropBy(ele, 60, 0).build().perform();

	}

}
