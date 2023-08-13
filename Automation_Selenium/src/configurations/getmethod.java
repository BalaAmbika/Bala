package configurations;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver as=new ChromeDriver();
		as.get("http:\\www.amazon.com");
		//title
		        System.out.println(as.getTitle());
		
		//url
	        	System.out.println(as.getCurrentUrl());
		
		//Dimension
		
				Dimension s=as.manage().window().getSize();
				System.out.println("height is "+s.getHeight());
				System.out.println("width is "+s.getWidth());
       //position;
				
				Point d=as.manage().window().getPosition();
				System.out.println("x value is "+d.getX());
				System.out.println("y value is "+d.getY());
				
	  //browser details:Capabilities
				Capabilities c=as.getCapabilities();
				System.out.println("os is "+c.getPlatform());
				System.out.println("name is "+c.getBrowserName());
				System.out.println("version is "+c.getVersion());
				

	}

}
