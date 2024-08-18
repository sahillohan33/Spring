package in.sp.beans;

public class Address {
	private int houseno;
	private String city;
	private int pincode;
	/*
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+houseno+","+city+"-"+pincode;
	}
	*/
	
	// constructor methods
	public Address(int houseno,String city,int pincode) {
		this.houseno=houseno;
		this.city=city;
		this.pincode=pincode;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+houseno+","+city+"-"+pincode;
	}
	public void display() {
		System.out.println("House Number :" +houseno);
		System.out.println("City : "+city);
		System.out.println("PinCode : "+pincode);
	}

}
