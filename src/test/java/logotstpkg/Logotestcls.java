package logotstpkg;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Driver;
import java.util.logging.FileHandler;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basepkg.Basecls;
import logopagepkg.Logopagecls;

public class Logotestcls extends Basecls
{
	@Test
	public void test() throws Exception {
		Logopagecls sw = new Logopagecls(driver);
		FileInputStream ob = new FileInputStream("C:\\Users\\user\\Documents\\Book1111.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ob);
		XSSFSheet sh = wb.getSheet("Sheet1");
		boolean logo=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/a/img")).isDisplayed();
		if(logo )
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(src, new File("./Screenshot/logo.png"));
		int row = sh.getLastRowNum();
	
		for (int i = 1; i <= row; i++) {

			String email = sh.getRow(i).getCell(0).getStringCellValue();
			driver.navigate().refresh();
			String pass = sh.getRow(i).getCell(1).getStringCellValue();
			driver.navigate().refresh();
			
			sw.shop();
			sw.setValues(email, pass);
			sw.loginn();
			sw.addtocart();
			sw.checkout();


		}

	}
	

}
