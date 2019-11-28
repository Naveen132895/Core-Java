package classandobject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
	String name;
	String address;      // local variables
	String contact;
	String email;
	String proofType;
	String proofID;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 name=br.readLine();
		 address = br.readLine();
		 contact=br.readLine();
		 email=br.readLine();
		 proofType=br.readLine();
		 proofID=br.readLine();
		 Customer customer=new Customer();
		 customer.register(name, address, contact, email, proofType, proofID);
		 System.out.println(customer.toString());
		 
	}

}

