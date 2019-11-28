package date;
import java.util.Date; 
import java.text.SimpleDateFormat;
public class SimpleDateFormatExample {

	public static void main(String[] args) {  
	    Date date = new Date();  
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");  
	    String strDate = sdf.format(date);  
	    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
	  
	    sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
	    strDate = sdf.format(date);  
	    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
	  
	    sdf = new SimpleDateFormat("dd MMMM yyyy");  
	    strDate = sdf.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
	  
	    sdf = new SimpleDateFormat("dd MMM yyyy zzzz");  
	    strDate = sdf.format(date);  
	    System.out.println("Date Format with dd MMM yyyy zzzz : "+strDate);  
	  
	    sdf = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
	    strDate = sdf.format(date);  
	    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  
	}  

}
