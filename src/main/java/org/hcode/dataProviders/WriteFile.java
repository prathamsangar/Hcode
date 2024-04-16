package org.hcode.dataProviders;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hcode.utils.ReadPropertyFile;

public class WriteFile {

	public static void writeToExcel(int rowNum, int colNum, String data) {

		// Sheet path

		try (FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Executables/book1.xlsx");
				Workbook workbook = new XSSFWorkbook(fis)) {

			// Get the sheet name you want to add data to

			Sheet sheet = workbook.getSheet(ReadPropertyFile.getValue("WriteDataSheetName"));

			// Create or get the row and cell where you want to add the data
			Row row = sheet.getRow(rowNum);
			if (row == null) {
				row = sheet.createRow(rowNum);
			}
			Cell cell = row.createCell(colNum);

			// Set the data to the cell
			cell.setCellValue(data);

			// Write the workbook back to the Excel file

			try (FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"/src/test/resources/Executables/book1.xlsx")) {
				workbook.write(fos);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


