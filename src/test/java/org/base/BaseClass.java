package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions ac;
	public static Actions a;
	public static Select s;
	
	
	public static void chromeBrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void FireFoxBrowserLaunch() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	public void launchIEBrowser() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
	}
	
	public void launchEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	
	public static void refreshPage() {
		driver .navigate().refresh();
	}
	
	public static void urlLaunch(String url) {
       driver.get(url);		
	}
	
	public static void fillTxt(WebElement e,String text) {
		e.sendKeys(text);
	}
	
	public static void btnClick(WebElement e) {
		e.click();
	}
	
	public static void clickBtnJava(WebElement e) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);
	}
	
	public static void fillTxtJava(String text,WebElement e) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','" + text + "')", e);
	} 
	
	public static void scrollDownJava(WebElement e) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",e);
	}
	
	public static void scrollUpJava(WebElement e) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)",e);
	}
	
	public static void mouseHover(WebElement e) {
		ac = new Actions(driver);
		ac.moveToElement(e).perform();
	}
	
	public static void draggingElement(WebElement source,WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(source,target).perform();
	}
	
	public static void singleSelectDropDown(WebElement e,String text) {
		s = new Select(e);
		s.selectByVisibleText(text);
	}
	
	public static void screenshot(String imageName) throws IOException {
	    //1.typecast
		TakesScreenshot ts = (TakesScreenshot) driver;
	    //2.getScreenshotAs----->to take a snap and it will store in a temp file
		File src = ts.getScreenshotAs(OutputType.FILE);
	    //3.desired folder where i want to save  
		File des = new File("D:\\JavaSelenium-Workspace\\JUnit-EveningBatch\\Screenshots\\"+imageName+".png");
	    //4.copy and paste to my desired folder 
		FileUtils.copyFile(src,des);
	}
	
	public static void timeTaken() {
		Date d = new Date();
		System.out.println(d);
	}
	
	public static void fetchTitle() {
	   String name = driver.getTitle();
	   System.out.println("Title : "+name);
	}
	
	public static void currentUrl() {
	   String url = driver.getCurrentUrl();
	   System.out.println("Current Url :"+url);
	}
	
	public  static void closeCurrentWindow() {
		driver.close();
	}
	
	public static void closeEntireBrowser() {
		driver.quit();

	}
	

/*......................................................................................................................................... */
	
	public static String readExcel(String filename, String sheetName, int rownum, int cellnum) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\JSelenium - Workspace\\DataDriven-4pmBatch\\Data\\"+filename+".xlsx");
		
		Workbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet = workbook.getSheet(sheetName);
		
		Row row = sheet.getRow(rownum);
		
		Cell cell = row.getCell(cellnum);
		
		int cellType = cell.getCellType();
		
		String value = "";
		
		if (cellType == 1) {
			value = cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
			value = s.format(d);
		}
		else {
			double d = cell.getNumericCellValue();
			long l = (long) d;
			value = String.valueOf(l);
		}
		return value;
	}
	
	
/*.........................................................................................................................................*/	
	
	public static void excelReadandWrite(String fileName, String sheetName, int rowNum, int cellNum ,String text) throws IOException {
        
		File f = new File("D:\\JSelenium - Workspace\\DataDriven-4pmBatch\\Data\\"+fileName+".xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet = workbook.getSheet(sheetName);
		
		Row row = sheet.getRow(rowNum);
		
		Cell createCell = row.createCell(cellNum);
		
		createCell.setCellValue(text);
		
		FileOutputStream fos = new FileOutputStream(f);
		
		workbook.write(fos);	
	}

	
	
}
