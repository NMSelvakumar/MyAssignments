package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Selva");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("nmss");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("selvakumar49nms@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("selvakumar49nms@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Selva@123");

		WebElement birthDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day = new Select(birthDay);
		day.selectByIndex(12);

		WebElement birthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select(birthMonth);
		month.selectByValue("2");

		WebElement birthYear = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(birthYear);
		year.selectByVisibleText("1992");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
