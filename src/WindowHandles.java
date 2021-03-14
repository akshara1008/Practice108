import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajdeep\\Desktop\\Driver\\chromedriver4.exe");
		WebDriver driver= new ChromeDriver();
      driver.navigate().to("https://www.naukri.com/");
      String parentWindow = driver.getTitle();
      System.out.println(parentWindow);
      
      for(String childWindow: driver.getWindowHandles() ) {
    	  System.out.println(driver.findElements(null));
      }
      Thread.sleep(2000);
      driver.manage().deleteAllCookies();
      driver.quit();
      
	}

	
}
