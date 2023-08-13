package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class m1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab=new ChromeDriver();
		ab.get("http:\\www.mycontactform.com");
		
		WebElement ele = ab.findElementByName("btnSubmit");
		Actions ac=new Actions(ab);
		//ac.click(ele).build().perform();
		//ac.doubleClick(ele).build().perform();
		//ac.contextClick(ele).build().perform();
		//ac.moveToElement(ele).build().perform();
		ac.clickAndHold(ele).build().perform();
		Thread.sleep(3000);
		ac.release(ele).build().perform();
		Thread.sleep(3000);
		ab.quit();
		
		
		
		

	}

}
