package Testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliTest {
	public static WiniumDriver driver;
	public static DesktopOptions option;
public static void main(String[] args) throws InterruptedException, MalformedURLException, FindFailed  {

	option=new DesktopOptions();
	option.setApplicationPath("C:\\Users\\jeeva\\Downloads\\calc.exe");
	driver= new WiniumDriver(new URL("http://localhost:9999"),option);
	Thread.sleep(5000);
	Screen sc=new Screen();
	Pattern p=new Pattern("C:\\Users\\jeeva\\Pictures\\1.PNG");
	Pattern m=new Pattern("C:\\Users\\jeeva\\Pictures\\multiply.PNG");
	Pattern eq=new Pattern("C:\\Users\\jeeva\\Pictures\\equals.PNG");

	sc.type(p, "22");
	sc.click(m);
	sc.type(p, "12");
	sc.click(eq);
	
	}
}