package WebDriver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class fileNameMaker {

	public String  fileNameForLogin(String u, String p){
		// TODO Auto-generated method stub
String filename;
LocalDateTime now=LocalDateTime.now();
System.out.println("Before formatting:" +now);
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy MM:mm:ss");
filename="C:\\Users\\Administrator\\Downloads\\Excelfilereader" +u +"_" + p+"_"+now.format(format)+ "jpg";
return filename;
	}

}
