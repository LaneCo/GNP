package layouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Login extends utilities.Driver {

	public WebElement getUserName() {
		return driver.findElement(By.id("user"));
	}


	public WebElement getPassword() {
		return driver.findElement(By.id("pass"));
	}


	public WebElement getLogin() {
		return driver.findElement(By.className("texto"));
	}

	public WebElement getLogout() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu_title"); 
		return driver.findElement(By.id("btnSignOut"));

	  }
}
