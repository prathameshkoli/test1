package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class position {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
 driver.get("https://demo.actitime.com/login.do");
 
 //	Point size = driver.manage().window().getPosition();
 	//System.out.println(size.getX());
 //	System.out.println(size.getY());
 
 			Point set = new Point(1000,500);
 			driver.manage().window().setPosition(set);
 
 
}
}
