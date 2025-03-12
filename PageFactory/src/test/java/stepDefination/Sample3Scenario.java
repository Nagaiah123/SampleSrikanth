package stepDefination;

import io.cucumber.java.en.When;
import pages.Page1;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import io.cucumber.datatable.DataTable;

public class Sample3Scenario {
	@When("User enters the login credentials")
	public void user_enters_the_login_credentials(DataTable dataTable) throws Exception {
		
		List<List<String>> credentials = credentials("C:\\Users\\hi\\eclipse-workspace\\PageFactoryProject\\PageFactory\\src\\test\\resources\\TestData.xlsx");
		dataTable = DataTable.create(credentials);
		System.out.println(dataTable.cell(0, 0));
		System.out.println(dataTable.cell(0, 1));
		Page1.enterusername(dataTable.cell(0, 0));
		Page1.enterpassword(dataTable.cell(0, 1));
	}
	public static List<List<String>> credentials(String excelFilePath) throws Exception {
		List<List<String>> credentials = new ArrayList<>();
		FileInputStream file = new FileInputStream(new File(excelFilePath));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			List<String> rowData = new ArrayList<>();
			if(row!=null) {
				for(int j=0;j<row.getLastCellNum();j++) {
					Cell cell=row.getCell(j);
					if(cell!=null) {
						rowData.add(cell.getStringCellValue());
					}else {
						rowData.add("");
					}
				}
			}
		credentials.add(rowData);
		}
	workbook.close();
	return credentials;
	}
  
	

}
