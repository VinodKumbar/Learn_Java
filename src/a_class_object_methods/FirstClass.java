package a_class_object_methods;

public class FirstClass {

	int a = 3;

	public void getData() {
		int a = 4;
		// Methods - 10 line of code -> page ( 10 lines of code )

		System.out.println("I am in method" + " and the local variable value is " + a);
		// return "first";

		// Objects are the instances / references of a class		
		int b = a + this.a ;
		System.out.println("addition of global and local variable is " + b);

	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hey");
		System.out.println("Hello World");
		
		FirstClass fc = new FirstClass();   // new keyword allocates memory
		fc.getData();
		System.out.println("global variable value is " + fc.a);
		
		SecondClass sc = new SecondClass();
	    sc.setData();
		

	}

}
