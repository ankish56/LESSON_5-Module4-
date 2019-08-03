import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHtmlUnit {

	public static void main(String[] args) {

		String path = "D:\\Softwares\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver" ,path);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D://BDD/Lesson5-HTMLPages/TestHtmlUnit.html");
	}
}
