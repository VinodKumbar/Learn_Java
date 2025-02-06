package d_arrays;

public class a_singleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A container which stores Multiple values of same data type
		
		int a[] = new int[5];  // declared an array and allocates memory for the values
		a[0] = 2;
		a[1] = 6;
		a[2] = 1;
		a[3] = 9;
		a[4] = 12; // initialized values into that array
		
		// how to retrieve elements from array
		
		for (int i = 0; i < a.length; i ++) {
			System.out.println(a[i]);
		}
	}

}
