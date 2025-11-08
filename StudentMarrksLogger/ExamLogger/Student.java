package ExamLogger; 

public class Student { 

	private String name; 
	private int rollNo; 
	private int marks; 
	
	public Student(String name,int rollNo,int marks){ 
		this.name=name; 
		this.rollNo=rollNo; 
		this.marks=marks; 
	} 
  
public String makeCSV() { 
	
	String csv=String.format("%s,%d,%d%n",name,rollNo,marks); 
	
	return csv; 
	
	} 
}
