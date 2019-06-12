package org.sample12;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenExcel {
	public static void main(String[] args) {
		File los=new File("C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Nandhini\\excel\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(los);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s=w.getSheet("Sheet1");
		Row u = s.getRow(1);
		for (int i=0; i<s.getPhysicalNumberOfRows();i++) {
			Row r = s.getRow(i);
			for (int j=0; j<r.getPhysicalNumberOfCells();j++) {
				Cell c = r.getCell(j);
				int k = c.getCellType();
				
			if(k==1)	{
				String name = c.getStringCellValue();
				System.out.println(name);
			}
			if(k==0) {
				if(DateUtil.isCellDateFormatted(c)) {
			String name=new SimpleDateFormat("dd.mm.yyyy").format(c.getDateCellValue());
			System.out.println(name);

			}
				else {
					double d = c.getNumericCellValue();
					long l = (long)d;
					String name=String.valueOf(l);
							
					System.out.println(name);
				}
			}	
			}			
		}		
	}	
}

	}

}
