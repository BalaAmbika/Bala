package configurations;

import org.openqa.selenium.chrome.ChromeDriver;

public class refresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab=new ChromeDriver();
		ab.get("http:\\www.mycontactform.com");
		
		ab.navigate().refresh();
		ab.quit();

	}

}
