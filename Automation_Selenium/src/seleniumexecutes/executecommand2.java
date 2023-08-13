package seleniumexecutes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class executecommand2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab=new ChromeDriver();
		ab.get("http:\\www.mycontactform.com");
		
		//alert:
		//ab.executeScript("alert ('Time out')");
		ab.executeScript("window.confirm('Time out')");
		Thread.sleep(3000);
		
		Alert al = ab.switchTo().alert();
		//al.accept();
		al.dismiss();
	     
		Thread.sleep(3000);
		ab.quit();
		
		

	}

}
