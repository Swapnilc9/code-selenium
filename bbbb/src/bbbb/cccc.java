package bbbb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cccc {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","\"C:\\Users\\16092\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver abc = new ChromeDriver();
		
		abc.get("https://www.facebook.com/");
        abc.close();
	}

}
