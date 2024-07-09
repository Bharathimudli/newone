package Runner_class;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\nikhi\\eclipse-workspace\\Magentojavacucumber\\src\\test\\java\\Features\\magento.feature",glue="com.Step_Difinition",publish = true,monochrome = true)
public class magneto_runner {

	public static WebDriver driver;

@BeforeClass
public static void Strat() {
	driver=new ChromeDriver();
}
	
	
	
	
}
