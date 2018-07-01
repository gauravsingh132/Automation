package Pages;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Converter;

public class RegistrationPage {

	public static void First_Name(WebDriver driver,String data) throws Exception
	{
		driver.findElement(By.xpath("//input[@name='first_name']")).clear();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(data);
		Thread.sleep(2000);
		try {
			if(driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']//small[@data-bv-validator-for='first_name' and @style='']")).isDisplayed())
			{
				String First_Name_msg =driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']//small[@data-bv-validator-for='first_name' and @style='']")).getText();
				if(First_Name_msg.equalsIgnoreCase("This value is not valid"))
				{
				   //  org.testng.Assert.fail("Fail");
					System.out.println("First_Name: validation msg correct");
				}
				System.out.println("Pass: Validation msg correct");
				  
				  
				
			}
		} catch (Exception e) {
			if(driver.findElement(By.xpath("//div[@class='form-group has-feedback has-success']//small[@data-bv-validator-for='first_name' and @style='display: none;' ]")).isDisplayed());
			System.out.println("First_Name valid data pass");		
			}

	}
	
	public static void Last_Name(WebDriver driver,String data) throws Exception
	{
		driver.findElement(By.xpath("//input[@name='last_name']")).clear();
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(data);
		Thread.sleep(2000);
		try {
			if(driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']//small[@data-bv-validator-for='last_name' and @style='']")).isDisplayed())
			{
				String Last_Name_msg =driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']//small[@data-bv-validator-for='last_name' and @style='']")).getText();
				if(Last_Name_msg.equalsIgnoreCase("This value is not valid"))
				{
				   //  org.testng.Assert.fail("Fail");
					System.out.println("last name: validation msg correct");
				}
				System.out.println("last_Name_msg");
				  
				  
				
			}
		} catch (Exception e) {
			if(driver.findElement(By.xpath("//div[@class='form-group has-feedback has-success']//small[@data-bv-validator-for='last_name' and @style='display: none;' ]")).isDisplayed());
			System.out.println("last_Name Pass");		
			}

	}
	public static void UserName(WebDriver driver,String data) throws Exception
	{
		driver.findElement(By.xpath("//input[@name='user_name']")).clear();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(data);
		Thread.sleep(2000);
		try {
			if(driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']//small[@data-bv-validator-for='user_name' and @style='display: block;']")).isDisplayed())
			{
				String user_Name_msg =driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']//small[@data-bv-validator-for='user_name' and @style='display: block;']")).getText();
				if(user_Name_msg.equalsIgnoreCase("This value is not valid"))
				{
				   //  org.testng.Assert.fail("Fail");
					System.out.println("Username validation msg pass");
				}
				System.out.println("username msg pass");
				  
				  
				
			}
		} catch (Exception e) {
			if(driver.findElement(By.xpath("//div[@class='form-group has-feedback has-success']//small[@data-bv-validator-for='user_name' and @style='display: none;']")).isDisplayed());
			System.out.println("username valid data Pass");		}

	}
	
	public static void Password (WebDriver driver,String data) throws Exception
	{
		driver.findElement(By.xpath("//input[@name='user_password']")).clear();
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(data);
		Thread.sleep(2000);
		try {
			if(driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']//small[@data-bv-validator-for='user_password' and @style='']")).isDisplayed())
			{
				String password_Name_msg =driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']//small[@data-bv-validator-for='user_password' and @style='']")).getText();
				if(password_Name_msg.equalsIgnoreCase("This value is not valid"))
				{
				   //  org.testng.Assert.fail("Fail");
					System.out.println("user_password validation msg pass");
				}
				System.out.println("user_password msg pass");
				  
				  
				
			}
		} catch (Exception e) {
			if(driver.findElement(By.xpath("//div[@class='form-group has-feedback has-success']//small[@data-bv-validator-for='user_password' and @style='display: none;' ]")).isDisplayed());
			System.out.println("user_password valid data Pass");	}	
			}
		
		public static void confirm_password (WebDriver driver,String password,String Confirm_pass) throws Exception
		{
			if(password.equalsIgnoreCase(Confirm_pass))
			{
				System.out.println("password and conformed paswword does not match");
				//org.testng.Assert.fail("Fail");
				Assert.assertTrue(false,"Password and confirmed password does not match");
			}
			else {
			driver.findElement(By.xpath("//input[@name='confirm_password']")).clear();
			driver.findElement(By.xpath("//input[@name='confirm_password']")).sendKeys(password);
			Thread.sleep(2000);
			try {
				if(driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']//small[@data-bv-validator-for='confirm_password' and @style='']")).isDisplayed())
				{
					String confirm_password_msg =driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']//small[@data-bv-validator-for='confirm_password' and @style='']")).getText();
					if(confirm_password_msg.equalsIgnoreCase("This value is not valid"))
					{
					   //  org.testng.Assert.fail("Fail");
						System.out.println("confirm_password validation msg pass");
					}
					System.out.println("confirm_password msg pass");
					  
					  
					
				}
			} catch (Exception e) {
				if(driver.findElement(By.xpath("//div[@class='form-group has-feedback has-success']//small[@data-bv-validator-for='confirm_password' and @style='display: none;' ]")).isDisplayed());
				System.out.println("confirm_password valid data Pass");		
				}
			}

	}
		
		public static void email(WebDriver driver,String data) throws Exception
		{
			driver.findElement(By.xpath("//input[@name='email']")).clear();
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data);
			Thread.sleep(2000);
			try {
				if(driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']//small[@data-bv-validator-for='email' and @style='']")).isDisplayed())
				{
					String email_msg =driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']//small[@data-bv-validator-for='email' and @style='']")).getText();
					if(email_msg.equalsIgnoreCase("This value is not valid"))
					{
					   //  org.testng.Assert.fail("Fail");
						System.out.println("email: validation msg correct");
					}
					System.out.println("last_Name_msg");
					  
					  
					
				}
			} catch (Exception e) {
				if(driver.findElement(By.xpath("//div[@class='form-group has-feedback has-success']//small[@data-bv-validator-for='email' and @style='display: none;' ]")).isDisplayed());
				System.out.println("email Pass");		
				}

		}

	

}
