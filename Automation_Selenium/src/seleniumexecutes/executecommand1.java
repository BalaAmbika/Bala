package seleniumexecutes;

import org.openqa.selenium.chrome.ChromeDriver;

public class executecommand1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver as=new ChromeDriver();
		as.get("http:\\www.google.com");

		System.out.println(as.executeScript("return document.title"));
		System.out.println(as.executeScript("return document.URL"));
		
		as.quit();
		
	}

}
