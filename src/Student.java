import java.util.Scanner;
public class Student {

	String stdname;String m_of_issue;
	int id;
	Student(String sn,int id,String m){
		stdname=sn;
		this.id=id;
		m_of_issue=m;
	}
	Student(){}
	Scanner sc=new Scanner(System.in);
	public void stdmenu() {
		System.out.println("------(Student)Libarary Management System------"); 
			System.out.println("Press 1: Search book.");
			System.out.println("Press 2: Borrow a particular book.");
			System.out.println("Press 3: Read a particular book.");
			System.out.println("Press 4: Return borrowed book.");
			System.out.println("Press 5: Go back to general menu.");
		
		}
	
	
	void search(Book[] b,int countbooks) {
		System.out.print("enter book name : ");
		String bn=sc.nextLine();
		for(int i=0;i<=countbooks;i++) {
			if (bn.equals(b[i].bkname)&&b[i].copies>0) {
		System.out.println("Yes available");
			break;
			}
			else if(i==30) {
				System.out.println("Book not available");
			}
		}
	}
	void borrow(Book[] b,Student[] s,int countbooks) {
		boolean check=true;
		Admin obja=new Admin();
		System.out.print("Student id : ");
		 int stdid=sc.nextInt();	
		String waste=sc.nextLine();    //for string, bcz it skips to take the input
		System.out.print("Student name : ");
		 String stname=sc.nextLine();
		 for(int j=0;j<s.length;j++) {
			
			 if(s[j]!=null&&(s[j].stdname.equals(stdname)&&s[j].id==(id))) {
				 System.out.println("You already have issued the book\n"+"You will be able to borrow when you return prvious");
			 }
			 else {
				
				 
		System.out.print("Current month's name :");
	    String month=sc.nextLine();
	    System.out.println("Enter book name");
	    String bkname=sc.nextLine();
	    System.out.println("Enter author name");
	    String athname=sc.nextLine();
	    //loop to check availability of book
	    for(int i=0;i<=countbooks;i++) {
			if(b[i].bkname.equals(bkname)&&b[i].athname.equals(athname)) {
				
				 Student objs=new Student(stname,stdid,month);
					s[j]=objs;
				 b[i].copies=b[i].copies-1;
				    check=false;
				System.out.println("Book issued!");
			   
			    
			}
			
			else if(i==countbooks) {
				System.out.println("BOOK NOT AVAILABLE!");
				break;
			}
			
	    }}
			 if(check==false) {
					break;
				} 
	    }
	}

	void read(Book[] b,int countbooks) {
		 System.out.print("Student id : ");
		 id=sc.nextInt();	
		String waste=sc.nextLine();    //for string, bcz it skips to take the input
      System.out.println("What's Student's name?");
      stdname=sc.nextLine();
		System.out.print("enter book name which you want to read: ");
		String bn=sc.nextLine();
		for(int i=0;i<=countbooks;i++) {
			if (bn.equals(b[i].bkname)&&b[i].copies>0) {
		System.out.println("Ok!read the book and get knowledge");
			break;
			}
			else if(i>countbooks) {
				System.out.println("Book not available");
			}
		}
	}

	void retun(Book[] b,Student[] s,int countbooks) {
		
		 System.out.print("Student id : ");
		 int sid=sc.nextInt();	
		String waste=sc.nextLine();    //for string, bcz it skips to take the input
      System.out.println("What's Student's name?");
      String stname=sc.nextLine();
      for(int i=0;i<=countbooks;i++) {
			if (s[i]!=null&&s[i].stdname.equals(stname)&&s[i].id==sid) {
		System.out.println("==> Record of this student");
		System.out.println("Book name : "+b[i].bkname);
		System.out.println("Author name : "+b[i].athname);
		System.out.println("Month of issue "+s[i].m_of_issue );
		
		b[i].copies++;
		s[i]=null;
		System.out.println("BOOK RETURNED");
			break;
			}
      
      
      }	
		
	}

}
