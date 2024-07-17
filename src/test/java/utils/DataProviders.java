package utils;

import config.ConfigLoader;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders {
    @DataProvider(name="excelDataProvider")
    public Object[][] excelDataProvider() throws IOException {
        String filePath = ConfigLoader.getProperty("excelFilePath");
        String sheetName = "searchTerm";
        return ExcelUtils.getExcelData(filePath,sheetName);
    }
}
