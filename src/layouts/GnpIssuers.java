package layouts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utilities.Driver;

public class GnpIssuers extends Driver{
	
	public WebElement product() {
		driver.switchTo().frame("menu_inbox");
		//return driver.findElement(By.linkText("GNP Tourist Auto"));	
		return driver.findElement(By.id("repPrograms_ctl00_HyperLink1"));
	}
	public WebElement productBlanket() {
		driver.switchTo().frame("menu_inbox");
		//return driver.findElement(By.linkText("GNP Tourist Auto"));	
		return driver.findElement(By.id("repPrograms_ctl04_HyperLink1"));
	}
	
	public Select packages() {
		return new Select(driver.findElement(By.id("ddl_package")));
	}
	
	public Select vehicleType() {
		return new Select(driver.findElement(By.id("ddl_mc")));
	}
	
	public WebElement towedUnits() {
		wait (1000);
		return driver.findElement(By.id("rbl_twu_0"));
	}
	
	public Select liability() {
		return new Select(driver.findElement(By.id("ddl_tpl")));
	}
	
	public Select legalAssistance() {
		return new Select(driver.findElement(By.id("ddl_legalA")));
	}
	
	public Select medicalExpenses() {
		return new Select(driver.findElement(By.id("ddl_me")));
	}
	
	public WebElement travelAssistanceNo() {
		return driver.findElement(By.id("rbl_tourAid_1"));
	}
	public WebElement deductibleFixed() {
		return driver.findElement(By.id("rbl_fixDeductible"));
	}
	
	public WebElement deductibleVariable() {
		return driver.findElement(By.id("rbl_fixDeductible_1"));
	}
	
	public WebElement extendedCoverage() {
		return driver.findElement(By.id("rbl_addedCoverage_0"));
	}
	
	public WebElement vehicleValue() {
		return driver.findElement(By.id("txt_cta"));
	}
	
	public WebElement specialEquipment() {
		return driver.findElement(By.id("txt_SpecialEquipment"));
	}
	
	public WebElement trailer() {
		return driver.findElement(By.id("txt_bbwt"));
	}
	
	public WebElement unit1() {
		return driver.findElement(By.id("txt_trvt"));
	}
	
	public WebElement unit2() {
		return driver.findElement(By.id("txt_trvt2"));
	}
	
	public WebElement unit3() {
		return driver.findElement(By.id("txt_trvt3"));
	}
	
	public WebElement days() {
		wait(1000);
		return driver.findElement(By.id("txt_duracion"));
	}
	//Insured Information
	public WebElement insuredAndVehicleDataTab() {
		wait(2000);
		//driver.switchTo().activeElement();
		return driver.findElement(By.xpath(".//*[@id='tab2']"));
	}
	
	public Select personType() {
		return new Select(driver.findElement(By.id("ddl_personType")));
	}
	
	public WebElement taxId() {
		return driver.findElement(By.id("txt_rfc"));
	}
	
	public WebElement firstName_Company() {
		return driver.findElement(By.id("txt_Nombre"));
	}
	
	public WebElement lastName() {
		return driver.findElement(By.id("txt_Apellidos"));
	}
	
	public WebElement additionalDriver() {
		return driver.findElement(By.id("txt_driver"));
	}
	
	public Select gender() {
		return new Select(driver.findElement(By.id("ddl_sex")));
	}
	
	public Select citizenship() {
		return new Select(driver.findElement(By.id("ddl_Citizenship")));
	}
	
	public Select occupation() {
		return new Select(driver.findElement(By.id("ddl_Occupation")));
	}
	
	public WebElement address() {
		return driver.findElement(By.id("txt_Domicilio"));
	}
	
	public WebElement city() {
		return driver.findElement(By.id("txt_Ciudad"));
	}
	
	public Select country() {
		return new Select(driver.findElement(By.id("ddl_Pais")));
	}
	
	public Select state() {
		return new Select(driver.findElement(By.id("ddl_Estado")));
	}
	
	public WebElement zip() {
		return driver.findElement(By.id("txt_CP"));
	}
	
	public WebElement phone() {
		return driver.findElement(By.id("txt_Tel"));
	}
	
	public WebElement email() {
		return driver.findElement(By.id("txt_email"));
	}
	
	public WebElement driverLicense() {
		return driver.findElement(By.id("txt_drvLicense"));
	}
	//Vehicle Description
	public Select vehicleYear() {
		return new Select(driver.findElement(By.id("ddl_VehAnio")));
	}
	
