package ExamLogger; 
import org.junit.jupiter.api.*; 
import org.junit.runner.manipulation.InvalidOrderingException; 
import java.io.IOException; 
import java.nio.file.*; 
import static org.junit.jupiter.api.Assertions.assertTrue; 

public class tester { 
	private static final String testFile="testerScore.csv"; 
	
	@BeforeEach 
	void cleanFile() throws IOException,InterruptedException{ 
		Thread.sleep(200); 
		
		try { 
			Files.deleteIfExists(Paths.get(testFile)); 
		}catch(IOException e) {
			System.err.println("Could not delete this file"+e.getMessage()); 
		} 
	} 
	@Test 
	void testConcurrentLogging() throws InterruptedException, IOException{ 
		MarksLogger logger= new MarksLogger(testFile); 
		Student s1 = new Student("Greshma",3001,55); 
		Student s2 = new Student("Reshma",3002,45); 
		Student s3 = new Student("Samiksha",3003,57); 
		Student s4 = new Student("Amruta",3004,99); 
		Student s5 = new Student("Mayuri",3005,67); 
		Student s6 = new Student("Pradnya",3006,60); 
		
		MarksSubmitter m1=new MarksSubmitter(s1,logger);
		MarksSubmitter m2=new MarksSubmitter(s2,logger); 
		MarksSubmitter m3=new MarksSubmitter(s3,logger); 
		MarksSubmitter m4=new MarksSubmitter(s4,logger); 
		MarksSubmitter m5=new MarksSubmitter(s5,logger); 
		MarksSubmitter m6=new MarksSubmitter(s6,logger); 
		
		Thread t1=new Thread(m1,"Test-1"); 
		Thread t2=new Thread(m2,"Test-2"); 
		Thread t3=new Thread(m3,"Test-3"); 
		Thread t4=new Thread(m4,"Test-4"); 
		Thread t5=new Thread(m5,"Test-5"); 
		Thread t6=new Thread(m6,"Test-6"); 
		
		t1.start(); 
		t2.start(); 
		t3.start(); 
		t4.start(); 
		t5.start(); 
		t6.start(); 
		
		t1.join(); 
		t2.join(); 
		t3.join(); 
		t4.join(); 
		t5.join(); 
		t6.join(); 
		
		Thread.sleep(100); 
		
		String content=Files.readString(Paths.get(testFile)); 
		
		assertTrue(content.contains("Greshma,3001")); 
		assertTrue(content.contains("Reshma,3002")); 
		assertTrue(content.contains("Samiksha,3003")); 
		assertTrue(content.contains("Amruta,3004")); 
		assertTrue(content.contains("Mayuri,3005")); 
		assertTrue(content.contains("Pradnya,3006")); 
		
		System.out.println("All marks logged and file checked"); 
	} 
}