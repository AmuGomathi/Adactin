package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void excelRead(String sheetname,int r,int c) {
		File fl = new File("C:\\Users\\user\\Desktop\\PROJECT CLASS\\DAY 1 XlRead\\XL Read\\src\\test\\resources\\ExcelSheet\\ProjectApril.xlsx");
		try {
			FileInputStream fis = new FileInputStream(fl);
			Workbook wk = new XSSFWorkbook(fis);
			Sheet sheet = wk.getSheet(sheetname);
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(c);
			System.out.println(cell);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void excelAllData() {
		File fl = new File("C:\\Users\\user\\Desktop\\PROJECT CLASS\\DAY 1 XlRead\\XL Read\\src\\test\\resources\\ExcelSheet\\ProjectApril.xlsx");
				try {
			FileInputStream fis = new FileInputStream(fl);
			Workbook wk = new XSSFWorkbook(fis);
			Sheet sheet = wk.getSheet("Sheet1");
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			System.out.println(physicalNumberOfRows);
			for(int i =0;i<physicalNumberOfRows;i++) {
				Row row = sheet.getRow(i);
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				System.out.println(physicalNumberOfCells);
				for(int j =0;j<physicalNumberOfCells;j++) {
					Cell cell = row.getCell(j);
					System.out.println(cell);
				}
			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void excelformat(){
		File fl = new File("C:\\Users\\user\\Desktop\\PROJECT CLASS\\DAY 1 XlRead\\XL Read\\src\\test\\resources\\ExcelSheet\\ProjectApril.xlsx");
				
		try {
			FileInputStream fis = new FileInputStream(fl);
			Workbook wk = new XSSFWorkbook(fis);
			Sheet sheet = wk.getSheet("Sheet1");
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			System.out.println(physicalNumberOfRows);
			for(int i =0;i<physicalNumberOfRows;i++) {
				Row row = sheet.getRow(i);
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				//System.out.println(physicalNumberOfCells);
				for(int j =0;j<physicalNumberOfCells;j++) {
					Cell cell = row.getCell(j);
					int cellType = cell.getCellType();
					if(cellType==1) {
						String stringCellValue = cell.getStringCellValue();
						System.out.println(stringCellValue);
					}else if(cellType==0) {
						if(DateUtil.isCellDateFormatted(cell)) {
							Date dateCellValue = cell.getDateCellValue();//
							SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
							String format = sf.format(dateCellValue);
							System.out.println(format);
						}else {
							double numericCellValue = cell.getNumericCellValue();
							long number = (long)numericCellValue;
							System.out.println(number);
							
						}
					}
					
				}
			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args){
//		excelRead("Sheet1", 2, 1);
//		excelRead("Sheet1", 0, 1);
		//ExcelRead.excelAllData();
		excelformat();
	}

}
