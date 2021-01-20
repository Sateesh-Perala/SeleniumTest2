package SamvaadQA.com.SamvaadTest2;
//import org.apache.log4j.PropertyConfigurator;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.openqa.selenium.firefox.FirefoxDriver;
// import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	public static WebDriver driver;

	@Test
	public void loginTest() throws HeadlessException, UnsupportedFlavorException, IOException { // Test2: Entering Username and password and click on sign in button
		
		
	//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	// 		String driverpath="//usr/bin/google-chrome";
		
	//	String driverpath="C:\\chromedriver_win32\\chromedriver.exe";
	//	System.setProperty("webdriver.chrome.driver", driverpath);
		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);
		//options.addArguments("head-less-mode");
		driver = new ChromeDriver(options);
		//ChromeOptions options = new ChromeOptions();
		options.addArguments("use-fake-ui-for-media-stream");// allowing the microphone alert window
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("http://qa.dhanushsamvaad.com/");
		driver.manage().window().maximize();
		
		String new1 = driver.getWindowHandle();
		driver.switchTo().window(new1);
		driver.findElement(By.id("username")).sendKeys("testing@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("SamvaadQa@321");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/div/div/form/div[3]/div[2]/div/button")).click();

		String new2 = driver.getWindowHandle();
		driver.switchTo().window(new2);
		driver.findElement(By.xpath("/html/body/app-root/app-schedule/section/div/div/div/div/div[2]/div/form/div/div[4]/button[2]")).click();
	
		String new3 = driver.getWindowHandle();
		driver.switchTo().window(new3);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[1]/form/div/div[1]/div[2]/input")).sendKeys("Session1");
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[2]/button[2]"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		
		driver.get(driver.getCurrentUrl());
		WebElement welement = driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[8]/button"));
		welement.click();
	
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("Madhukar");
		driver.findElement(By.xpath("/html/body/app-root/app-video-room/div[1]/div/div/form/div[3]/div[2]/div/button")).click();

		
		String new4 = driver.getWindowHandle();
		driver.switchTo().window(new4);
		String new5 = driver.getWindowHandle();
		driver.switchTo().window(new5);

		driver.findElement(By.cssSelector(".icon--2q1XXw.icon-bbb-mute")).click();
		// driver.findElement((By.xpath("//button[@class='lg--Q7ufB buttonWrapper--x8uow button--295UAi']"))).click();
	
		
		driver.findElement(By.cssSelector(".icon--2q1XXw.icon-bbb-video_off")).click();
		
	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.switchTo().window(new3);
	
	
		driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[9]/button[1]")).click(); //text copied to clipboard
		String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting the text that was copied to the clipboard
		driver=new ChromeDriver(options);
		options.addArguments("use-fake-ui-for-media-stream");
		driver.get(myText);
		driver.manage().window().maximize();
		
		String new11 = driver.getWindowHandle();
		driver.switchTo().window(new11);
		
		driver.findElement(By.id("username")).sendKeys("Sateesh");
		driver.findElement(By.id("email")).sendKeys("sateesh.perala@dhanushinfotech.net");
		driver.findElement(By.id("mobile")).sendKeys("9966589549");
		driver.findElement(By.id("occupation")).sendKeys("Devops Engineer");
		driver.findElement(By.id("location")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("/html/body/app-root/app-video-room/div[1]/div/div/form/div[5]/div[2]/div/button")).click();

		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	
		driver= new ChromeDriver(options);
		options.addArguments("use-fake-ui-for-media-stream");
		driver.get(myText);
		driver.manage().window().maximize();
		
		String new12 = driver.getWindowHandle();
		driver.switchTo().window(new12);
		
		
		driver.findElement(By.id("username")).sendKeys("Akhil");
		driver.findElement(By.id("email")).sendKeys("akhil.akshanthala@dhanushinfotech.net");
		driver.findElement(By.id("mobile")).sendKeys("9948449398");
		driver.findElement(By.id("occupation")).sendKeys("Devops Engineer");
		driver.findElement(By.id("location")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("/html/body/app-root/app-video-room/div[1]/div/div/form/div[5]/div[2]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
			driver= new ChromeDriver(options);
			options.addArguments("use-fake-ui-for-media-stream");
			driver.get(myText);
			driver.manage().window().maximize();
			
			String new13 = driver.getWindowHandle();
			driver.switchTo().window(new13);
			
			
			driver.findElement(By.id("username")).sendKeys("Prashanth");
			driver.findElement(By.id("email")).sendKeys("akhil.akshanthala@dhanushinfotech.net");
			driver.findElement(By.id("mobile")).sendKeys("9948449398");
			driver.findElement(By.id("occupation")).sendKeys("Devops Engineer");
			driver.findElement(By.id("location")).sendKeys("Hyderabad");
			driver.findElement(By.xpath("/html/body/app-root/app-video-room/div[1]/div/div/form/div[5]/div[2]/div/button")).click();
		
	}	
		
	public static void main(String[] args) throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException{
		TestClass t = new TestClass();
		//	t.launchDriver();
		t.loginTest();
		
	}
}
