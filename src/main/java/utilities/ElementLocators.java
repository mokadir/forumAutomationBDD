package utilities;

import org.openqa.selenium.By;

public class ElementLocators {
	// Login Page locators
	public static By name=By.name("email");
	public static By passwordLogin=By.name("password");
	public static By submitLogin=By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button");
	
	// Registration Page locators
	public static By language=By.name("language");
//	public static By langEnglish=By.xpath("//*[@id=\"home\"]/div/div[1]/div[1]/select/option[2]");
	public static By title=By.name("titles");
//	public static By titleMr=By.xpath("//*[@id=\"home\"]/div/div[2]/div[1]/select/option[2]");
	public static By fname=By.name("fname");
	public static By lname=By.name("lname");
	public static By email=By.name("email");
	public static By passwordReg=By.name("password");
	public static By genderMale=By.xpath("//*[@id=\"home\"]/div/div[1]/div[4]/div/label[2]/input");
	public static By phone=By.name("phone");
	public static By course=By.name("course");
//	public static By courseApache=By.xpath("//*[@id=\"home\"]/div/div[1]/div[5]/select/option[4]");
	public static By confirm=By.xpath("//*[@id=\"home\"]/div/div[1]/div[6]/input");
	public static By submitReg=By.xpath("//*[@id=\"home\"]/div/div[2]/input");
}