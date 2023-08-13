package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab=new ChromeDriver();
		ab.get("http:\\www.mycontactform.com");
		
		//xpath: xml path language
        //relative
        //absolute
        
        //absolute xpath:  start finding the element from the root
        //     starts with /
        //  copy=> copy full xpath
	
		ab.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("hi");
		
		 //relative xpath:
        //        starts with //
        //       syntax:   //*[@locator/attribute='value']   or //tagname[@locator/attribute='value']
        //      shortcut: copy=> copy xpath
        
        ab.findElementByXPath("//*[@id='user']").sendKeys("hi");
        
        ab.findElementByXPath("//*[@type='password']").sendKeys("hello");
        
        //copy=> copy xpath
        ab.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();

	}

}
