package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	private Properties configFile;
	public Config()
	{
		InputStream is = null;
        try {
            this.configFile = new Properties();
            File file = new File("config.properties");
            System.out.println(file.exists());
            is = new FileInputStream(file);
            this.configFile.load(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public String getProperty(String key) 
	{
		String value = this.configFile.getProperty(key);
		return value;
	}

}
