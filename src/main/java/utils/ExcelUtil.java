package utils;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	public static Workbook wb;
	public static Sheet sh;



	public static String TESTDATA_SHEET_PATH = System.getProperty("user.dir") + "\\src\\main\\java\\testdata\\TestDataak.xlsx";

	public static Object[][] getTestData(String sheetName) {

		System.out.println("Working directory="+System.getProperty("user.dir"));
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(TESTDATA_SHEET_PATH);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		try {
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sh = wb.getSheet(sheetName);

		Object[][] data = new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];

		//System.out.println("Row Count="+sh.getLastRowNum());
		//System.out.println("Col count="+sh.getRow(0).getLastCellNum());

		for (int i = 0; i < sh.getLastRowNum(); i++) {
			for (int j = 0; j < sh.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sh.getRow(i + 1).getCell(j).toString();
			//System.out.print(data[i][j]+"\t");
			}

		}

		return data;

	}
	
	public static String fetchData(String sheetName, int rowNum, int cellNum) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(TESTDATA_SHEET_PATH);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		try {
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sh = wb.getSheet(sheetName);

		String data = sh.getRow(rowNum).getCell(cellNum).toString();

		//System.out.println(data);

		return data;

	}
}
