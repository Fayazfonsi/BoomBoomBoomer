import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","D:\\chrome driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.youtube.com/");
	 driver.manage().window().maximize();

	}

}
