package gmibank.excelautomation;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadExcel01{



    @Test
    public void test() throws IOException {
        String path = ".\\src\\test\\resources\\SaleHoo Tedarikci listesi.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        System.out.println(workbook.getSheetAt(0).getRow(1).getCell(1));

        int satirSayisi=workbook.getSheetAt(0).getLastRowNum()+1;
        System.out.println(satirSayisi);




    }
}
