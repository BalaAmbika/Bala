package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class css_syntax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http:\\www.mycontactform.com");
		

		//css: casecade style sheet
        //7 manual ways and shortcut
        //1.tagname and id       syntax: tagname#id
       // ob.findElementByCssSelector("input#user").sendKeys("hi");
        
        //2.tagname and classname    syntax: tagname.classname
       // ob.findElementByCssSelector("input.txt_log").sendKeys("hi");
        
        //3. tagname and attribute   syntax: tagname[attribute='value']
        //ob.findElementByCssSelector("input[type='text']").sendKeys("hi");
        
        //4.tagname and  prefix attribute   syntax: tagname[attribute^='prefix value']
        //ob.findElementByCssSelector("input[type^='te']").sendKeys("hi");
        
        //5.tagname and  suffix of attribute   syntax: tagname[attribute$='suffix value']
        //ob.findElementByCssSelector("input[type$='xt']").sendKeys("hi");
        
        //6.tagname and substring of attribute   syntax: tagname[attribute*='subtrsing value']
        //ob.findElementByCssSelector("input[type*='ex']").sendKeys("hi");
        
        //7.tagname.classname  and attribute   syntax: tagname.classname [attribute='value']
       // ob.findElementByCssSelector("input.txt_log[type='text']").sendKeys("hi");
        
        // copy=> copy selector
       ob.findElementByCssSelector("#user").sendKeys("hi");
	}

}
