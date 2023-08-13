package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab=new ChromeDriver();
		ab.get("http:\\www.mycontactform.com");
		//css-casecade style sheet:
		//7 manual 
		//tagname#id
		//ab.findElementByCssSelector("input#user").sendKeys("hi");
		//tagname.classname:
		//ab.findElementByCssSelector("input.txt_log").sendKeys("hi");
		//tagname[attribute='value']
		//ab.findElementByCssSelector("input[type='text']").sendKeys("hello");
		//tagname[prefix of attribute^='value']
		//ab.findElementByCssSelector("input[type^='te']").sendKeys("hello");
		//tagname[suffix of attribute$='value']
		//ab.findElementByCssSelector("input[type$='xt']").sendKeys("hello");
		//tagname[substring of attribute*='value']
		//ab.findElementByCssSelector("input[type*='ex']").sendKeys("hello");
		//tagname.classname[attribute='value']
		//ab.findElementByCssSelector("input.txt_log[type='text']").sendKeys("hi");
		
		//shortcutkey:
		ab.findElementByCssSelector("#user").sendKeys("hi");
		
		Thread.sleep(3000);
		
		ab.quit();
	}

}
