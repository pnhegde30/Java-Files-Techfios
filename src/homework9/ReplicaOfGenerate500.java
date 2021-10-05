package homework9;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReplicaOfGenerate500 {

		public static void main(String[] args) throws IOException {
			
			int max = 999;
			int min = 101; 
			Random ranNum = new Random();
			Set<Integer> sName = new LinkedHashSet<Integer>();
			
			//Code for random number with a set range
			int answer = ranNum.nextInt(max - min + 1) + min;
			
			while(sName.size() != 500){
				sName.add(ranNum.nextInt(max - min + 1) + min);
			}
			
			//Create Workbook and Worksheet
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet ws = wb.createSheet("RandomNumbers");

			ws.createRow(0).createCell(0).setCellValue("RANDOM NUMs");
			
			int count = 1;
			for(Integer i : sName) {
				ws.createRow(count).createCell(0).setCellValue(i);
				count++;
			}
			
			//String path = "Data\\myExcel.xlsx";
			File fName = new File("Data\\myRandom.xlsx");
			FileOutputStream fo = new FileOutputStream(fName);
			
			wb.write(fo);
			wb.close();
			fo.close();
			
			//For reading the Excel Spreadsheet
			File fold = new File("Data\\myExcel.xlsx");
			FileInputStream fi = new FileInputStream(fold);
			
			//For reading: need the WorkbookFactory
			Workbook wb2 = WorkbookFactory.create(fi);
			
			//Getting Worksheet
			Sheet ws2 = wb.getSheetAt(0);
			
			//Row and Cell count in For Loop
			for(int i = 0; i < 500; i++) {
				System.out.println(ws2.getRow(i).getCell(0));
			}
			System.out.println("-------------");
			
		
			//How many number of rows there are 
			//AKA Row Count
			System.out.println("Row Count: ");
			System.out.println(ws.getPhysicalNumberOfRows());
			
			//How many number of columns there are
			//AKA Column Count
			System.out.println("-------------");
			System.out.println("Column Count: ");
			System.out.println(ws.getRow(0).getPhysicalNumberOfCells());
			

		}

	}


