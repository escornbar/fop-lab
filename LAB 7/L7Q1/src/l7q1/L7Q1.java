package l7q1;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class L7Q1 {

    public static void main(String[] args) {
        
        String[][] courses=new String[][]{{"WXES1116","Programming I"}, {"WXES1115","Data Structure"}, {"WXES1110","Operating System"}, {"WXES1116","Computing Mathematics I"}};
        
        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("coursename.dat"));
            out.writeObject(courses);
            out.close();
        } catch (IOException ex) {
            System.out.println("Problem with file output.");
        }
        
        System.out.println(getCourseName("WXES1116"));
        
        
    }
    public static String getCourseName(String a){
        String coursename=null;
        try {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("coursename.dat"));
            input = (String[][])in.readObject();
            
            for(String[] c : input){
                if(c[0].equals(courseCode)){
                    System.out.println(c[1]);
                }
            }
        } catch (IOException ex) {
            System.out.println("Problem with file input.");
        }
        return coursename;
    }
}
