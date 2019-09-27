package case_study;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs3 {
	WebDriver driver=null;
	
	@Given("User opens the appn")
	public void User_opens_the_appn()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
	    
	}

	@When("Users click on the signin link and logins")
	public void Users_click_on_the_signin_link_and_logins()  {
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	   
	}

	@When("User search for the product")
	public void User_search_for_the_product() throws InterruptedException  {
		WebElement search=driver.findElement(By.name("products"));
		Actions act=new Actions(driver);
		act.sendKeys(search,"carp");
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);

	}

	@When("add to cart and do the payment")
	public void add_to_cart_and_do_the_payment() throws InterruptedException  {
		 // driver.findElement(By.name("val")).click();
		  driver.findElement(By.xpath("//a[@href='#' and @class='btn btn-success btn-product']")).click();
		  driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
		  driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
		  driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		  Thread.sleep(10000);
		  driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/div")).click();
		  driver.findElement(By.id("btn")).click();
		  driver.findElement(By.name("username")).sendKeys("123456");
		  driver.findElement(By.name("password")).sendKeys("Pass@456");
		  driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		  driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		  driver.findElement(By.xpath("//input[@value='PayNow']")).click();

	}

	@Then("logout from the page")
	public void logout_from_the_page()  {
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();

	}

}
