package org.hcode.dataProviders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class Dataproviders {
	
	private static String sheetName = "defaultSheet";
	
	public static void setSheetName(String name) {
        sheetName = name;
    }
	
	@DataProvider(name = "filePaths")
	
    public static Object[][] getFilePaths() throws IOException {
        String excelFilePath = System.getProperty("user.dir")+"/src/test/resources/Executables/book1.xlsx";        
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        
        System.out.println(sheetName);

        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        Object[][] data = new Object[rowCount][1];

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i + 1);
            data[i][0] = System.getProperty("user.dir")+row.getCell(0).getStringCellValue(); 
        }
                workbook.close();
        inputStream.close();
        return data;
   
}
	
	

}
