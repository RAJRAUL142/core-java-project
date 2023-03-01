package main_class;

import java.util.Scanner;

import main_class.Mithai;

class  Jilebi extends Mithai {
	public void Jilebi1(){		
		System.out.println("1)Kesari Jilebi 2)Mawa Jilebi 3)Rabdi Mawa Jilebi 4)Paneer Jilebi 5)Imrati Jilebi");
		Scanner s = new Scanner(System.in);	
		int choice = s.nextInt();
		switch(choice)
		     {
		        case 1: KesariJilebi t = new KesariJilebi();
		        System.out.println("Selected choice : Kesari Jilebi");
		        t.KesariJilebi1();
		        break;
		        
		        case 2: MawaJilebi t1 =new MawaJilebi();
		        System.out.println("Selected choice : Mawa Jilebi");
		        t1.MawaJilebi1();
		        break;
		        
		        case 3: RabdiMawaJilebi t2 =new RabdiMawaJilebi();
		        System.out.println("Selected choice : Rabdi Mawa Jilebi");
		        t2.RabdiMawaJilebi1();
		        break;
		        
		        case 4: PaneerJilebi t3 =new PaneerJilebi();
		        System.out.println("Selected choice : Paneer Jilebi");
		        t3.PaneerJilebi1();
		        break;
		        
		        case 5: ImratiJilebi t4 =new ImratiJilebi();
		        System.out.println("Selected choice : Imrati Jilebi");
		        t4.ImratiJilebi1();
		        break;
		        
		        default:System.out.println("Invalid Choice please enter correct option");
		        Jilebi1();
		     }
		  }	
}


class  KesariJilebi extends Jilebi {
	String name= "Kesari Jilebi";
	double price = 300;
	public  void KesariJilebi1() {
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


class  MawaJilebi extends Jilebi {
	String name= "Mawa Jilebi";
	double price = 500;
	public  void MawaJilebi1() {
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

class  RabdiMawaJilebi extends Jilebi {
	String name= "Rabdi Mawa Jilebi";
	double price = 600;
	public  void RabdiMawaJilebi1() {
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

class  PaneerJilebi extends Jilebi {
	String name= "Paneer Jilebi";
	double price = 470;
	public  void PaneerJilebi1() {
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

class  ImratiJilebi extends Jilebi {
	String name= "Imrati Jilebi";
	double price = 200;
	public  void ImratiJilebi1() {
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