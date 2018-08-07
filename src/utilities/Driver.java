package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	public static WebDriver driver;
	
	static  {
		 
			
		driver = getDriver();	
		
	       }
	
	public static  WebDriver getDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Automation\\Drivers\\geckodriver.exe");

		driver =  new FirefoxDriver(); 
		   
		return driver;


	}
	
	public static void wait(int valor){
		
		 try {
				Thread.sleep(valor);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		
	}

}
