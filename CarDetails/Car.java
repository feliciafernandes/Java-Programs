package carDetails;

public class Car {
	private String brand;
	private String model;
	private double price;
	private double mileage;
	private String ownerName;
	
	private static int totalCars=0;
	private static String showroomName="City Motors";
	
	public Car(String brand,String model,double price, double mileage) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.mileage = mileage;
		this.ownerName="Not Assigned";
		totalCars++;
	}
	
	public Car(String brand,String model,double price,double mileage,String ownerName) {
		this.brand= brand;
		this.model=model;
		this.price=price;
		this.mileage=mileage;
		this.ownerName=ownerName;
		totalCars++;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName=ownerName;
	}
	
	public void displayDetails() {
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Price : Rs"+price);
		System.out.println("Mileage : "+mileage + "km/l");
		System.out.println("Owner : "+ ownerName);
		System.out.println("--------------------------");	
	}
	
	public void updatePrice(double newPrice) {
		this.price=newPrice;
	}
	
	public static void showTotalCars() {
		System.out.println("Total Cars: "+totalCars);		
	}
	
	public static void showShowroomName() {
		System.out.println("Showroom: "+showroomName);
	}	
}
