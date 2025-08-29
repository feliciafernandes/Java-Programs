package employee;

public class Employee {
	String name;
	int id;
	double salary;
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("Employee ID: "+id);
		System.out.println("Name :"+ name);
		System.out.println("Salary : Rs."+ salary);
		System.out.println("--------------------------");
	}
	
	public void increaseSalary(double percentage) {
		double increment = (salary * percentage)/100;
		salary=salary+increment;
		System.out.println(name+"'s salary increased by "+ percentage+" %");
	}
}
