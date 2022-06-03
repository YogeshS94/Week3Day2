package Week3Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

//1. Launch the URL https://www.ajio.com/
//2. In the search box, type as "bags" and press enter
//3. To the left  of the screen under " Gender" click the "Men"
//4. Under "Category" click "Fashion Bags"
//5. Print the count of the items Found. 
//6. Get the list of brand of the products displayed in the page and print the list.
//7. Get the list of names of the bags and print

public class AjioExercise {
	public static void main(String arg[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		
		// Enter Bags in search tab
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class=\"ic-search\"]")).click();
		Thread.sleep(5000);
		
		// Check Men in gender
		driver.findElement(By.xpath("//label[contains(@class,'facet-linkname-genderfilter') and @for='Men']")).click();
		Thread.sleep(5000);
		
		// Check Fashion Bags
		driver.findElement(By.xpath("//label[contains(@class,'facet-linkname-l1l3nestedcategory') and @for='Men - Fashion Bags']")).click();
		Thread.sleep(5000);
		
		// Count the no.of bag
		String count = driver.findElement(By.xpath("//div[@class=\"length\"]")).getText();
		System.out.println("Total Bag count is: " + count);
		
		// Get the brand name and print it
		List<WebElement> kd = driver.findElements(By.className("brand"));
		System.out.println(kd.size());
		
		for(int i=0; i<kd.size(); i++) {
			System.out.println(kd.get(i).getText());
		}

		// Get the bag names and print it		
		List<WebElement> kd1 = driver.findElements(By.className("nameCls"));
		System.out.println(kd1.size());
		
		for(int i=0; i<kd1.size(); i++) {
			System.out.println(kd1.get(i).getText());
		}	
	}
}
