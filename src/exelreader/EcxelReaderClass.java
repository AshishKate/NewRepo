package exelreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcxelReaderClass {
	public static void main(String[] args) throws IOException {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\src\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String path = "C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\ktctcBook.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rn = sh.getLastRowNum();
		int cn = sh.getRow(1).getLastCellNum();

		for (int i = 0; i <= rn; i++) {
			XSSFRow row = sh.getRow(i);
			for (int j = 0; j < cn; j++) {
				XSSFCell cell = row.getCell(j);
				CellType celltype = cell.getCellType();

				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue() + " / ");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue() + " / ");
					break;
				case NUMERIC:
					System.out.print(+cell.getNumericCellValue() + " / ");
					break;
				case FORMULA:
					System.out.print(cell.getCellFormula() + " / ");
					break;

				default:
					System.out.print("Can not decide cell type");
					break;
				}

			}
			System.out.println();

		}

	}

}
