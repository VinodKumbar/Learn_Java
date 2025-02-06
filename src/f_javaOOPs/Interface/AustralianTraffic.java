package f_javaOOPs.Interface;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		
		/*I have created an object for this AuttrlianTraffic class to implements 
		 * the method present in the CentralTraffic interface		
		*/
		CentralTraffic cT = new AustralianTraffic (); 
		cT.redStop();
		cT.greeGo();
		cT.flashYellow();
		
		AustralianTraffic aT = new AustralianTraffic (); 
		aT.walkSymbol();
		
		ContinentalTraffic conT = new AustralianTraffic ();
		conT.trainSymbol();

	}

	@Override
	public void greeGo() {
		System.out.println("greenGo Implementation");
	}

	@Override
	public void redStop() {
		System.out.println("redStop Implementation");
	}

	@Override
	public void flashYellow() {
		System.out.println("flashYellow Implementation");
	}
	
	public void walkSymbol() {
		System.out.println("Walking");
	}

	@Override
	public void trainSymbol() {
		System.out.println("Stop on Train Symbol");
		
	}

}
