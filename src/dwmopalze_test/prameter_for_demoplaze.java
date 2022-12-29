package dwmopalze_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prameter_for_demoplaze {

	public WebDriver driver;
	public SoftAssert mysoft= new SoftAssert();
	String url ="https://www.demoblaze.com/";
	String expected_title="STORE";
	@BeforeTest
	
	public void define_var() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		

		driver.get(url);
		
		
		
	}
}
