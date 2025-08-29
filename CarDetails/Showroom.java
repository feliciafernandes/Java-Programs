package carDetails;

public class Showroom {

	public static void main(String[] args) {
		Car c1 = new Car("Toyota","Corolla",15000,18.5);
		Car c2 = new Car("Honda","Civic",20000,16.0,"John");
		Car c3 = new Car("Hyundai","i20",12000,20.0);
		
		
		System.out.println("Initial Car Details:");
		c1.displayDetails();
		c2.displayDetails();
		c3.displayDetails();
		
		c1.setOwnerName("Alice");
		c1.updatePrice(16000);
		
		System.out.println("After Updates: ");
		c1.displayDetails();
		
		Car.showShowroomName();
		Car.showTotalCars();

	}

}
