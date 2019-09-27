package case_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs2 {
	WebDriver driver=null;

	@Given("User opens the testmeapp application")
	public void User_opens_the_testmeapp_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();

	}

	@When("Users click on the sign in link")
	public void Users_click_on_the_sign_in_link()  {
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();

	}

	@When("User enters {string} and {string}")
	public void User_enters_and(String string, String string2)  {
		driver.findElement(By.id("userName")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.name("Login")).click();
		
	 
	}

	@Then("Message displayed Login page successfully")
	public void Message_displayed_Login_page_successfully()  {
		System.out.println("The title is:"+driver.getTitle());

	}
	

}
