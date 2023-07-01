package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();		
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf Org.");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Selva");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("NM");
		
		WebElement sourceDD = driver.findElement(By.name("dataSourceId"));
		Select selSource = new Select(sourceDD);
		selSource.selectByIndex(4);
		
		WebElement marketingDD = driver.findElement(By.name("marketingCampaignId"));
		Select selMarketing = new Select(marketingDD);
		selMarketing.selectByValue("CATRQ_AUTOMOBILE");
		
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select selOwnership = new Select(ownershipDD);
		selOwnership.selectByVisibleText("Corporation");
		
		driver.findElement(By.name("submitButton")).click();

		//driver.close();	
	}

}
