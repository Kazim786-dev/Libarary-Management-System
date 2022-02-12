import java.util.Scanner;
public class Admin {
	int password;
	
	Admin(){
		
		password=123;
	}
	Scanner sc=new Scanner(System.in);
	public void adminmenu() {
		System.out.println("------(Admin)Libarary Management System------"); 
		System.out.println("Press 1: Add book.");
		System.out.println("Press 2: Modify book record.");
		System.out.println("Press 3: Delete a book.");
		System.out.println("Press 4: Issue book.");
		System.out.println("Press 6: View all available books.");
		System.out.println("Press 7: View the records of all books issued in a particular month");
		System.out.println("Press 8: Change the password.");
		System.out.println("Press 9: Go back to general menu.");
	
	}
	
void password() {
		
		System.out.print("Enter password : ");
		int pass=sc.nextInt();
	    while(pass!=password) {
	    	
	    	System.out.println("Password incorrect. Enter again");
	    	pass=sc.nextInt();
	    }	       	
	}
	
	void changepas() {
		
		System.out.print("Enter old password : ");
	    int pass=sc.nextInt();
	    while(pass!=password) {
	    	System.out.print("Incorrec! Enter old password again : ");
		    pass=sc.nextInt();
	    }
		 System.out.print("Enter new password : ");
		 password=sc.nextInt();
		 System.out.println("Pasword has been changed");
	    
	}


void addbook(Book[] b,int countbooks) {
	int choice=1;
	while(choice==1) {
		String waste=sc.nextLine();    //for string bcz it skips to take the input
	System.out.println("Enter book name.");
	   String bkname=sc.nextLine();
		System.out.println("Enter Author name.");
		String athname=sc.nextLine();   
		System.out.println("Enter book ISBN.");
		int isbn=sc.nextInt();
		System.out.println("Enter no. of copies");
		int copies=sc.nextInt();
		Book objb=new Book(bkname,athname,copies,isbn);
		b[countbooks]=objb;
		System.out.println("Book added");
		countbooks++;
	System.out.println("Do you want to add more\n"+"Press 1 for yes else 0");
	choice=sc.nextInt();
	}
}
void modify(Book[] b,int countbooks) {
	String waste=sc.nextLine();    //for string bcz it skips to take the input
	System.out.println("Enter book name which you want to modify.");
	   String bkname=sc.nextLine();
		System.out.println("Enter Author name of that book.");
		String athname=sc.nextLine();
		for(int i=0;i<=countbooks;i++) {
		if(b[i].bkname.equals(bkname)&&b[i].athname.equals(athname)) {
	 System.out.println("Enter new record!");
	   System.out.println("Enter book name.");
	   bkname=sc.nextLine();
		System.out.println("Enter Author name.");
		 athname=sc.nextLine();   
		System.out.println("Enter book ISBN.");
		int isbn=sc.nextInt();	
		System.out.println("Enter no. of copies");
		int copies=sc.nextInt();
		b[i].bkname=bkname;
		b[i].athname=athname;
		b[i].isbn=isbn;
		b[i].copies=copies;
		System.out.println("Record modified");
		break;
        }
		else if(i>countbooks)
			System.out.println("Book name or author name is not correct");}
		}

void delete(Book[] b,int countbooks) {
	
	String waste=sc.nextLine();    //for string bcz it skips to take the input
	System.out.println("Enter book name which you want to delete.");
	   String bkname=sc.nextLine();
		System.out.println("Enter Author name of that book.");
		String athname=sc.nextLine();
		for(int i=0;i<countbooks;i++) {
			if(b[i].bkname.equals(bkname)&&b[i].athname.equals(athname)) {
				
				b[i]=null;
		 //loop to assign the index the value 1 greater bcz we are deleting
			for(int j=i;j<=countbooks;j++) {
				b[j]=b[j++];
			} 
			System.out.println("BOOK DELETED!");
			break;
			}
			else if(i>countbooks)
				System.out.println("Book name or author name is not correct");
	
         }
}
void issue(Book[] b,Student[] s,int countbooks) {
	
	Student objs=new Student();
	objs.borrow(b, s , countbooks);
	
}
void showbooks(Book[] b,int countbooks) {
	for (int i=0;i<=countbooks;i++) {
		System.out.println("==>"+(i+1));
		System.out.println("Book name : "+b[i].bkname);
		System.out.println("Author name : "+b[i].athname);
		System.out.println("Book ISBN : "+b[i].isbn);
		System.out.println("Copies available : "+b[i].copies);
	}
	
}
void monthlyrecord(Book[] b , int countbooks , Student[] s){
	String waste=sc.nextLine();    //for string bcz it skips to take the input
	System.out.println("Enter the name of the month");
	String month=sc.nextLine();
	for(int i=0;i<=countbooks;i++) {
	
		if(s[i]!=null&&s[i].m_of_issue.equals(month)) {
			System.out.println("Student name : "+s[i].stdname);
			System.out.println("Student id : "+ s[i].id);
			System.out.println("Book name : "+ b[i].bkname);
			System.out.println("Author name : "+b[i].athname);
			System.out.println("Book ISBN : "+b[i].isbn);
		}
		
	}
		
}

}