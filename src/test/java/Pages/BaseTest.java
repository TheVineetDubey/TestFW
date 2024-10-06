package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    public static Properties prop = new Properties();
    public static FileReader fr;
    public static Properties loc= new Properties();
    @BeforeTest
    public void setup() throws IOException {

        if (driver == null) {
            //System.out.println("the path is "+ System.getProperty("user.dir"));
            FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\java\\Resources\\Config.properties");
            FileReader fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\java\\Resources\\locators.properties");
            prop.load(fr);
        }
        if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
            //WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(prop.getProperty("testurl"));

        } else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
            //WebDriverManager.chromedriver().setup();
            driver = new FirefoxDriver();
            driver.get(prop.getProperty("testurl"));
        }
    }
        @AfterTest

        public void teardown () {
            driver.close();
            System.out.println("close");

        }
    }
