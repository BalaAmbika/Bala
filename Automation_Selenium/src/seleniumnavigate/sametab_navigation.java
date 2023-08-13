package seleniumnavigate;

import org.openqa.selenium.chrome.ChromeDriver;

public class sametab_navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
	       //classname objectnmae= new classname();
			ChromeDriver ob= new ChromeDriver();
	        ob.get("http://www.google.com");//1
	        Thread.sleep(3000);
	       
	        ob.findElementByLinkText("Images") .click();
		    Thread.sleep(3000);
		
		    // move back to step1
		    ob.navigate().back();
		    Thread.sleep(3000);
		
		    // move forward to step2
		    ob.navigate().forward();
		    Thread.sleep(3000);
	     	ob.quit();

	}

}
