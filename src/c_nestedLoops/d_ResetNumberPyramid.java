package c_nestedLoops;

public class d_ResetNumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 */

		for (int i=1; i<5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j + " ");
				//System.out.print(" ");
				
			}
			System.out.println(" ");
		}
	}

}