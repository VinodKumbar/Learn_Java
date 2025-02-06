package c_nestedLoops;

public class e_multiplOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3
		 * 6  9
		 *12  15  18
		 */

		int k = 3;
		for (int i=1; i<4; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(k);
				System.out.print(" ");
				k=k+3;
			}
			System.out.println(" ");
		}
	}

}