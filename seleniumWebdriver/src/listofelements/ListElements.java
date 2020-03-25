package listofelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListElements {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		List<WebElement>count_links=driver.findElements(By.tagName("a"));
		int i;
		for(i=0;i<count_links.size();i++){
			
		System.out.println(count_links.get(i).getText()+"-"+count_links.get(i).getAttribute("href"));

	}

}
}