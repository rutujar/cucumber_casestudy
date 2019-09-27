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

public class cs4 {
	WebDriver driver=null;
	@Given("user opens the appn")
	public void user_opens_the_appn()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();

	}

	@When("user click on the signin link and logins")
	public void  user_click_on_the_signin_link_and_logins()  {
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();

	}

	@When("user search for the product")
	public void user_search_for_the_product() throws InterruptedException  {
		WebElement search=driver.findElement(By.name("products"));
		Actions act=new Actions(driver);
		act.sendKeys(search,"carp");
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);


	}

	@When("try to proceed for the payment without adding item")
	public void try_to_proceed_for_the_payment_without_adding_item ()  {
		
		try
		{
		
			driver.findElement(By.linkText("Cart"));
		}
	
		catch(Exception e)
		{
			System.out.println("cart symbol is not present");
		}
	}

	@Then("it doesnt display the cart item")
	public void it_doesnt_display_the_cart_item()  {
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	  
	}


}
