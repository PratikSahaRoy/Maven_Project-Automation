package batch18Class;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class batch18Code {

	public static void main(String[] args) throws InterruptedException {
		
		//Sauce Demo website 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		
		
		//Matching title
		String ExpectedTitle = "Swag Labs";
		String ActualTitle= driver.getTitle();
		
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
		}
		
		Assert.assertEquals(ActualTitle, ExpectedTitle,"Condition True");//Hard Assertion
		
		
		//Matching URL Assignment-1
		String ExpectedURL = "https://www.saucedemo.com/inventory.html";
		String ActualURL = driver.getCurrentUrl();
		
		if(ActualURL.equals(ExpectedURL)) {
			System.out.println("URL Matched");
		}
		else {
			System.out.println("Doesn't matched");
		}
		
		Assert.assertEquals(ActualURL, ExpectedURL,"Condition True");
		
		//Add to cart first element
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		//Shopping cart
		driver.findElement(By.id("shopping_cart_container")).click();
		Thread.sleep(2000);
		//Checkout
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		//Form(First-name)
		driver.findElement(By.id("first-name")).sendKeys("Pratik Saha");
		Thread.sleep(2000);
		//Form(Last-name)
		driver.findElement(By.id("last-name")).sendKeys("Roy");
		Thread.sleep(2000);
		//Form(Postal Code)
		driver.findElement(By.id("postal-code")).sendKeys("RAN-5640");
		Thread.sleep(2000);
		//Continue
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		//Finish
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		//Back to home
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}


/*
//WebDriver Initialization
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		//Radio Button
		
		WebElement radiobutton = driver.findElement(By.id("male"));
		radiobutton.click();
		
		radiobutton.isSelected();
		System.out.println(radiobutton.isSelected());
		
		//Dropdown
		
		WebElement testdropdown = driver.findElement(By.id("option"));
		Select dropdown = new Select(testdropdown);
		
		//index
		dropdown.selectByIndex(2);
		//value
		dropdown.selectByValue("option 1");
		//Visible Text
		dropdown.selectByVisibleText("Option 3");
*/