	public Select make() {
		return new Select(driver.findElement(By.id("ddl_VehMarca")));
	}
	
	public Select model() {
		return new Select(driver.findElement(By.id("ddl_VehModelo")));
	}
	
	public Select vehicleTypeAndCapacity() {
		return new Select(driver.findElement(By.id("ddl_VehType")));
	}
	
	public Select vehicleCountry() {
		return new Select(driver.findElement(By.id("ddl_VehCountry")));
	}
	
	public Select vehicleState() {
		return new Select(driver.findElement(By.id("ddl_VehState")));
	}
	
	public WebElement plates() {
		return driver.findElement(By.id("txt_VehPlacas"));
	}
	
	public WebElement vehicleId() {
		return driver.findElement(By.id("txt_VehSerie"));
	}
	//Trailer
	public Select yearTrailer() {
		return new Select(driver.findElement(By.id("ddl_bbwty1")));
	}
	
	public WebElement makeTrailer() {
		return driver.findElement(By.id("txt_bbwtma1"));
	}
	
	public WebElement modelTrailer() {
		return driver.findElement(By.id("txt_bbwtmo1"));
	}
	
	public WebElement typeCapacityTrailer() {
		return driver.findElement(By.id("txt_bbwtType"));
	}
	
	public WebElement idTrailer() {
		return driver.findElement(By.id("txt_bbwtvi1"));
	}
	
	public WebElement licenseTrailer() {
		return driver.findElement(By.id("txt_bbwtl1"));
	}
	
	//Unit 1
	public Select yearUnit1() {
		return new Select (driver.findElement(By.id("ddl_tbtty1")));
	}
		
	public WebElement makeUnit1() {
		return driver.findElement(By.id("txt_tbttma1"));
	}
	
	public WebElement modelUnit1() {
		return driver.findElement(By.id("txt_tbttmo1"));
	}
		
	public Select typeUnit1() {
		return new Select (driver.findElement(By.id("ddl_tbttType")));
	}
		
	public WebElement idUnit1() {
		return driver.findElement(By.id("txt_tbttvi1"));
	}
		
	public WebElement licenseUnit1() {
		return driver.findElement(By.id("txt_tbttl1"));
	}
	//Unit 2
	public Select yearUnit2() {
		return new Select (driver.findElement(By.id("ddl_tbtty2")));
	}
			
	public WebElement makeUnit2() {
		return driver.findElement(By.id("txt_tbttma2"));
	}
		
	public WebElement modelUnit2() {
		return driver.findElement(By.id("txt_tbttmo2"));
	}
			
	public Select typeUnit2() {
		return new Select (driver.findElement(By.id("ddl_tbttType2")));
	}
			
	public WebElement idUnit2() {
		return driver.findElement(By.id("txt_tbttvi2"));
	}
			
	public WebElement licenseUnit2() {
		return driver.findElement(By.id("txt_tbttl2"));
	}
	
	//Unit 2
	public Select yearUnit3() {
		return new Select (driver.findElement(By.id("ddl_tbtty3")));
	}
				
	public WebElement makeUnit3() {
		return driver.findElement(By.id("txt_tbttma3"));
	}
			
	public WebElement modelUnit3() {
		return driver.findElement(By.id("txt_tbttmo3"));
	}
				
	public Select typeUnit3() {
		return new Select (driver.findElement(By.id("ddl_tbttType3")));
	}
				
	public WebElement idUnit3() {
		return driver.findElement(By.id("txt_tbttvi3"));
	}
				
	public WebElement licenseUnit3() {
		return driver.findElement(By.id("txt_tbttl3"));
	}
	
	// Payment tab
	public WebElement paymentTab() {
		wait (1000);
		return driver.findElement(By.id("tab3"));
	}
	
	public Select generalConditions() {
		return new Select(driver.findElement(By.id("ddl_clientInformed")));
	}
	
	public Select damages() {
		return new Select(driver.findElement(By.id("ddl_damagesChecked")));
	}
	
	public Select termsAndConditions() {
		return new Select(driver.findElement(By.id("ddl_printTerms")));
	}
	
	public Select paymentMethod() {
		return new Select(driver.findElement(By.id("ddl_cc_owner")));
	}
	
	public WebElement purchase() {
		return driver.findElement(By.id("btnOK"));
	}
	
	public void confirmation() {
		wait(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public WebElement closePolicy() {
		return driver.switchTo().activeElement();
	}

	public WebElement policy() {
		return driver.findElement(By.id("Label_succesful"));
	}

}
