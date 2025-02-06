package b_conditions_for_if_while;

public class a_Forloop {

	public static void main(String[] args) {

		/*
		 * if ( 5 < 2) { System.out.println("Success"); } else {
		 * System.out.println("Failure"); }
		 */

		// 1 to 10
		// for ( Initialization ; Condition ; Increment )
		for (int i = 0; i <= 10; i = i + 2) {
			if (i == 8)
				System.out.println(" 8 is displayed");
			else
				System.out.println("I did not find");
			// System.out.println(i);
		}

		for (int j = 0; j < 10; j++) {
			System.out.println(j);

		}

		for (int k = 0; k < 10; k = k + 2) {
			System.out.println(k);

		}

		for (int x = 5; x < 3; x++) {
			System.out.println(x);

		}

	}

}
