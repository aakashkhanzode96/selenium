package Readpropertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.netty.util.AsciiString;

public class Readpropertyfile {

	private static final Properties Prop = null;


	public static void main(String[]args) throws IOException {
		FileInputStream fis = new FileInputStream("./Data/config.properties");
		Properties prop = new Properties();
		Prop.load(fis);
		String value = Prop.getProperty("username");
	    System.out.println(value);}
	
	    
	     public String readPropertyFile(String ProPath,String key) throws IOException {
	    	 FileInputStream fis = new FileInputStream(ProPath);
	    	 Properties prop = new Properties();
	    	 prop.load(fis);
	    	 String value = prop.getProperty(key);
	    	 return value;
		
		
		
		
	}

}
