package files;

import java.io.FileInputStream;

public class FileInputStreamExample {
 
	     public static void main(String args[]){    
	          try{    
	            FileInputStream fin=new FileInputStream("C:\\Users\\vinot\\Documents\\FACE\\JAVA\\javatutorial\\javatutorial\\testout.txt");    
	            int i=fin.read();  
	            System.out.print((char)i);    
	  
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	         }    
	        } 