package classandobject;
class Customer {
		static int i=0;
		private String name;
		private String address;
		private String contactNumber;
		private String email;
		private String proofType;
		private String proofID;
				
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getProofType() {
			return proofType;
		}
		public void setProofType(String proofType) {
			this.proofType = proofType;
		}
		public String getProofID() {
			return proofID;
		}
		public void setProofID(String proofID) {
			this.proofID = proofID;
		}
		public void register(String name,String address,String contactNumber,String email,String proofType,String proofID)
		{
			
			this.setName(name);
			this.setAddress(address);
			this.setContactNumber(contactNumber);
			this.setEmail(email);
			this.setProofType(proofType);
			this.setProofID(proofID);
		
		}
public String toString()
{
	return "Name"+this.getName()
	+"\nAddress"+this.getAddress()
	+"\nContact"+this.getContactNumber()
	+"\nEmail"+this.getEmail()
	+"\nProof Type"+this.getProofType()
	+"\n ID"+this.getProofID()
	+"Thanks for registering your id is"+ i++;
}
}
