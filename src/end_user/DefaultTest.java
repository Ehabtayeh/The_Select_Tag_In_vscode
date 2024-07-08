package end_user;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/index.html");

		String title = driver.getTitle();
		System.out.println(title);

		List<WebElement> myOptionTotal = driver.findElements(By.tagName("option"));
		System.out.println("Th All options is :");
		for (int i = 0; i < myOptionTotal.size(); i++) {
			System.out.println(myOptionTotal.get(i).getText());
			
		}
		System.out.println("Th total number of options =  " + myOptionTotal.size() + "\n");

		


	}

}
