package homerWork3Week;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorNumber()+" nolu "+instructor.getFirstName()+" "
				+instructor.getLastName()+" isimli e�itimci sisteme ba�ar�l� �ekilde kay�tedildi.");
	}

}
