package homerWork3Week;

public class StudentManager extends UserManager {
	
	
	public void add(Student student) {
		System.out.println(student.getStudentNumber() +" nolu "+student.getFirstName()+" "+student.getLastName()
		+" isimli ��renci ba�ar�yla kay�tedildi. ");
		
	}

}
