package collector;

import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EXCELMainCollector {

    public List<String[]> getList() {
        return Collections.unmodifiableList(list);
    }

    private List<String[]> list ;
    private String filename, sheetName;
    private  Sheet sheet;

    private XSSFWorkbook workbook;



public EXCELMainCollector(String filename, String sheetName, short totalColumnForRead){
    list = new ArrayList<>();

        try(InputStream inputStream = new FileInputStream(filename)){
        ZipSecureFile.setMinInflateRatio(0);
        workbook = new XSSFWorkbook(inputStream);

        if (sheetName == null)  {sheet = workbook.getSheetAt(0);
        }else {sheet = workbook.getSheet(sheetName);}

        for (Row row: sheet){
            String[] array = new String[totalColumnForRead];
            for (int i = 0; i < array.length; i++) {
                Cell cell = row.getCell(i);
                if (cell == null)continue;
                String b=getString(cell);
                if (b == null)continue;
                array[i]=b;
            }

            list.add(array);
        }
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }



}



    private String getString(Cell cell) {
        String s=null;
        switch (cell.getCellType()) {
            case STRING :
                return (cell.getStringCellValue());



            case NUMERIC :
                return String.format("%.2f", cell.getNumericCellValue());


        }
        return s;




    }
}
