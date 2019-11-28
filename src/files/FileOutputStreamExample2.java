package files;

import java.io.FileOutputStream;  
public class FileOutputStreamExample2 {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("C:\\Users\\vinot\\Documents\\FACE\\JAVA\\javatutorial\\javatutorial\\testout.txt");    
             String s="Welcome to next";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}