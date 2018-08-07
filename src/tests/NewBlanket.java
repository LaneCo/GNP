package tests;

import org.testng.annotations.Test;
import layouts.GnpIssuers;
import utilities.Driver;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class NewBlanket extends Driver{
	utilities.Config cfg = new utilities.Config();
	ITestResult result;
	NewLogin login;
	String user;
	String pass;
	GnpIssuers newPolicy = new GnpIssuers();
  
  @BeforeMethod 
  public void beforeMethod() {
	  String url = cfg.getProperty("url_gnp");
	  user = cfg.getProperty("user_gnp");
	  pass = cfg.getProperty("pass_gnp");
	  driver.navigate().to(url);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  login = new NewLogin();
  }
  
  @Test(priority = 2, description = "Issue GNP Blanket policy")
  public void createPolicy() {
	  login.login(user, pass);	  
	  System.out.println("Issue GNP Tourist Auto policy");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wait(2000);
	  newPolicy.productBlanket().click();
	  newPolicy.packages().selectByVisibleText("Complete Coverage"); //Complete Coverage , Liability with Additionals
	  newPolicy.liability().selectByVisibleText("$90,000.00"); //$55,000.00 increase 5 in 5 TO $500,000.00
	  newPolicy.legalAssistance().selectByVisibleText("$35,000.00"); //$20,000.00 increase 5 in to $500,000.00
	  newPolicy.medicalExpenses().selectByVisibleText("$5,000.00"); //$2,000.00 increase 1 in 1 to $100,000.00
	  newPolicy.travelAssistanceNo().click(); //without travel assistance
  }

  @AfterMethod
  public void afterMethod() {
  }

}
