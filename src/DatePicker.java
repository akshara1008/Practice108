import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajdeep\\Desktop\\Driver\\chromedriver4.exe");
		WebDriver driver= new ChromeDriver();
      driver.navigate().to("https://formy-project.herokuapp.com/form");
      driver.findElement(By.id("radio-button-1")).click();
      //Select select= new Select(driver.findElement(By.id("//body/div[1]/form[1]/div[1]/div[4]/div[1]")));
      //select.selectByVisibleText("College");
      WebElement date=driver.findElement(By.id("datepicker"));
      date.click();
      date.sendKeys("11/20/2020");
     
      
      
	}

}
