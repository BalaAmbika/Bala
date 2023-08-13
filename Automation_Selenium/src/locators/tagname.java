package locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http:\\www.facebook.com");
		
		List<WebElement> l1= ob.findElementsByTagName("img");
		System.out.println("number of images "+l1.size());
		
		List<WebElement> l11= ob.findElementsByTagName("a");
		System.out.println("number of links "+l11.size());
		
		List<WebElement> l12= ob.findElementsByTagName("div");
		System.out.println("number of element with div tag "+l12.size());

	}

}
