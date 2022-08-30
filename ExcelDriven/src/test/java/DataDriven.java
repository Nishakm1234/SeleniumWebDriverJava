import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
//Identify Testcases column by scanning the entire first row.
//Once column is identified then scan entire testcases column to identify purchase testcase row.
//After grabbing the purchase testcase row-> pull all the data of that row and feed into the test
	
	
	public ArrayList<String> getData(String testcaseName) throws IOException {
		ArrayList<String> a =new ArrayList<String>();
		//XSSFWorkbook accepts FileInputStream argument
		FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\OneDrive\\Documents\\SeleniumProject\\Codes\\datademo.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
			XSSFSheet sheet=workbook.getSheetAt(i);
			
			//Identify Testcases column by scanning the entire first row.
			Iterator<Row>rows=sheet.rowIterator(); //sheet is a collection of rows
			//To access the specific row(1st row)
			Row firstRow=rows.next();
			Iterator<Cell> cells=firstRow.cellIterator(); //row is a collection of cells
			int k=0;
			int column = 0;
			while(cells.hasNext()) {
				Cell value=cells.next();
				if(value.getStringCellValue().equalsIgnoreCase("TestCases")) {
					column=k;
				}
				k++;
			}
			System.out.println(column);
			
			//Once column is identified then scan entire testcases column to identify purchase testcase row.
			while(rows.hasNext()) {
				Row r=rows.next();
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
					//After grabbing the purchase testcase row-> pull all the data of that row and feed into the test
					Iterator<Cell>cv= r.cellIterator();
					while(cv.hasNext()) {
						//System.out.println(cv.next().getStringCellValue());
						//Adding to the ArrayList created
						Cell c=cv.next();
						if(c.getCellType()==CellType.STRING) {
						a.add(c.getStringCellValue());
						}
						else {
							a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
						}
							
					}
				}
			
			}
			}
		}
		return a;
	}
	public static void main(String[] args) throws IOException {
		
		
	}

}
