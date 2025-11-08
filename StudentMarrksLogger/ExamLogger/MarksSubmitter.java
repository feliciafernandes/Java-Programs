package ExamLogger; 

public class MarksSubmitter implements Runnable{ 
	private Student student; 
	private MarksLogger logger; 
	
	public MarksSubmitter(Student student,MarksLogger logger) { 
		this.student=student; this.logger=logger; 
	} 
	public void run() { 
		String detail=student.makeCSV(); 
		logger.logScore(detail); 
		String threadName=Thread.currentThread().getName(); 
		String tDetails=detail.trim(); 
		System.out.println(threadName + "logged " + tDetails); 
	} 
}