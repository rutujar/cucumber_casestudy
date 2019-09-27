package case_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs1 {
	WebDriver driver=null;
	
	@Given("User opens the application")
	public void User_opens_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
	}

	@When("Users click on the signup link")
	public void Users_click_on_the_signup_link ()  {
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();

	   
	}

	@When("User enter username as {string}")
	public void User_enter_username_as(String string)  {
		driver.findElement(By.id("userName")).sendKeys(string);

	}

	@Then("User enters firstname as {string}")
	public void User_enters_firstname_as(String string)  {
		driver.findElement(By.id("firstName")).sendKeys(string);

	}

	@Then("user enterss lastname as {string}")
	 public void user_enterss_lastname_as(String string)  {
		driver.findElement(By.id("lastName")).sendKeys(string);

	}

	@Then("user enters password as {string}")
	public void user_enters_password_as(String string) {
		driver.findElement(By.id("password")).sendKeys(string);

	}

	@Then("user enters cpwd as {string}")
	public void	user_enters_cpwd_as(String string) {
		driver.findElement(By.name("confirmPassword")).sendKeys(string);
	}

	@Then("user enters gender as {string}")
	public void user_enters_gender_as(String string){
		driver.findElement(By.xpath("//input[@value='Female']")).click();

	}

	@Then("user enters email as {string}")
	public void user_enters_email_as(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys(string);

	}
	
	@Then("user enters mobile as {string}")
	public void user_enters_mobile_as(String string)  {
		driver.findElement(By.name("mobileNumber")).sendKeys(string);
		driver.findElement(By.name("dob")).sendKeys("24/12/1997");
	}

	@Then("user enters address as {string}")
	public void	user_enters_address_as(String string) {
		driver.findElement(By.name("address")).sendKeys(string);
		Select pc=new Select(driver.findElement(By.name("securityQuestion")));
		pc.selectByIndex(1);
	}

	@Then("user enters answer as {string}")
	public void user_enters_answer_as(String string)  {
		driver.findElement(By.name("answer")).sendKeys(string);
	}

	@Then("Message displayed Login Successfully")
	public void Message_displayed_Login_Successfully ()  {
		driver.findElement(By.name("Submit")).click();
	}



}
