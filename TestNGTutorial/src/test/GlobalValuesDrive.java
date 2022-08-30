package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//To fetch values present in .properties file
		Properties prop=new Properties();
		//We need to mention the path of .properties file by creating object of FileInputStream
		//FileInputStream is to read the values from the file
		FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Nisha\\SeleniumTesting\\TestNGTutorial\\src\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		//To set the property at runtime
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		//FileOutputStream is to write values to a file
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Administrator\\Nisha\\SeleniumTesting\\TestNGTutorial\\src\\data.properties");
		prop.store(fos, null);
	}

}
