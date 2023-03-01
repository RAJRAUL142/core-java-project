package main_class;

import java.util.Scanner;

import main_class.Mithai;



class  Pedha extends Mithai {
	public void Pedha1(){
		
		System.out.println("1)Keshar Pedha 2)Malai Pedha 3)Kachhi Pedha 4)Amrut Malai Pedha 5)Rajwadi Pedha");
		Scanner s = new Scanner(System.in);	
		int choice = s.nextInt();
		switch(choice)
		     {
		        case 1: KesharPedha t = new KesharPedha();
		        System.out.println("Selected choice : Keshar Pedha");
		        t.KesharPedha1();
		        break;
		        
		        case 2: MalaiPedha t1 =new MalaiPedha();
		        System.out.println("Selected choice : Malai Pedha");
		        t1.MalaiPedha1();
		        break;
		        
		        case 3: KachhiPedha t2 =new KachhiPedha();
		        System.out.println("Selected choice : Kachhi Pedha");
		        t2.KachhiPedha1();
		        break;
		        
		        case 4: AmrutMalaiPedha t3 =new AmrutMalaiPedha();
		        System.out.println("Selected choice : Amrut Malai Pedha");
		        t3.AmrutMalaiPedha1();
		        break;
		        
		        case 5: RajwadiPedha t4 =new RajwadiPedha();
		        System.out.println("Selected choice : Rajwadi Pedha");
		        t4.RajwadiPedha1();
		        break;
		        
		        default:System.out.println("Invalid Choice please enter correct option");
				   Pedha1();
		     }
		
		  } 	
			  }
class KesharPedha extends Pedha {
	String name= "Keshar Pedha";
	double price = 350;
	public  void KesharPedha1() {
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

class MalaiPedha extends Pedha {
	String name= "Malai Pedha";
	double price = 300;
	public  void MalaiPedha1() {
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

class KachhiPedha extends Pedha {
	String name= "Kachhi Pedha";
	double price = 400;
	public  void KachhiPedha1() {
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
	
class AmrutMalaiPedha extends Pedha {
	String name= "Amrut Malai Pedha";
	double price = 560;
	public  void AmrutMalaiPedha1() {
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

class RajwadiPedha extends Pedha {
	String name= "Rajwadi Pedha";
	double price = 440;
	public  void RajwadiPedha1() {
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

