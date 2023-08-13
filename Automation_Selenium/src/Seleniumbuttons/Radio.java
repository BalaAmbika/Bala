package Seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab=new ChromeDriver();
		ab.get("http:\\www.letskodeit.com/practice");

		ab.findElementById("bmwradio").click();
		Thread.sleep(3000);
		ab.findElementById("benzradio").click();
		Thread.sleep(3000);
		ab.findElementById("hondaradio").click();
		Thread.sleep(3000);
		ab.quit();

	}

}
