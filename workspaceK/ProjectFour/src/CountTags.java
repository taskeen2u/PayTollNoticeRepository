import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CountTags {

	public static void main(String[] args) {
		int i;
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		
		List <WebElement> name = driver.findElements(By.tagName("a"));
		i = name.size();
		System.out.println(i);
		
		for (int n=0; n<i; n++)
		{
			String strLnk = driver.findElements(By.tagName("a")).get(n).getText();
			System.out.println(strLnk);
		//	driver.findElement(By.linkText(strLnk)).click();
		  // driver.navigate().back(); 
		}
		
		System.out.println("\n");
		
		for (int n=0; n<i; n++)
		{
			String strLnk = driver.findElements(By.tagName("a")).get(n).getText();
			System.out.println(strLnk);
			driver.findElement(By.linkText(strLnk)).click();
		   String strTit = driver.getTitle();
		  
		   if (strTit.equals("Under Construction: Mercury Tours"))
				   System.out.println(strLnk  + "\t" + "Under Construction");
		   else
		      System.out.println(strLnk  + "\t" + strTit);
		   driver.navigate().back(); 
		}
		
		
		
		// if (strTit.equals("Under construction"))
			   //System.out.println(strLnk  + "Under construction");
		   //else
			
		
}
}
