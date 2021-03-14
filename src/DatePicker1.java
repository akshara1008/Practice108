import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajdeep\\Desktop\\Driver\\chromedriver4.exe");
		WebDriver driver= new ChromeDriver();
      driver.navigate().to("https://formy-project.herokuapp.com/form");
	}

}
