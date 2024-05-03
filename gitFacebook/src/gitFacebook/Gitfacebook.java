package gitFacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gitfacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("launching facebook page");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Anjana\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("anjanaajayan19");
		driver.findElement(By.name("pass")).sendKeys("anjana123");
		driver.findElement(By.name("login")).click();


	}

}
