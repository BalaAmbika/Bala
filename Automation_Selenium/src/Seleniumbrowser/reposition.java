package Seleniumbrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class reposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver as=new ChromeDriver();
		as.get("http:\\www.amazon.com");

     Point pt=new Point(200,400);
     as.manage().window().setPosition(pt);
     
	}

}
