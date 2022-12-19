package xcelreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelReder {
	public static void main(String[] args) throws IOException {

		String file = "C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumproject\\Country.xlsx";

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(1);
		int row = sheet.getLastRowNum();
		int cell = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i <= row; i++) {

			XSSFRow r = sheet.getRow(i);

			for (int j = 0; j < cell; j++) {

				String c = r.getCell(j).toString();
				System.out.print(c + " - ");

			}
			System.out.println();

		}

	}

}
