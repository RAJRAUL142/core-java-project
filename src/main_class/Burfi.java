package main_class;

import java.util.Scanner;
import main_class.Mithai;

class  Burfi extends Mithai {
		public  void Burfi1(){
				
				System.out.println("1)Malai Burfi 2)Keshar Burfi 3)Anjerr Burfi 4)Mango Burfi 5)Chocolate Burfi");
				Scanner s = new Scanner(System.in);
				
				   int choice = s.nextInt();
				     switch(choice)
				     {
				        case 1: MalaiBurfi t = new MalaiBurfi();
				        System.out.println("Selected choice : Malai Burfi");
				        t.MalaiBurfi1();
				        break;
				        case 2: KesharBurfi t1 =new KesharBurfi();
				        System.out.println("Selected choice : Keshar Burfi");
				        t1.KesharBurfi1();
				        break;
				        case 3: AnjerrBurfi t2 =new AnjerrBurfi();
				        System.out.println("Selected choice : Anjerr Burfi");
				        t2.AnjerrBurfi1();
				        break;
				        case 4: MangoBurfi t3 =new MangoBurfi();
				        System.out.println("Selected choice : Mango Burfi");
				        t3.MangoBurfi1();
				        break;
				        case 5: ChocolateBurfi t4 =new ChocolateBurfi();
				        System.out.println("Selected choice : Chocolate Burfi");
				        t4.ChocolateBurfi1();
				        break;
				        default:System.out.println("Invalid Choice please enter correct option");
				        Burfi1();		    
				        }
				  } 
		}

class MalaiBurfi extends Burfi {
	String name= "Malai Burfi";
	double price = 180;
	public  void MalaiBurfi1() {
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

class KesharBurfi extends Burfi {
	String name= "Keshar Burfi";
	double price = 425;
	public  void KesharBurfi1() {
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

class AnjerrBurfi extends Burfi {
	String name= "Anjerr Burfi";
	double price = 350;
	public  void AnjerrBurfi1() {
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

class MangoBurfi extends Burfi {
	String name= "Mango Burfi";
	double price = 200;
	public  void MangoBurfi1() {
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

class ChocolateBurfi extends Burfi {
	String name= "Chocolate Burfi";
	double price = 300;
	public  void ChocolateBurfi1() {
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
