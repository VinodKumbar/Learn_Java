package f_javaOOPs.Interface.Abstract;

public abstract class ParentAirCraft {
	
	/*
	 * Abstraction is a process of hiding the implementation details from the user, 
	 * only functionality will be provided to the user
	 * 
	 * The user will have the information on what the object does instead of how it does it.
	 * 
	 * Class which is declared with abstract keyword is know as an abstarct class in Java
	 * and it can have both abstract and non-abstarct methods.
	 * 
	 * Abstract classes achieved Partial Abstraction
	 * 
	 * Interface are used to for 100% Abstraction
	 */
	
	public void engine() {
		System.out.println("Follow the Engine Guidelines");
	}
	
	public void safetyGuidelines() {
		System.out.println("Follow Safety Guidelines");
	}
	
	public abstract void bodyColor();

}
