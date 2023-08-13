package Seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
	    //classname objectnmae= new classname();
			ChromeDriver ob= new ChromeDriver();
			ob.get("https://jqueryui.com/datepicker/");
			ob.switchTo().frame(0);
			
			ob.findElementById("datepicker").click();
			
			//month
			for(int i=0;i<3;i=i+1)
			{
				ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
			}
			ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[1]/a").click();

	}

}
