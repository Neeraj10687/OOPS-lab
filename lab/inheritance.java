package lab;



class Library{
	String LibraryName;
	String location;
	
	Library(String lname,String libloc){
		this.LibraryName= lname;
		this.location=libloc;
	}
	void displayLibrary() {
		System.out.println("Library name: "+LibraryName);
		System.out.println("Location: "+location);
	}
}

class Book extends Library{
	int bookID;
	String title,author;
	
	
	Book(String lname,String libloc,int bId,String ttl,String auth){
		super(lname,libloc);
		bookID=bId;
		title=ttl;
		author=auth;
	}
	void displayBook() {

		System.out.println("Book Id: "+bookID);
		System.out.println("title: "+title);
		System.out.println("author: "+author);
	}
}
class Issue extends Book{
	
	String studentName,issueDate;
	
	
	Issue(String lname,String libloc,int bId,String ttl,String auth,String stn,String issudate){
		super(lname,libloc,bId,ttl,auth);
		studentName=stn;
		issueDate=issudate;
		
	}
	void displayIssue() {

		System.out.println("Name of student: "+studentName);
		System.out.println("Issued date: "+issueDate);

	}
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Issue p = new Issue("tkm","kollam",245,"trial","K.","neeraj","17/10/29");
		p.displayLibrary();
		p.displayBook();
		p.displayIssue();

	}

}
