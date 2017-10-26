//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment2
//Matric: #240262
//Name: #Yap Jia Yin

package com.uum._a2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class scanComment extends Asg2{
    String sem, course, grp, task, name, matric; 
    
    public scanComment () throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(FILE));
        String line;
            while ((line = br.readLine()) != null){
                if (line.contains("//Semester:")){
                    sem = line;
                    sem = sem.replace("//Semester: #", "");
                }else if (line.contains("//Course:")){
                    course = line;
                    course = course.replace("//Course: #", "");
                }else if (line.contains("//Group:")){
                    grp = line;
                    grp = grp.replace("//Group: #", "");
                }else if (line.contains("//Task:")){
                    task = line;
                    task = task.replace("//Task: #", "");
                }else if (line.contains("//Name:")){
                    name = line;
                    name = name.replace("//Name: #", "");
                }else if (line.contains("//Matrik:")){
                    matric = line;
                    matric = matric.replace("//Matrik: #", "");
                }
        } 
    }
    
    public String getSem(){
        return sem;
    }
    
    public String getCourse(){
        return course;
    }
    
    public String getGroup(){
        return grp;
    }
    
    public String getTask(){
        return task;
    }
    
    public String getName(){
        return name;
    }
    
    public String getMatric(){
        return matric;
    }
}
