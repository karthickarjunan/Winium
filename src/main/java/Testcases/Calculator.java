package Testcases;
import java.net.URL;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Calculator {
	public static WiniumDriver driver;
	public static DesktopOptions option;
public static void main(String[] args)  {
	try
	{
	option=new DesktopOptions();
	option.setApplicationPath("C:\\Users\\jeeva\\Downloads\\calc.exe");
	driver= new WiniumDriver(new URL("http://localhost:9999"),option);
	Thread.sleep(5000);
	System.out.println("calculator launched");
	WebElement seven=driver.findElement(By.name("7"));
	seven.click();
	Thread.sleep(1000);
	WebElement addButton=driver.findElement(By.id("93"));
	addButton.click();
	Thread.sleep(1000);
	WebElement five=driver.findElement(By.id("135"));
	five.click();
	Thread.sleep(1000);
	WebElement equals=driver.findElement(By.name("="));
	equals.click();
	Thread.sleep(1000);
	String Output=driver.findElement(By.id("150")).getAttribute("Name");
	System.out.println("result is : "+Output);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		driver.close();
	}
}
}
