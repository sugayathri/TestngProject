package listofelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TryingOtherWebsite {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/"); 
driver.manage().window().maximize();
List<WebElement>amazon=driver.findElements(By.tagName("a"));
int i;
for(i=0;i<amazon.size();i++)
{
	System.out.println(amazon.get(i).getText()+"-"+amazon.get(i).getAttribute("href"));
	
}
WebElement l=driver.findElement(By.id("captchacharacters"));
l.sendKeys("hiurow");	
l.submit();;
//driver.close();
	
	}
	

}
