package configurations;

import org.openqa.selenium.chrome.ChromeDriver;

public class intro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http:\\www.facebook.com");
		
		//maximising
		//ob.manage().window().maximize();
		
		//minimize
		//ob.manage().window().fullscreen();
		
		//refresh
		//ob.navigate().refresh();
		
		//wait
		Thread.sleep(3000);
		
		
		//quit
		ob.quit();
		
	}

}
