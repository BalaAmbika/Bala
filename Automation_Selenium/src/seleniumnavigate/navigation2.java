package seleniumnavigate;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
public class navigation2 {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		    driver.get("http:\\www.google.com");
		    driver.manage().window().maximize();
		    
		   //open seleniumeasy.com in new tab   
		 driver.executeScript("window.open('https://www.seleniumeasy.com','_blank');");
		  //getting the control of frst tab: driver.getwindowhandle() => parent
		  //getting control of both tabs   : driver.getwindowhandles()=> s={google.com, seleniumeasy.com}
		 
		  String parent=driver.getWindowHandle();// control will be in the parent window //google
		 // collecting all the handle
		  Set<String> s1 = driver.getWindowHandles();// 2(both the tabs = collected)
		  
		   // iterate through the elements present in set
		  Iterator<String> I1 = s1.iterator();  // hasNext , next()

		  // hasnext=> whether content is there
		  // next -> read the content 
		  while(I1.hasNext())// whether any content is there 
		    {
		      String child_window=I1.next();
		      if(!parent.equals(child_window))// picking the seleniumeasy.com
		    	  { // control is moved to child window 
		        driver.switchTo().window(child_window);
		        Thread.sleep(4000);
		        driver.findElementByLinkText("Maven").click();
		        Thread.sleep(4000);
		        driver.close();
		      }
		      /*parent=google.com
		       * s1={google.com, seleniumeasy.com}
		       * 
		       * first iteration:   I1 points to first element in the set 
		       * I1.hasnext=> content is there or not
		       *   I1.next() reads first element in set and store it in child_window
		       *   child_window=google
		       *   if parent!=child_window
		       *      google!=google
		       *      stop the iteration
		       *      
		       * second iteration: I1 points to second element in the set
		       *I1.hasnext=> content 
		       *   I1.next() read second element in the set and store it in child_window
		       *   child_window=seleniumeasy.com
		       *   if parent!=child_window
		       *      google!=seleniumeasy.com
		       *      switching control to the child_window
		       *      moving cursor to seleniumeasy.com
		       *      clicking on Maven 
		       *      4
		       *      close: closes the tab which is in focus
		       *      seleniumeasy.com alone will be closed
		       *      
		       * third iteration: I1 points to null
		       * loop terminates 
		       *      
		       * switching control back to parent
		       * movng cursor to google.com
		       * Images=> click
		       * 5 seconds
		       * quit : closes google.com
		        */
		  }
            driver.switchTo().window(parent);//google 
		    System.out.println(driver.switchTo().window(parent).getTitle());// google
		    //driver.findElement(By.linkText("Images")).click();
		    Thread.sleep(5000);
		    driver.findElementByLinkText("Images").click();
		    Thread.sleep(5000);
		    driver.quit();
		}

}
