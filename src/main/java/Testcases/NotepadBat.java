package Testcases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class NotepadBat {

	public static WiniumDriver driver;
	public static DesktopOptions option;

	public static void main(String[] args) {
		String confirmTabMsgExp = "Do you want to save changes to Untitled?";
		try {
			option = new DesktopOptions();
			option.setApplicationPath("C:\\Users\\jeeva\\Desktop\\s.bat");
			driver = new WiniumDriver(new URL("http://localhost:9999"), option);

			Thread.sleep(5000);
			System.out.println("Notepad launched");

			driver.findElement(By.name("Maximize")).click();

			driver.findElement(By.id("15")).sendKeys("hello test");

			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);

			// driver.findElement(By.name("File")).click();

			driver.findElement(By.id("Close")).click();
			String confirmTabMsgActual = driver.findElement(By.id("MainInstruction")).getAttribute("Name");
			verify(confirmTabMsgActual, confirmTabMsgExp);
			driver.findElement(By.id("CommandButton_2")).click();
			driver.findElement(By.name("File")).click();
			driver.findElement(By.name("Save")).click();
			driver.findElement(By.id("1001")).sendKeys("winautomationfile21");
			String titleMsgExp = driver.findElement(By.id("1001")).getText();
			System.out.println(titleMsgExp);
			driver.findElement(By.name("Save")).click();
			if(driver.findElement(By.id("CommandButton_6")).isDisplayed())
			{
				driver.findElement(By.id("CommandButton_6")).click();
				String titleMsgActual = driver.findElement(By.id("TitleBar")).getAttribute("Name");
				verify(titleMsgExp, titleMsgActual);
			}
			else
			{
			String titleMsgActual = driver.findElement(By.id("TitleBar")).getAttribute("Name");
			verify(titleMsgExp, titleMsgActual);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally
		{
			driver.findElement(By.id("Close")).click();
		}
	

		
	}

	public static void verify(String expected, String actual) {
		if (expected.equals(actual)) {
			System.out.println("Assertion succesful.. EXPECTED: " + expected + " is same as ACTUAL: " + actual);
		} else {
			System.out.println("Assertion failure.. expected :" + expected + " is not same as actual : " + actual);

		}

	}
}