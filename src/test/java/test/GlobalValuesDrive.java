package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {
	
	public static void main (String [] args) throws IOException {
		
		//Tworzê obiekt klasy Properties, do którego pó¿niej ³adujê plik z rozszerzeniem .properties
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("D:\\PROGRAMY\\EclipseWorkspace\\com.testng3\\src\\test\\java\\data.properties");
		p.load(fis);
		
		// zmieniam propertiesa w locie (bez update w pliku properties)- InputStream tylko "czyta"
		System.out.println("browser przed zmiana: " + p.getProperty("browser"));		
		p.setProperty("browser", "firefox");
		System.out.println("browser po zmianie zmianie: " + p.getProperty("browser"));
		
		// FileOutputStream zapisuje do pliku wiêc po poleceniu .store zapisuje propertiesa do pliku
		FileOutputStream fos = new FileOutputStream("D:\\PROGRAMY\\EclipseWorkspace\\com.testng3\\src\\test\\java\\data.properties");
		p.store(fos, null);
		
	}

}
