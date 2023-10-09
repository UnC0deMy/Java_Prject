package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\NEW SELENIUM\\chromedriver-win64\\chromedriver.ex");
		
		WebDriver driver = new ChromeDriver();
	}

}
