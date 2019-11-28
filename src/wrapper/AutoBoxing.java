package wrapper;
/*
 *  Byte, Short, Integer, Long, Float, Double numeric wrapper class
 *   Character, Boolean, and Void
 *   String, StringBuffer, StringBuilder classes are final.
 *   All wrapper classes and String classes are immutable. 
 *   All wrapper classes and String classes are Comparable and Serializable
 * */


public class AutoBoxing {

	public static void main(String[] args) {
		
		  
		Integer i=20;//converting int into Integer  
		Integer j=i;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(i+" "+j);  
		
	  

	}

}
