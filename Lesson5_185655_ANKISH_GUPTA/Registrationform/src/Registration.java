import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Registration {
	public static void main(String[] args) {
		String path = "D:\\Softwares\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver" ,path);
		WebDriver driver = new ChromeDriver();
	driver.get("file:///D://BDD/Lesson5-HTMLPages/WorkingWithForms.html");	
	
	WebElement element = driver.findElement(By.xpath("//*[@id=\"txtUserName\"]"));
	element.sendKeys("Ankish05");
	
	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
	element1.sendKeys("pass123");
	
	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"txtConfPassword\"]"));
	element2.sendKeys("pass123");
	
	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"txtFirstName\"]"));
	element3.sendKeys("Ankish");
	
	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"txtLastName\"]"));
	element4.sendKeys("Gupta");
	
	WebElement radio1 = driver.findElement(By.id("rbMale"));
	radio1.click();
	
//	WebElement radio2 = driver.findElement(By.id("rbFemale"));
//radio2.click();
	
	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"DOB\"]"));
	element5.sendKeys("05/06/1996");
	
	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"txtEmail\"]"));
	element6.sendKeys("ankish@gmail.com");

	WebElement element7 = driver.findElement(By.xpath("//*[@id=\"txtAddress\"]"));
	element7.sendKeys("ERC Capgemini Pune");
	
	WebElement element8 = driver.findElement(By.name("City"));
	new Select(element8).selectByVisibleText("Pune");
	
	WebElement element9 = driver.findElement(By.xpath("//*[@id=\"txtPhone\"]"));
	element9.sendKeys("1234567890");
	
	
	WebElement checkbox = driver.findElement(By.name("chkHobbies"));
	for(int i=0;i<3;i++) {
		checkbox.click();
		checkbox.isSelected();
	}
	
	
}
}