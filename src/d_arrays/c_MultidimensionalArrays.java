package d_arrays;

public class c_MultidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a[row] [coloumn]

		int a[][] = new int[2][3];

		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;

		a[1][0] = 2;
		a[1][1] = 4;
		a[1][2] = 5;

		System.out.println(a[1][2]);

		// multi-dimenionsal Literal array
		int b[][] = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };

		System.out.println(b[2][1]);

		for (int i = 0; i < 2; i++) {   // row
			for (int j = 0; j < 3; j++) {    // column
				System.out.println(a[i][j]);
			}
		}

	}

}
