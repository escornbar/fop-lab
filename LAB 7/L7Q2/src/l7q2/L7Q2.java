/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l7q2;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author syaam
 */
public class L7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            try {
            PrintWriter out=new PrintWriter(new FileOutputStream("index.htm"));
            URL u = new URL("https://fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            
            while(in.hasNextLine()){
                String line=in.nextLine();
                System.out.println(line);
                out.println(line);
            }
            }
            catch (IOException e) {
                System.out.println("IO Error:" + e.getMessage());
            }
            
        
    }
    
}
