import java.util.Scanner;

public class HelloWorld {

	private int num1;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		for(String a:args)
			System.out.println(a);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">");
		String fname = scan.nextLine();
		System.out.print(">");
		String lname = scan.nextLine();
				
		Person person = new Person(lname,fname);
		
		System.out.println("Hello World! This is a test Welcome " + person.getLname() + " " + person.getFname());

	}

}
