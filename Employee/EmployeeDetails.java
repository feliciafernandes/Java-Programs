package employee;

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee e1=new Employee("Bhumika",101,70000);
		Employee e2=new Employee("Soujanya",102,80000);
		
		System.out.println("Initial Details Employee ");
		System.out.println("Employee 1:");
		e1.displayDetails();
		
		System.out.println("Employee 2:");
		e2.displayDetails();
		
		
		e1.increaseSalary(15);
		e2.increaseSalary(10);
		System.out.println();
		
		System.out.println("Updated Employee Details");
		
		System.out.println("Employee 1:");
		e1.displayDetails();
		
		System.out.println("Employee 2:");
		e2.displayDetails();
					
	}
}
