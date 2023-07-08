package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();	
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Selva");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("NM");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Selva(Local)");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("NM(Local)");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("IT");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Test Description");
		driver.findElement(By.xpath("//input[@name='primaryEmail']")).sendKeys("selvakumar49nms@gmail.com");
		
		WebElement stateProv = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select state = new Select(stateProv);
		state.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();	
		driver.findElement(By.xpath("//a[text()='Edit']")).click();	
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();

		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Test Importance");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		
		System.out.println("The tile of Resulting page is: " + title);
	}

}
