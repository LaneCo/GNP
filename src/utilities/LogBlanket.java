package utilities;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogBlanket {
	protected static String FILENAME = "C:\\Automation\\Workspace\\GNP\\logTouristAuto.txt";

	//public static void main(String[] args) {
	 public static void write(String line) throws IOException {
         write(FILENAME, line);
     }
	 
	 public static void write(String f, String line) throws IOException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String currentTime = dtf.format(now);
        
         FileWriter aWriter = new FileWriter(f, true);
         aWriter.write(currentTime + " " + line + "\n");
         aWriter.flush();
         aWriter.close();
     }

}
