import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajdeep\\Desktop\\Driver\\chromedriver4.exe");
		WebDriver driver= new ChromeDriver();
      driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm2");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
	driver.switchTo().alert().dismiss();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//button[contains(text(),'Run »')]")).click();
	Thread.sleep(3000);
	driver.close();
	
	}

}
