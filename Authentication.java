import java.util.Scanner;

public class Authentication {

public static void main(String[] args) {

	String Username;
	String Password;

	Password = "csc200";	
	Username = "password";

	Scanner input1 = new Scanner(System.in);
	System.out.println("Enter Username: ");
	String username = input1.next();

	Scanner input2 = new Scanner(System.in);
	System.out.println("Enter Password: ");
	String password = input2.next();

	if (username.equals("csc200") && password.equals("password")) {
		System.out.println("Welcome Username!");
	} else { 
		System.out.println("Wrong Username or Password!");
	}
}    
}

