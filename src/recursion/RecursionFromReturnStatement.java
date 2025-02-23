package recursion;

public class RecursionFromReturnStatement {

	public static String test() {

		System.out.println("Han ji Good Morning");

		return "Good ETM" + test();
	}

	public static void main(String[] args) {

		System.out.println("Main method starts........");

		System.out.println(test());

		System.out.println("Main method Ends........");
	}

}
