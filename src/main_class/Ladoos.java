package main_class;

import java.util.Scanner;


import main_class.Mithai;

class Ladoos extends Mithai {
	public void Ladoos1(){
		
		System.out.println("1)Motichur Ladoo  2)Besan Ladoo 3)Boondi Ladoo 4)Rava Ladoo 5)Dry Fruit Ladoo");
		Scanner s = new Scanner(System.in);	
		int choice = s.nextInt();
		switch(choice)
		     {
		        case 1: MotichurLadoo t = new MotichurLadoo();
		        System.out.println("Selected choice : Motichur Ladoo");
		        t.MotichurLadoo1();
		        break;
		        
		        case 2: BesanLadoo t1 =new BesanLadoo();
		        System.out.println("Selected choice : Besan Ladoo");
		        t1.BesanLadoo1();
		        break;
		        
		        case 3: BoondiLadoo t2 =new BoondiLadoo();
		        System.out.println("Selected choice : Boondi Ladoo");
		        t2.BoondiLadoo1();
		        break;
		        
		        case 4: RavaLadoo t3 =new RavaLadoo();
		        System.out.println("Selected choice : Rava Ladoo");
		        t3.RavaLadoo1();
		        break;
		        
		        case 5: DryFruitLadoo t4 =new DryFruitLadoo();
		        System.out.println("Selected choice : Dry Fruit Ladoo");
		        t4.DryFruitLadoo1();
		        break;
		        
		        default:System.out.println("Invalid Choice please enter correct option");
		        Ladoos1();
		     }
		  }
}
class MotichurLadoo extends Ladoos {
	String name= "Motichur Ladoo";
	double price = 400;
	public  void MotichurLadoo1() {
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

class BesanLadoo extends Ladoos {
	String name= "Besan Ladoo";
	double price = 440;
	public  void BesanLadoo1() {
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

 class BoondiLadoo extends Ladoos{
	String name= "Boondi Ladoo";
	double price = 200;
	public  void BoondiLadoo1() {
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

class RavaLadoo extends Ladoos {
	String name= "Rava Ladoo";
	double price = 395;
	public  void RavaLadoo1() {
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

class DryFruitLadoo extends Ladoos {
	String name= "Dry Fruit Ladoo";
	double price = 800;
	public  void DryFruitLadoo1() {
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

