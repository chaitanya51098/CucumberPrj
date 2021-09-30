package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagefactoryPOM.LoginPOM;


public class signin {
	LoginPOM loginpom;
	WebDriver driver;
@Given("^user is on the log in page$")
public void user_is_on_the_log_in_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	

}

@When("^user enters username and password$")
public void user_enters_username_and_password() throws Throwable {
	
	driver.findElement(By.id("Email")).sendKeys("chaitanya.parimi05@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("chaitu12");
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	

}

@Then("^message displayed login successfully$")
public void message_displayed_login_successfully() throws Throwable {
    
	System.out.println("login success");
	driver.close();

	}

}
