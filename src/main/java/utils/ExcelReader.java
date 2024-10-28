package utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader {
	@DataProvider(name="logindata")
	public String[][] getData() throws Exception {
		File excelFile = new File("/test.com/src/main/java/testdata/testexcel.xlsx");
		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int noofRows = sheet.getPhysicalNumberOfRows();
		int noofColumns = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[noofRows-1] [noofColumns];
		for (int i = 0; i < noofRows-1; i++) {
			for (int j = 0; j < noofColumns; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}

		}
		workbook.close();
		fis.close();
		return data;
	}
}



