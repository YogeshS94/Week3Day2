package Week3Day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Classroom Exercise
1) Launch chrome and go to http://www.leafground.com/pages/Link.html
2) Get all the links (using findElements)
3) Click on the first link (using get method with index as 0)
4) Print the title
5) Navigate back on the browser (driver.navigate().back())
6) Get all the links again (using findElements)
7) Print the count of the links (size)
8) print the href value (getAttribute) of the second link*/

public class Exercise1 {
	public static void main(String arg[]) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		WebElement link = links.get(0);
		link.click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		List<WebElement> links1 = driver.findElements(By.tagName("a"));
		System.out.println("Size of the links: " +  links1.size());
		String hh = links.get(2).getAttribute("href");
		System.out.println(hh);		
	}
}
