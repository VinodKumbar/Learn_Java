package f_javaOOPs.Interface.Abstract;

public class ChildEmirites extends ParentAirCraft {

	public static void main(String[] args) {
		ChildEmirites cE = new ChildEmirites();
		cE.engine();
		cE.safetyGuidelines();
		cE.bodyColor();

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
