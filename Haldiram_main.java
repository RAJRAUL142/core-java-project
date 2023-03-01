package main_class;

import java.util.Scanner;

public class Haldiram_main  {
	public static void main(String[] args) 
	{
		System.out.println("Welcome To Haldiram");
		System.out.println("Please Place Your Order");
		
		int choice;
		Scanner s=new Scanner(System.in);
		do {
		System.out.println("1)Pedha   2)Burfi   3)Ladoos    4)Jilebi   5)Halwa   6)Menu ");	
		  choice = s.nextInt();
			}while(choice>7);
			
		 if ( choice == 1) {
		     Pedha ref = new Pedha();
		     System.out.println("Selected choice : Pedha");
		     ref.Pedha1();			    
		 }
		 else if (choice == 2) {
			 Burfi ref2 = new Burfi();
		     System.out.println("Selected choice : Burfi");
			 ref2.Burfi1();	
		}
		 else if(choice == 3) {
			 Ladoos ref3 = new Ladoos();
			 System.out.println("Selected choice : Ladoos");
			 ref3.Ladoos1();
		 }
		 else if(choice == 4) {
			 Jilebi ref4 = new Jilebi();
			 System.out.println("Selected choice : Jilebi");
			 ref4.Jilebi1();
		 }
		 else if(choice == 5) {
			 Halwa ref5 = new Halwa();
			 System.out.println("Selected choice : Halwa");
	         ref5.Halwa1();
		 }
		
		 else if(choice == 6) {
			 Rate ref2 = new Rate();
			 System.out.println("***************************************************");
		     System.out.println("Menu Card");
			 ref2.price2();				
		 }
}
}
		

