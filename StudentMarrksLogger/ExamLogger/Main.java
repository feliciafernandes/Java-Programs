package ExamLogger; 
import ExamLogger.*; 
import java.io.File; 

public class Main { 
	public static void main(String[] args) { 
		String filePath="mainScore.csv"; 
		MarksLogger logger=new MarksLogger(filePath); 
		File file=new File(filePath); 
		String absPath=file.getAbsolutePath(); 
		System.out.println("Writing to file :"+absPath); 
		Student s1=new Student("Felicia", 101,89); 
		Student s2=new Student("Cecilia ", 102,65); 
		Student s3=new Student("Soujanya", 103,43); 
		Student s4=new Student("Bhumika", 104,62); 
		Student s5=new Student("Dhanya", 105,34); 
		Student s6=new Student("Inchara", 106,69); 
		
		MarksSubmitter m1=new MarksSubmitter(s1,logger); 
		MarksSubmitter m2=new MarksSubmitter(s2,logger);
		MarksSubmitter m3=new MarksSubmitter(s3,logger); 
		MarksSubmitter m4=new MarksSubmitter(s4,logger); 
		MarksSubmitter m5=new MarksSubmitter(s5,logger); 
		MarksSubmitter m6=new MarksSubmitter(s6,logger); 
		
		Thread t1=new Thread(m1,"Thread-1"); 
		Thread t2=new Thread(m2,"Thread-2"); 
		Thread t3=new Thread(m3,"Thread-3"); 
		Thread t4=new Thread(m4,"Thread-4"); 
		Thread t5=new Thread(m5,"Thread-5"); 
		Thread t6=new Thread(m6,"Thread-6"); 
		
		t1.start(); 
		t2.start(); 
		t3.start(); 
		t4.start(); 
		t5.start(); 
		t6.start(); 
		
		try { 
			t1.join(); 
			t2.join(); 
			t3.join(); 
			t4.join(); 
			t5.join(); 
			t6.join(); 
		}catch(InterruptedException e) { 
			e.printStackTrace(); 
		} 
		
		System.out.println("All the marks are logged"); 
	} 
}