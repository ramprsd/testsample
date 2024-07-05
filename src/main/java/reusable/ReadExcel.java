package reusable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    public static String getValueFromExcel(String sheetName, int row, int col) throws IOException {

        FileInputStream excelFile = new FileInputStream(new File("src/main/resources/datasheet/SampleTestData.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        return sheet.getRow(row).getCell(col).getStringCellValue();

    }

}
