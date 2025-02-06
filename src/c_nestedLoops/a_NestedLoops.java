package c_nestedLoops;

public class a_NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// nested loops
		
		for ( int i = 1; i<=4; i++ ) { // (outer loop)this block will loop for 4 times
				System.out.println("Outer loop started");
			
			for(int j=1; j<=4;j++) {   // (inner loop) this block will loop for 4 times
				
				System.out.println("Ineer loop");
				 
			}
			
			System.out.println("Outer loop finished");
		}

	}

}
