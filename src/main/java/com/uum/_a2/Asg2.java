//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment2
//Matric: #240262
//Name: #Yap Jia Yin

package com.uum._a2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class Asg2 {
    
        final String PATH = "E:\\Online Learning\\Sem 5\\STIW3054 Real-Time Programming\\Assignment2\\Asg2\\Assignment2_TestFiles";
        final File FILE = new File (ListFiles.listFiles(PATH));
        final static String FILE_NAME = "Display Result.xlsx";
      
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        //scan details from comment
        scanComment scan = new scanComment();
        String sem = scan.getSem();
        String course = scan.getCourse();
        String grp = scan.getGroup();
        String task = scan.getTask();
        String name = scan.getName();
        String matric = scan.getMatric();
        
        //count lines of codes
        CountLOC count = new CountLOC();
        int LOC = count.countLineNumber();
        int blankLines = count.countBlankLineNumber();
        int commentLines = count.countCommentLineNumber();
        int actualLOC = LOC - blankLines - commentLines;
        String ttlLines = Integer.toString(LOC);
        String blank = Integer.toString(blankLines);
        String comment = Integer.toString(commentLines);
        String act = Integer.toString(actualLOC);
        
        //count number of keywords
        CountKeyword key = new CountKeyword();
        Map<String,Integer> map = key.countKeywords();
        
        //count total values
        int counter = key.noKeywords();
        int totalVal = actualLOC + counter;
        String ttlVal = Integer.toString(totalVal);
        
        //display output in Excel
        ExcelSheet excel = new ExcelSheet(FILE_NAME);
        excel.Details(sem, course, grp, task);
        excel.Data(map, name, matric, ttlLines, blank, comment, act, ttlVal);
        excel.arrange();
        System.out.println("Excel created!");
    }    
}

