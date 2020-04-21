package FirstMaven.readingexceldatanew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://app.hubspot.com/login?loginRedirectUrl=https://app.hubspot.com/academy/&__cf_chl_jschl_tk__=0ff07b60189dd44eaa160421b123a6f1abbcadb0-1586602568-0-AQKanwssGiWbPHapl906yPMj0qAU1vL_LchWAN_yyPjI4ziN6At8mYSdfOY95DxC-krcEGUNIzxAzKhHLVgNlUSDISMKTgzD4Vw3xZ5lC1uRnDhrWGyeAWH6VMXyUw_k6MJUyJp6GvQArsJWZaQpsS5zVb6UYuaXWH-HKBo2T6WFyw7l12tl-bV8X-qFrWMqUly8uBZ9VLgIgNPsRNzBMQ7ZLnFv2_slUfrpd7f4uNW8Cn6UC9ZLln-XfBcJTrq9vf212KhSD8IXW7urto0qD_8Ug8ZQNIDM-LxJLLPv8M1rV-XlSb_ZQifWvM22yr7CZsifI1HZfjlLwwfQvCjggQ-nR95dvJi88BWQ9CVYB33JMD6xwcFE891fqb1BGTMejPpOzA5ekjdfRNg3jJodL78");

	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	Thread.sleep(4000);
	Xls_Reader reader=new Xls_Reader("C:\\Users\\Ramakrishna\\eclipse-workspace\\readingexceldatanew\\book2.xlsx");
	String sheetName="Sheet1";
	int rowCount=reader.getRowCount(sheetName);
	for(int rowNum=2; rowNum<=rowCount;rowNum++)
	{
		String loginid=reader.getCellData(sheetName, "firstname", rowNum);
		String password=reader.getCellData(sheetName, "lastname", rowNum);
		System.out.println(loginid+" "+password);
		//driver.findElement(By.cssSelector("#username")).clear();
		driver.findElement(By.cssSelector("#username")).sendKeys(loginid);
		//driver.findElement(By.cssSelector("#password")).clear();
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
      Thread.sleep(3000);
      driver.navigate().refresh();
      Thread.sleep(3000);
	}
			}

}
