// SWETHA SEKAR 13.07.17
package notAString;

	public class Strings1 {
		public static String notAString(String str) {
		// Code here
		if (str.startsWith("not")) {
		return str;
		} else {
		return "not " + str;
		}
		}

		public static void main(String args[]) // main program
		{
		String case1 = "going to happen";
		String case2 = "a";
		String case3 = "not intrested";
		String expected1 = "not goin to happen";
		String expected2 = "not a";
		String expected3 = "not intrested";

		String str = notAString("String"); // Assigning value to str
		System.out.println(str);

		String result1 = notAString(case1); // Assigning value to result1
		if (result1.equals(expected1)) // checking condition
		System.out.println("pass");
		else
		System.out.println("fail");

		String result2 = notAString(case2); // Assigning value to result 2 as
		// 'not a' by implementing the
		// logic

		if (result2.equals(expected2)) // checking whether case2==expected2
		System.out.println("pass");
		else
		System.out.println("fail");

		String result3 = notAString(case3); // Assigning value to result 3

		if (result3.equals(expected3)) // checking the condition
		System.out.println("pass");
		else
		System.out.println("fail");

		}

		}
		



