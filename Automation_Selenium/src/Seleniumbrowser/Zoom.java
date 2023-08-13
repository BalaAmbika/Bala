package Seleniumbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver as=new ChromeDriver();
		as.get("http:\\www.amazon.com");
		
		as.executeScript("document.body.style.zoom='200%'");
		Thread.sleep(3000);
		
		as.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(3000);
		
		as.executeScript("document.body.style.zoom='20%'");
		Thread.sleep(3000);
		
		as.quit();
	}

}
