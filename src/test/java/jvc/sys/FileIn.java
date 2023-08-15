package jvc.sys;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIn {
    
    public boolean createFile(String fileName) {
        
        try {
            
            File file = new File(fileName);
            file.createNewFile();
            
        } catch (IOException e) {
            System.out.println("IOException: " + e);
            e.printStackTrace();
        } // close try/catch
        
        return true;
        
    } // close createFile method
    
    public boolean createDir(String dir) {
        
        File file = new File(dir);
        file.mkdirs();
        
        return true;
    } // close createDir method
    
    public void write(String fileName, String text) {
        
        try {
            
            FileWriter file = new FileWriter(fileName);
            file.write(text);
            file.close();
            
        } catch (IOException e) {
            System.out.println("IOException: " + e);
            e.printStackTrace();
        } // close try/catch
        
    } // close write method
    
    
} // close class