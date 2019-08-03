import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "D:\\Softwares\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver" ,path);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D://BDD/Lesson5-HTMLPages/PopupWin.html");
		Thread.sleep(10000);
		driver.quit();
	}

}
