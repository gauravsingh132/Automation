package testcases;

import org.testng.annotations.Test;

import Basepack.Base;
import Pages.RegistrationPage;

public class Testcase extends Base {
	
	
	@Test
	public void TC_01_01() throws Exception //Test First name with invalid data and check validation msg
	{
		RegistrationPage.First_Name(driver, rb.getString("TC_01_01"));
	}
	
	
	@Test
	public void TC_01_02() throws Exception //Test First name with valid data
	{
		RegistrationPage.First_Name(driver, rb.getString("TC_01_02"));
	}
	
	
	@Test
	public void TC_02_01() throws Exception //Test Last name with invalid data and check validation msg
	{
		RegistrationPage.Last_Name(driver, rb.getString("TC_02_01"));
	}
	
	@Test
	public void TC_02_02() throws Exception //Test last name with valid data 
	{
		RegistrationPage.Last_Name(driver, rb.getString("TC_02_02"));
	}
	@Test
	public void TC_03_01() throws Exception //Test with invalid data and check validation msg
	{
		RegistrationPage.UserName(driver, rb.getString("TC_03_01"));
	}
	
	@Test
	public void TC_03_02() throws Exception //Test  with valid data 
	{
		RegistrationPage.UserName(driver, rb.getString("TC_03_02"));
	}
	@Test
	public void TC_04_01() throws Exception //Test with invalid data and check validation msg
	{
		RegistrationPage.Password(driver, rb.getString("TC_04_01"));
	}
	
	@Test
	public void TC_04_02() throws Exception //Test  with valid data 
	{
		RegistrationPage.Password(driver, rb.getString("TC_04_02"));
	}
	@Test
	public void TC_05_01() throws Exception //Test with invalid data and check validation msg
	{
		RegistrationPage.confirm_password(driver, rb.getString("TC_05_01"),rb.getString("TC_04_02"));
	}
	
	@Test
	public void TC_05_02() throws Exception //Test  with valid data 
	{
		RegistrationPage.confirm_password(driver, rb.getString("TC_05_02"),rb.getString("TC_04_02"));
	}
	@Test
	public void TC_06_01() throws Exception //Test with invalid data and check validation msg
	{
		RegistrationPage.email(driver, rb.getString("TC_06_01"));
	}
	
	@Test
	public void TC_06_02() throws Exception //Test  with valid data 
	{
		RegistrationPage.email(driver, rb.getString("TC_06_02"));
	}

}

