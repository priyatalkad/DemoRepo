package JavaConcept;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowPopUpHandlingUsingRobotCls {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://Users//srika//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("identifier")).sendKeys("tvpriya@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("priyarocks@1412");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		/*
		 * int size = driver.findElements(By.tagName("iframe")).size();
		 * System.out.println(size);
		 */

		/*
		 * for(int i=0; i<=size; i++){ driver.switchTo().frame(i); int
		 * total=driver.findElements(By.xpath("html/body/a/img")).size();
		 * System.out.println(total); driver.switchTo().defaultContent(); }
		 * driver.switchTo().frame("hist_frame");
		 */
		
		
		
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=':xs']/div/div")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@class='a1 aaA aMZ']")).click();
		Thread.sleep(6000);
		
		Robot r = new Robot();
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(new StringSelection("C:\\Users\\srika\\Desktop\\sample.txt"), null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.name("to"))).click().sendKeys("priyatalkad@gmail.com").build().perform();
		//driver.findElement(By.xpath("//*[@id=':10w']")).sendKeys("priyatalkad@gmail.com");
		//driver.findElement(By.xpath("//*[@id=':11e']")).sendKeys("Sent thru automation");
		
		/*Thread.sleep(4000);
		
		 	Actions actions = new Actions(driver);
	        actions.moveToElement(driver.findElement(By.xpath("//*[@id=':11o']")));
	        actions.click();
	        actions.sendKeys("priyatalkad@gmail.com");
	        actions.build().perform();*/
		

	}
}
