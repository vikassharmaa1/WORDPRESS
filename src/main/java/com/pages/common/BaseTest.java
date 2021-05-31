package com.pages.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import com.util.ExcelDataExtractor;

public class BaseTest {

	static String RELATIVE_FILE_PATH = "src/test/resources/TestData/";

	@DataProvider(name = "testData")
	public Object[][] dataProviderExcel(Method m) throws IOException {

		FileInputStream fs = new FileInputStream(new File(getTestDataFileName()));
		XSSFWorkbook wb = new XSSFWorkbook(fs);

		XSSFSheet sh = wb.getSheet(this.getClass().getSimpleName());
		if (sh == null) {
			sh = wb.getSheetAt(0);
		}

		return ExcelDataExtractor.getExcelData(sh, m.getName(), wb.getNumberOfSheets(), wb);
	}

	private String getTestDataFileName() {
		String actualFileName = "";
		if (StringUtils.isNotBlank(System.getProperty("bank.environment"))) {

			RELATIVE_FILE_PATH = "src/test/resources/TestData/";
			RELATIVE_FILE_PATH = RELATIVE_FILE_PATH + System.getProperty("bank.environment") + "/";

		}

		File file = new File(RELATIVE_FILE_PATH);
		String[] files = file.list();

		try {
			if (files.length == 0) {

			}
		} catch (Exception e) {
			RELATIVE_FILE_PATH = "src/test/resources/TestData/";
			file = new File(RELATIVE_FILE_PATH);
			files = file.list();
		}

		for (String fileName : files) {
			File verifyFile = new File(RELATIVE_FILE_PATH + fileName);
			if (verifyFile.isFile()) {
				if (this.getClass().getSimpleName().startsWith(fileName.substring(0, fileName.indexOf(".xlsx")))) {
					System.out.println("Matching Data source file found - " + fileName);
					actualFileName = RELATIVE_FILE_PATH + fileName;
				}
			}
		}
		if (actualFileName == "") {
			System.out.println("Matching Data Source file not found");
		}
		return actualFileName;
	}
}
