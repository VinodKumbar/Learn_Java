package e_string_functions;

public class b_reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "madam";
		String t = "";
		for ( int i = s.length()-1; i>=0; i--) {
			t= t+s.charAt(i);
		}
		System.out.println(t);
		
		if(s.equals(t)) {
			System.out.println("given string is Palindrome");
		}
			else
				System.out.println("given string is not a Palindrome");
		}

	}
