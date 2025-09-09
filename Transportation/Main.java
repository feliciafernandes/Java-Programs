import transport.*;

public class Main {

	public static void main(String[] args) {
		EBike e1 = new EBike("EB-101",50);
		e1.deliver("Sandwich","Library"); 
		Drone d = new Drone ("DR-1");
		d.deliver("Notes", "Examcell");
		d.deliver("USB", "CSE Block");
		double bill = d.cost(5);
		System.out.println("Drone delivery cost: Rs." + bill);
	}
}
