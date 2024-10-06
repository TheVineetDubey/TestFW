package Utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C:\\automation\\P1\\src\\test\\java\\Resources\\Config.properties");
        Properties p= new Properties();
        p.load(fr);
        System.out.println(p.getProperty("browser"));
        System.out.println(p.getProperty("testurl"));
    }
}
