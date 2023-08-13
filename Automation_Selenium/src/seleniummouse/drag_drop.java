package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab=new ChromeDriver();
		ab.get("https://jqueryui.com/droppable/");
		
		ab.switchTo().frame(0);
		Actions ac=new Actions(ab);
		WebElement el = ab.findElementById("draggable");
		WebElement el1 = ab.findElementById("droppable");
		ac.dragAndDrop(el, el1).build().perform();

	}

}
