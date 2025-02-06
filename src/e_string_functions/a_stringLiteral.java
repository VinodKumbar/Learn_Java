package e_string_functions;

public class a_stringLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String is one of the pre-build class in Java
		 * there are 2 ways for creating string
		 * 1. By String Literal
		 * 2. By Creating Object of String 
		 */
		
		String a = "Java/Training" ; // string literal
		
		String a1 = new String ("hello") ; // with String class
		
		System.out.println(a.charAt(2));
		
		System.out.println(a.indexOf("T"));
		
		System.out.println(a.substring(3,6));
		
		System.out.println(a.substring(5));
		
		System.out.println(a.concat(" Rahul Teaches"));
		
		System.out.println(a.trim());
		
		System.out.println(a.toUpperCase());
		
		System.out.println(a.toLowerCase());
		
		String arr[] = a.split("/");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println(a.replace("T", "S"));
	}

}
