package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    private static Object getCellValue(Cell cell){
        switch (cell.getCellType()){
            case STRING:
                return cell.getStringCellValue();
            case BOOLEAN:
                return cell.getBooleanCellValue();
            case NUMERIC:
                return cell.getNumericCellValue();
            default:
                return null;
        }
    }

    public static Object[][] getExcelData(String filePath, String sheetName) throws IOException{
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
        Object[][] data = new Object[rowCount-1][colcount];
        for(int i =1;i<rowCount;i++){
            Row row = sheet.getRow(i);
            for(int j=0;j<colcount;j++){
                Cell cell = row.getCell(j);
                data[i-1][j]=getCellValue(cell);
            }
        }
        workbook.close();
        fis.close();
        return data;
    }
}
