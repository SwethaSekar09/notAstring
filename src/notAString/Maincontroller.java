package notAString;

	import java.util.Scanner;

	public class Maincontroller extends Strings1 // with inheritance extending the
	// Strings1 class
	{
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string: ");
	String value = sc.nextLine();
	String result = notAString(value);
	System.out.println("your test case result is " + result);
	sc.close();
	}

	}

