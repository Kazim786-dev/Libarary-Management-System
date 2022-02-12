import java.util.Scanner;
public class Libarary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Book books[]=new Book[30];	
	Student std[]=new Student[50];
	
	
			Scanner sc= new Scanner(System.in);
			int countbooks=0, cont=1;
			
			Admin obja=new Admin();
			
			while(cont==1)
			{   
				int select=1;
				
				System.out.println("------Libarary Management System------"); 
				System.out.println("Press 1 : Switch to Admin mode ");
				System.out.println("Press 2 : Switch to Student mode");
				System.out.println("Press 3 : Exit");
				
			
			int choice=sc.nextInt();
			//String waste=sc.nextLine();
			if(choice==1) 
			{ 
				obja.password();
				
				
				while(select==1) {
					obja.adminmenu();
					int opted=sc.nextInt();
			  switch(opted) {
			  
			  case 1:{
				  obja.addbook(books,countbooks);
				  
			  }break;
			  case 2:{
				  obja.modify(books,countbooks);
			  }break;
			  case 3:{
				  obja.delete(books,countbooks);
			  }break;
			  case 4:{
				  obja.issue(books,std,countbooks);
			  }break;
			  case 6:{
				
				  obja.showbooks(books,countbooks);
			  }break;
			  case 7:{
				  obja.monthlyrecord(books,countbooks,std);
			  }break;
			  case 8:{
				  obja.changepas();
			  }break;
			  case 9:
			  { select=0;
			  }
			  break;
			   default:
				System.out.println("Wrong input");
				}}
			}
			if(choice==2) {
				
				
				
				Student objs=new Student();
				while(select==1) {
				objs.stdmenu();
			
				int opted=sc.nextInt();
				  switch(opted) {
			       
				  case 1:{
					  
					 objs.search(books,countbooks);
				  }break;
				  case 2:{
					 objs.borrow(books,std,countbooks);
				  }break;
				  case 3:{
					  objs.read(books,countbooks);
				  }break;
				  case 4:{
					  objs.retun(books,std,countbooks);
				  }break;
				  case 5:
				  {  select=0;
				  }break;
				  default: 
					  System.out.println("Wrong input");
				  }
				}
		 	  }
			if(choice==3) {
			
			System.out.println("You exit!");
			System.out.println("Thank you!");
			cont=0;
			}
			
			
			}
		}
	}
	

