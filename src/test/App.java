package Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
  
  public static void main(string[] args) {
      System.setproperty("webdriver.chrome.driver", ""
      WebDriver driver = new ChromeDriver();
      driver.get("http://www.gmail.com/");
      system.out.println("Test Successful");
      driver.manage().window().maximize();
  }

}
