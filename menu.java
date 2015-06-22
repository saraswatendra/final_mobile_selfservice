package customer_care;
import java.util.*;
public class menu {

	public static void main(String[] args) 
		{
			   mainmenu();
			   }
	
		public static	void mainmenu()
		 {
			Scanner userInput= new Scanner(System.in);
		   System.out.println("\n1. To continue in English press 1\n2. Hindi me jari rakhne ke liye 2 dabayen");
		  userInput.hasNextInt();
		  if(userInput.hasNextInt()){
		 int choice= userInput.nextInt();
		 switch (choice)
		 {
		 case 1:eng();
		        break;
		 case 2:hindi();
				break;
		 default :System.out.println("Wrong choice");mainmenu();
			break;
		 }
	}else
		System.out.println("enter correct choice");mainmenu();
}
		
		
		
		static void eng()
		{
			Scanner userInput= new Scanner(System.in);
		 	System.out.println("\n1. To know your bill press 1\n2. For porting request press 2\n3. To talk to our customer care executive press 3\n4. To go back to previous menu press 9  \n5. To exit press 0");
	 		userInput.hasNextInt();
	 		if(userInput.hasNextInt())
	 		{int ch= userInput.nextInt();
	 		switch(ch)
	 			{
	 				case 1:
	 					System.out.println("\nYour bill is 800 Rupees.\n1. To go back to previous menu press 9\n2. To exit press 0");
	 						userInput.hasNextInt();
	 						
	 						 if(userInput.hasNextInt())
	 						{
	 						 int c= userInput.nextInt();
	 						if(c==9)
	 						{
	 				           eng();
	 						}else if (c==0)
	 					   { 
	 							System.out.println("Thankyou for your visit");
	 					   System.exit(0);
	 					   }else
			 			  		System.out.println("enter correct choice");eng();
	 			       }else
	 			  		System.out.println("enter correct choice");eng();
	 						 break;
	 				 case 2:System.out.println(" \nYour porting request is under process.\n1.To go back to previous menu press 9\n2. To exit press 0");
	 						userInput.hasNextInt();
	 						if(userInput.hasNextInt())
	 						{
	 							int c= userInput.nextInt();
	 							if(c==9)
	 							{
	 								eng();
	 							}
	 							else if (c==0)
	 							{ 
	 								System.out.println("Thankyou for your visit");
							System.exit(0);
	 							}else
	 			 			  		System.out.println("enter correct choice");eng();
	 						}else
	 						System.out.println("enter correct choice");eng();
	 						break;
	 				case 3:System.out.println(" \nAll our executives are busy learning Java. Please try again later.\n1. To go back to previous menu press 9\n2. To exit press 0");
	 						userInput.hasNextInt();
	 						if(userInput.hasNextInt())
	 						{
	 							int c= userInput.nextInt();
	 							if(c==9)
	 							{
	 								eng();
	 							}else if (c==0)
	 							{ 
	 								System.out.println("Thankyou for your visit");
	 								System.exit(0);
	 							}else
	 			 			  		System.out.println("enter correct choice");eng();
	 						}else
	 							System.out.println("enter correct choice");eng();
	 						break;
	 				case 9:if(ch==9)
	 				{
	 					mainmenu();
	 				}
	
	 				case 0:if (ch==0)
	 					{
	 					System.out.println("Thankyou for your visit");
	 					System.exit(0);
	 					}
	 				break;
	 				default :System.out.println("Wrong choice");eng();
	 				break;
	 			}
	 		}else
		 System.out.println("Wrong choice");eng();
	 }	
		
		
	 	static void hindi()
	 	{	
	 		Scanner userInput= new Scanner(System.in);
	 		System.out.println(" 1. bill ki jankari ke liye 1 dabayen");
	 		System.out.println(" 2. porting request ke liye 2 dabayen");
	 		System.out.println(" 3. customer care executive se baat karne ke liye 3 dabayen");
	 		System.out.println(" 4. phichli menu me jaane ke liye 9 dabayen");
	 		System.out.println(" 5. samapti ke liye 0 dabayen");
	 		userInput.hasNextInt();
	 		if(userInput.hasNextInt())
	 		{int ch= userInput.nextInt();
	 		switch(ch)
	 			{
	 				case 1: System.out.println("\naapka bill hai 800 Rupees.\n1.  phichli menu me jaane ke liye 9 dabai\n2. samapti ke liye 0 dabayen");
	 						userInput.hasNextInt();
	 						
	 						 if(userInput.hasNextInt())
	 						{
	 						 int c= userInput.nextInt();
	 						if(c==9)
	 						{
	 							hindi();
	 						}else if (c==0)
	 					   { 
	 							System.out.println("padharane ke liye dhanywad");
	 					   System.exit(0);
	 					   }else
			 			  		System.out.println("kripya sahi vikalp chune");hindi();
	 			       }else
	 			  		System.out.println("kripya sahi vikalp chune");hindi();
	 						 break;
	 				 case 2:System.out.println(" \naapka porting request prakriya me hai.\n1.  phichli menu me jaane ke liye 9 dabayen\n2. samapti ke liye 0 dabayen");
	 						userInput.hasNextInt();
	 						if(userInput.hasNextInt())
	 						{
	 							int c= userInput.nextInt();
	 							if(c==9)
	 							{
	 								hindi();
	 							}
	 							else if (c==0)
	 							{ 
	 								System.out.println("padharane ke liye dhanywad");
							System.exit(0);
	 							}else
	 			 			  		System.out.println("kripya sahi vikalp chune");hindi();
	 						}else
	 						System.out.println("kripya sahi vikalp chune");hindi();
	 						break;
	 				case 3:System.out.println("\n hamare sabhi adhikari abhi java training me vyast hai kripya punh try kare.\n1.  phichli menu me jaane ke liye 9 dabai\n2. samapti ke liye 0 dabayen");
	 						userInput.hasNextInt();
	 						if(userInput.hasNextInt())
	 						{
	 							int c= userInput.nextInt();
	 							if(c==9)
	 							{
	 								hindi();
	 							}else if (c==0)
	 							{ 
	 								System.out.println("padharane ke liye dhanywad");
	 								System.exit(0);
	 							}else
	 			 			  		System.out.println("kripya sahi vikalp chune");hindi();
	 						}else
	 							System.out.println("kripya sahi vikalp chune");hindi();
	 						break;
	 				case 9:if(ch==9)
	 				{
	 					mainmenu();
	 				}
	
	 				case 0:if (ch==0)
	 					{
	 					System.out.println("padharane ke liye dhanywad");
	 					System.exit(0);
	 					}
	 					break;
	 					default :System.out.println("kripya sahi vikalp chune");hindi();
	 					break;
	 			}
	 		}
	 		else
	 			System.out.println("kripya sahi vikalp chune");
	 		hindi();
	 	}
		
		
}
