package main_class;

import java.util.Scanner;


import main_class.Mithai;

class  Halwa extends Mithai {
	
		
	
	public void Halwa1(){		
		System.out.println("1)Gajar Halwa 2)Dudhi Halwa 3)Mungdaal Halwa 4)Pineapple Halwa 5)Besan Halwa");
		Scanner s = new Scanner(System.in);	
		int choice = s.nextInt();
		switch(choice)
		     {
		        case 1: GajarHalwa t = new GajarHalwa();
		        System.out.println("Selected choice : Gajar Halwa");
		        t.GajarHalwa1();
		        break;
		        
		        case 2: DudhiHalwa t1 =new DudhiHalwa();
		        System.out.println("Selected choice : )Dudhi Halwa");
		        t1.DudhiHalwa1();
		        break;
		        
		        case 3: MungdaalHalwa t2 =new MungdaalHalwa();
		        System.out.println("Selected choice : Mungdaal Halwa");
		        t2.MungdaalHalwa1();
		        break;
		        
		        case 4: PineappleHalwa t3 =new PineappleHalwa();
		        System.out.println("Selected choice : Pineapple Halwa");
		        t3.PineappleHalwa1();
		        break;
		        
		        case 5: BesanHalwa t4 =new BesanHalwa();
		        System.out.println("Selected choice : Besan Halwa");
		        t4.BesanHalwa1();
		        break;
		        
		        default:System.out.println("Invalid Choice please enter correct option");
		        Halwa1();
		     }
		  }	
}

class  GajarHalwa extends Halwa {
	String name= "Gajar Halwa";
	double price = 450;
	public  void GajarHalwa1() {
			System.out.println("Please enter quantity in Kg");
			  Scanner a=new Scanner(System.in);
			  double choice = a.nextDouble();
				  double b = choice*price;
				  System.out.println("Selected Sweet:"+name);
				  System.out.println("Ordered Quantity:"+choice +"kg");
				  System.out.println("Price:"+ b +"/-");		   
			  	  System.out.println("***************************************************");
			      CustomerDetails ref22 = new CustomerDetails();
				  ref22.detials1();	 			
	}	
}

class  DudhiHalwa extends Halwa {
	String name= "Dudhi Halwa";
	double price = 400;
	public  void DudhiHalwa1() {
			System.out.println("Please enter quantity in Kg");
			  Scanner a=new Scanner(System.in);
			  double choice = a.nextDouble();			  
				  double b = choice*price;
				  System.out.println("Selected Sweet:"+name);
				  System.out.println("Ordered Quantity:"+choice +"kg");
				  System.out.println("Price:"+ b +"/-");		   
			  	  System.out.println("***************************************************");
			      CustomerDetails ref22 = new CustomerDetails();
				  ref22.detials1();	 		
	}	
}

class  MungdaalHalwa extends Halwa {
	String name= "Mungdaal Halwa";
	double price = 370;
	public  void MungdaalHalwa1() {
			System.out.println("Please enter quantity in Kg");		
			  Scanner a=new Scanner(System.in);
			  double choice = a.nextDouble();	 
				  double b = choice*price;
				  System.out.println("Selected Sweet:"+name);
				  System.out.println("Ordered Quantity:"+choice +"kg");
				  System.out.println("Price:"+ b +"/-");	  
			  	  System.out.println("***************************************************");
			      CustomerDetails ref22 = new CustomerDetails();
				  ref22.detials1();	 		
	}	
}

class  PineappleHalwa extends Halwa {
	String name= "Pineapple Halwa";
	double price = 350;
	public  void PineappleHalwa1() {
			System.out.println("Please enter quantity in Kg");		  
			  Scanner a=new Scanner(System.in);
			  double choice = a.nextDouble();
				  double b = choice*price;
				  System.out.println("Selected Sweet:"+name);
				  System.out.println("Ordered Quantity:"+choice +"kg");
				  System.out.println("Price:"+ b +"/-");		   
			  	  System.out.println("***************************************************");
			      CustomerDetails ref22 = new CustomerDetails();
				  ref22.detials1();	 	
	}	
}

class  BesanHalwa extends Halwa {
	String name= "Besan Halwa";
	double price = 400;
	public  void BesanHalwa1() {
			System.out.println("Please enter quantity in Kg");		  
			  Scanner a=new Scanner(System.in);
			  double choice = a.nextDouble();			
				  double b = choice*price;
				  System.out.println("Selected Sweet:"+name);
				  System.out.println("Ordered Quantity:"+choice +"kg");
				  System.out.println("Price:"+ b +"/-");		    
			  	  System.out.println("***************************************************");
			      CustomerDetails ref22 = new CustomerDetails();
				  ref22.detials1();	 	
	}	
}


