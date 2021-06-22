package l9q2;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Student extends PersonProfile{
    private String[] courseName=new String[10];
    private String[] courseCode=new String[10];
    private String[] semester=new String[10];
    private String[] session=new String[10];
    private String[] mark=new String[10];
    private String fileName;
    private int i=0;
    
    public Student(String fileName, String name, String gender, String birthdate) {
        super(name, gender, birthdate);
        this.fileName = fileName;
    }
    
    public void getInfo(){
            try {
            Scanner in = new Scanner(new FileInputStream(this.fileName));
            while(in.hasNextLine()&&i<5){
                this.courseCode[i]=in.nextLine();
                this.courseName[i]=in.nextLine();
                this.session[i]=in.nextLine();
                this.semester[i]=in.nextLine();
                this.mark[i]=in.nextLine();
                i++;
            }
            in.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } 
    }
    
    public String getGrade(int i){
        int imark=Integer.parseInt(mark[i]);
        if(imark>=85){
            return "A";
        }
        else if(imark>=75){
            return "A-";
        }
        else if(imark>=70){
            return "B+";
        }
        else if(imark>=65){
            return "B";
        }
        else if(imark>=60){
            return "B-";
        }
        else if(imark>=55){
            return "C+";
        }
        else if(imark>=50){
            return "C";
        }
        else if(imark>=45){
            return "D";
        }
        else if(imark>=35){
            return "E";
        }else{
            return "F";
        }
        
    }

    public void displaycomplete(){
        getInfo();
        super.display();
        System.out.println("");
        for(int i=0;i<5;i++){
            System.out.println(courseCode[i]);
            System.out.println(courseName[i]);
            System.out.println(session[i]);
            System.out.println(semester[i]);
            System.out.println(mark[i]);
            System.out.println(getGrade(i));
            System.out.println("");
        }
    }
    
    
}
