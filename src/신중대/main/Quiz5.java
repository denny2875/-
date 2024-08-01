package 신중대.main;

public class Quiz5 {

	public static void main(String[] args) {
		Student student = new Student(1001 , "둘리");
		Student student2 = new Student(1002 , "또치");
		Student student3 = new Student(1003, "도우너");
				
		student.cnffur();
		student2.cnffur();
		student3.cnffur();
		
		
	
	}

}

class Student {
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public void cnffur() {
		System.out.println(" student Id = " + studentID + " studentName = " + studentName);
		
	}
}
