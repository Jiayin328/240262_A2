//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment2
//Matric: #240262
//Name: #Yap Jia Yin

package com.uum._a2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet{

    XSSFWorkbook workbook = new XSSFWorkbook();;
    XSSFSheet sheet = workbook.createSheet("Line of Codes");
    
    String fileName;
    String Detail[][];
    String Attribute[][];
    String Data[][];
    String Output[][];
    
    public ExcelSheet(String filename) {
        sheet.setDefaultColumnWidth(10);
        this.fileName = filename;
    }
    
    public String[][] Details(String semester, String course, String group, String task) {
        Detail = new String[][] {{"Semester",semester},{"Course",course},{"Group",group},
            {"Task",task},{}};
        return Detail;
    }
    
    public ExcelSheet Data(Map<String, Integer> map, String name, String matric, 
            String loc, String blank, String comment, String actLoc, String ttl) {
        
        String key[] = new String [map.size()];
        String value[] = new String [map.size()];
        
        int a = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            key[a] = entry.getKey();
            value[a] = Integer.toString(entry.getValue());
            a++;
        }
        
        //attributes
        String attribute[] = new String[key.length + 6];
        attribute[0] = "Matrix";
        attribute[1] = "LOC";
        attribute[2] = "Blank";
        attribute[3] = "Comment";
        attribute[4] = "Actual LOC";
        for (int i=5; i<(attribute.length-1); i++) {
            attribute[i] = key[(i-5)];
        }
        attribute[5 + key.length] = "Total";
        String attributeList[][] = {{"","","","","","Java keywords"},attribute};
    
        //data
        String [] data = new String [value.length + 6];
        data[0]=matric;
        data[1]=loc;
        data[2]=blank;
        data[3]=comment;
        data[4]=actLoc;
        for (int i=5; i<(data.length-1); i++) {
            data[i] = value[(i-5)];
        }
        data[5 + value.length] = ttl;
        String dataList[][] = {data};
        
        this.Data = dataList;
        this.Attribute = attributeList;
        return this;
    }
    
    public void arrange() {

        Output = new String[Detail.length + Attribute.length + Data.length][];
        int i = 0;
        for (; i < Detail.length; i++) {
            Output[i] = new String[Detail[i].length];
            for (int b = 0; b < Detail[i].length; b++) {
                Output[i][b] = Detail[i][b];
            }
        }
        for (int b = 0; b < Attribute.length; b++) {
            Output[i] = Attribute[b];
            i++;
        }
        for (int b = 0; b < Data.length; b++) {
            Output[i] = Data[b];
            i++;
        }

        int rowNum = 0;
        for (Object[] attribute : Output) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : attribute) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
    
        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
