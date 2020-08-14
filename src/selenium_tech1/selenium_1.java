package selenium_tech1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class selenium_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.gecko.driver", "C:\\Users\\ABDURRAHEEM\\Desktop\\QA\\FirefoxDriver\\geckodriver.exe");
driver=new FirefoxDriver();
driver.get("https://demoqa.com/");
driver.manage().window().maximize();
	}

}
