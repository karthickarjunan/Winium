package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PnrCreationTest {
	public static WebDriver driver;
	public static String DRIVER_CHROME ="C:\\Users\\jeeva\\eclipse-workspace1\\WiniumJava\\chromedriver.exe";
	public static String APP_URL = "https://uat9.resdesktop.altea.amadeus.com/app_ard/apf/init/login?SITE=AACBAACB&LANGUAGE=GB&MARKETS=ARDW_PDT_WBP";
	public static String APP_UNAME = "TKHARE";
	public static String APP_PWD = "Tanay@123";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", DRIVER_CHROME);
		WebDriverWait wait1=new WebDriverWait(driver,15);
		driver = new ChromeDriver();
		driver.get(APP_URL);
		//wait1.until(ExpectedConditions.)
		driver.findElement(By.id("eusermanagement_login_logi_USER_ALIAS_id_input")).sendKeys(APP_UNAME);
		driver.findElement(By.id("eusermanagement_login_logi_PASSWORD_id_input")).sendKeys(APP_PWD);
		driver.findElement(By.id("eusermanagement_login_logi_signin_id")).click();
	}

}
