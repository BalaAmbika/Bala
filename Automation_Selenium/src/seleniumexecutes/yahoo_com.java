package seleniumexecutes;

import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo_com {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver as=new ChromeDriver();
		as.get("http:\\www.yahoo.com");
		
		System.out.println(as.executeScript("return document.title"));
		System.out.println(as.executeScript("return document.URL"));
        as.quit();
	}

}
