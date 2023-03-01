package main_class;

import java.util.Random;
import java.util.Scanner;

public class CustomerDetails {
	private String name;
	private String Address;
	private long MobNo ;
	private String EmailId;
	private int OrderID;

	public String getName(){
			return name;
	}

	public void setName(String name) {
			this.name = name;
	}

	public String getAddress() {
			return Address;
	}

	public void setAddress(String address) {
			Address = address;
	}

	public long getMobNo() {
			return MobNo;
	}

	public void setMobNo(long mobNo) {
			MobNo = mobNo;
	}

	public String getEmailId() {
			return EmailId;
	}

	public void setEmailId(String emailId) {
			EmailId = emailId;
	}
									
	public int getOrderID() {
			return OrderID;
	}

	public void setOrderID(int orderID) {
			OrderID = orderID;
	}

public  void detials1(){

	Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Below Details: ");
		System.out.println("Enter Your Name : ");
		String name = s.nextLine();

		System.out.println("Enter Your Address : ");
		String Address = s.nextLine();

		System.out.println("Enter Your Mobile No : ");
		long MobNo = s.nextLong();

		System.out.println("Enter Your Email ID : ");
		String EmailId = s.next();

		Random r= new Random();
		int g = r.nextInt(1000000000);
    System.out.println("Your Order ID : " +g);
    
	System.out.println("***************************************************");
    
    CustomerDetails ref =new CustomerDetails();
    
    ref.setName(name);
    System.out.println("Name :"+ref.getName());
    
    ref.setAddress(Address);
    System.out.println("Address :"+ref.getAddress());
    
    ref.setMobNo(MobNo);
    System.out.println("Mobile No :"+ref.getMobNo());
    
    ref.setEmailId(EmailId);
    System.out.println("Email ID :"+ref.getEmailId());
    
    ref.setOrderID(g);
    System.out.println("Order ID:"+ref.getOrderID());
    
    System.out.println("You have order Successfully");	        
    System.out.println("");
	System.out.println("***************************************************");

	Mithai M1 = new Mithai();
	System.out.println("Shop Name:"+ M1.Shop_Name);		
	System.out.println("Shop Address:"+ M1.Shop_Address);
	System.out.println("Contact details :"+ M1.Shop_Mob_No);
	System.out.println("Mail ID:"+ M1.Shop_Mail_Id);
	System.out.println("***************************************************");
	System.out.println("Owner Name:"+ M1.getOwner_Name());
	System.out.println("Owner Mobile No:"+ M1.getOwner_Mob_No());
	System.out.println("***************************************************");
	System.out.println("Thank You,Please visit us again !!!!!");
}
}
