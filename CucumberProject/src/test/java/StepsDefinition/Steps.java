package StepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Steps {
	
	static WebDriver driver;
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\hello\\CucumberProject\\Driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.gmail.com");
	
	}


	
	}
