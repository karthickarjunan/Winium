package Testcases;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class winapp {

		// TODO Auto-generated method stub
		public static WiniumDriver driver;
		public static DesktopOptions option;
	public static void main(String[] args)  {
		try
		{
		option=new DesktopOptions();
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		driver= new WiniumDriver(new URL("http://localhost:9999"),option);
		Thread.sleep(5000);
		System.out.println("calculator launched");
		driver.findElement(By.id("num8Button"))
		.click();
		driver.findElement(By.id("multiplyButton")).click();
		driver.findElement(By.id("num8Button")).click();
		driver.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
	}
	}
