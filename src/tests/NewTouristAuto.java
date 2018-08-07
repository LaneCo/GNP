package tests;

import org.testng.annotations.Test;
import layouts.GnpIssuers;
import utilities.Driver;
import utilities.LogTouristAuto;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class NewTouristAuto extends Driver {
	
	utilities.Config cfg = new utilities.Config();
	ITestResult result;
	NewLogin login;
	String user;
	String pass;
	String person_type = "Company."; //Individual. , Company.
	GnpIssuers newPolicy = new GnpIssuers();
	String trailer = "1000";
	String unit1= "0";
	String unit2= "0";
	String unit3= "1000";	
 
  @BeforeMethod
  public void beforeMethod() {
	  
	  String url = cfg.getProperty("url_gnp");
	  user = cfg.getProperty("user_gnp");
	  pass = cfg.getProperty("pass_gnp");
	  driver.navigate().to(url);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  login = new NewLogin();
  
  }
  
  @Test (priority = 2, description = "Issue GNP Tourist Auto policy")
  public void createPolicy() throws IOException {
	  login.login(user, pass);	  
	  System.out.println("Issue GNP Tourist Auto policy");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wait(2000);
	  newPolicy.product().click();
	  //**************************************just if you insured towed units****************************************************************************
	  newPolicy.towedUnits().click(); //Yes
	  //*************************************************************************************************************************************************
	  newPolicy.packages().selectByVisibleText("Complete Coverage"); //Complete Coverage , Liability with Additionals , Liability w/o Additionals (Motorcycles)
	  newPolicy.vehicleType().selectByVisibleText("RV/Motorhome (excl. Motorcycles and Boats)"); //Automobile (Sedan, Coupe, Hard-Top, Station-Wagon)/Pick-up/SUV , RV/Motorhome (excl. Motorcycles and Boats)
	  
	  newPolicy.liability().selectByVisibleText("$65,000.00"); //$50,000.00 increase 5 in 5 TO $500,000.00
	  newPolicy.legalAssistance().selectByVisibleText("$30,000.00"); //$20,000.00 increase 5 in to $500,000.00
	  newPolicy.medicalExpenses().selectByVisibleText("$5,000.00"); //$2,000.00 increase 1 in 1 to $100,000.00
	  newPolicy.travelAssistanceNo().click();
	  newPolicy.deductibleVariable().click();
	  //newPolicy.extendedCoverage().click(); //just if the package allow extended coverage
	  newPolicy.vehicleValue().sendKeys("8000");
	  newPolicy.specialEquipment().sendKeys(Keys.chord(Keys.CONTROL, "a"), "");
	  newPolicy.specialEquipment().sendKeys("1000");
	  units(newPolicy,trailer,unit1,unit2,unit3);
	  newPolicy.days().sendKeys(Keys.chord(Keys.CONTROL, "a"), "");
	  newPolicy.days().sendKeys("10");
	  newPolicy.insuredAndVehicleDataTab().click();
	  newPolicy.insuredAndVehicleDataTab().click();
	  System.out.println(person_type);
	  if ( (person_type).equals("Company.") )
	  {
		  System.out.println("if company");
		  newPolicy.personType().selectByVisibleText(person_type);
		  newPolicy.taxId().sendKeys("ABA122514VB2");
		  newPolicy.firstName_Company().sendKeys("Cerveceria Tijuana SA de CV");
		  newPolicy.additionalDriver().sendKeys("Martin Ramos");
	  }
	  else
	  {
		  System.out.println("if individual");
		  newPolicy.personType().selectByVisibleText(person_type);
		  newPolicy.firstName_Company().sendKeys("Jovani");
		  newPolicy.lastName().sendKeys("Segura");
		  newPolicy.additionalDriver().sendKeys("Martin Ramos");
		  newPolicy.gender().selectByVisibleText("Male"); //Male , Female
	  }
	  
	  newPolicy.citizenship().selectByVisibleText("USA"); //USA , Other
	  newPolicy.occupation().selectByVisibleText("Employee"); //Employee , Self employed , Student
	  newPolicy.address().sendKeys("Calle del rincon 338");
	  newPolicy.city().sendKeys("Tijuana");
	  newPolicy.country().selectByVisibleText("CANADA"); //any country
	  newPolicy.state().selectByVisibleText("ALBERTA"); //any country's state
	  newPolicy.zip().sendKeys("22500");
	  newPolicy.phone().sendKeys("6641234567");
	  //Vehicle Description
	  newPolicy.vehicleYear().selectByVisibleText("2014");
	  newPolicy.make().selectByVisibleText("Chevrolet");
	  newPolicy.model().selectByVisibleText("Aveo");
	  newPolicy.vehicleTypeAndCapacity().selectByVisibleText("Sedan");
	  //newPolicy.country().selectByVisibleText("CANADA"); //any country
	  //newPolicy.state().selectByVisibleText("ALBERTA"); //any country's state
	  newPolicy.plates().sendKeys("PL1234");
	  newPolicy.vehicleId().sendKeys("SERIEAUT001GNP");
	  //*************************************************if you selected towed units**************************************
	  unitsInfo(newPolicy,unit1,unit2,unit3);
	  //******************************************************************************************************************
	  //Payment Tab
	  newPolicy.paymentTab().click();
	  newPolicy.generalConditions().selectByVisibleText("Yes"); //Yes , No
	  newPolicy.damages().selectByVisibleText("Yes"); //Yes , No
	  newPolicy.termsAndConditions().selectByVisibleText("Yes"); //Yes , No
	  newPolicy.paymentMethod().selectByVisibleText("Cash"); //Cash
	  System.out.println("Termino poliza");
	  //Complete the purchase
	  newPolicy.purchase().click();
	  //Confirm the purchase
	  newPolicy.confirmation();
	  wait(4000);
	  newPolicy.closePolicy().click();
	  wait(3000);
	  String close = Keys.chord(Keys.ALT,Keys.F4);
	  newPolicy.closePolicy().sendKeys(close);
	  //Get the policy number issued
	  String Text = newPolicy.policy().getText();
	  System.out.println(Text);
	  String[] parts = Text.split(":");
	  System.out.println("The policy was issued correctly with the number: "+parts[1]);
	  String line = "The policy was issued correctly with the number: "+parts[1];
	  LogTouristAuto.write(line);
	  wait(1500);
	  login.Logout();
  }



private void unitsInfo(GnpIssuers newPolicy, String i, String j, String k) {
	// TODO Auto-generated method stub
	newPolicy.yearTrailer().selectByVisibleText("2006"); //1963 to 2019
	newPolicy.makeTrailer().sendKeys("makeTrailer");
	newPolicy.modelTrailer().sendKeys("modelTrailer");
	newPolicy.typeCapacityTrailer().sendKeys("type");
	newPolicy.idTrailer().sendKeys("trailerId");
	newPolicy.licenseTrailer().sendKeys("licenseTrailer");
	int unit1 = Integer.parseInt(i);
	int unit2 = Integer.parseInt(j);
	int unit3 = Integer.parseInt(k);
	if (unit1 != 0) {
		newPolicy.yearUnit1().selectByVisibleText("2007"); //1963 to 2019
		newPolicy.makeUnit1().sendKeys("makeUnit1");
		newPolicy.modelUnit1().sendKeys("modelUnit1");
		newPolicy.typeUnit1().selectByVisibleText("Motorcycle"); //Auto , RV , Motorcycle , Boat
		newPolicy.idUnit1().sendKeys("unit1Id");
		newPolicy.licenseUnit1().sendKeys("licenseUnit1");
	}
	if (unit2 != 0) {
		newPolicy.yearUnit2().selectByVisibleText("1980"); //1963 to 2019
		newPolicy.makeUnit2().sendKeys("makeUnit2");
		newPolicy.modelUnit2().sendKeys("modelUnit2");
		newPolicy.typeUnit2().selectByVisibleText("Auto"); //Auto , RV , Motorcycle , Boat
		newPolicy.idUnit2().sendKeys("unit2Id");
		newPolicy.licenseUnit2().sendKeys("licenseUnit2");
	}
	if (unit3 != 0) {
		newPolicy.yearUnit3().selectByVisibleText("1980"); //1963 to 2019
		newPolicy.makeUnit3().sendKeys("makeUnit3");
		newPolicy.modelUnit3().sendKeys("modelUnit3");
		newPolicy.typeUnit3().selectByVisibleText("Boat"); //Auto , RV , Motorcycle , Boat
		newPolicy.idUnit3().sendKeys("unit3Id");
		newPolicy.licenseUnit3().sendKeys("licenseUnit3");
	}
}

private void units(GnpIssuers newPolicy, String i, String j, String k, String l) {
	// TODO Auto-generated method stub
	System.out.println("Enter the method units");
	newPolicy.trailer().sendKeys(i);
	newPolicy.unit1().sendKeys(j);
	newPolicy.unit2().sendKeys(k);
	newPolicy.unit3().sendKeys(l);
}


@AfterMethod
  public void closeDriver(ITestResult result) {
	  System.out.println("@AfterTest closing driver");
	  wait(3000);
	  driver.quit();
	  try
      {
      if(result.getStatus() == ITestResult.SUCCESS)
      {
    	  LogTouristAuto.write("The test passed");
          System.out.println("passed **********");
      }
      else if(result.getStatus() == ITestResult.FAILURE)
      {
    	  LogTouristAuto.write("The test failed");
          System.out.println("Failed ***********");
      }

      else if(result.getStatus() == ITestResult.SKIP )
      {
          System.out.println("Skiped***********");
      }
      }
      catch(Exception e)
      {
    	  e.printStackTrace(); 
      }
  }

}
