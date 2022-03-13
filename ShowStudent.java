	//Author: Divine Iloh
	//BINS 5312
	//Date: 03/11/2022

package ShowStudent;
import Student.Student; 

public class ShowStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create undergraduate as an object of the student class
		Student undergradStudent = new Student();
		
		
		//setting the values of the methods in our student class
		undergradStudent.setStudID("T0100999");
		undergradStudent.setCreditHours(10.5);
		undergradStudent.setPTEarned(37.5);
		undergradStudent.setGPA(37.5/10.5);
		
		//display student's records using the get methods
		System.out.println("Student id is 		: " + undergradStudent.getStudID());
		System.out.println("Credit hours is 	: " + undergradStudent.getCreditHours());
		System.out.println("Points Earned is 	: " + undergradStudent.getPTEarned());
		System.out.println("GPA is 			: " + undergradStudent.getGPA());
		
	}

}
