package seleniumexecutes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver as=new ChromeDriver();
		as.get("http:\\www.facebook.com");
		
		//as.executeScript("alert ('Time over')");
		as.executeScript("window.confirm ('Time over')" );
		Thread.sleep(3000);
		
		Alert al = as.switchTo().alert();
		al.accept();
		Thread.sleep(3000);
		as.quit();
		
	}

}
