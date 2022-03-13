	//Author: Divine Iloh
	//BINS 5312
	//Date: 03/11/2022

package Student;
public class Student {

	//data fields
	private String studID;
	private double creditHours;
	private double ptEarned;
	private double GPA;
	
	//set methods or mutator methods
	
	public void setStudID (String ID)
	{
		studID = ID;
	}
	
	public void setCreditHours (double HRS)
	{
		creditHours = HRS;
	}
	
	public void setPTEarned (double score)
	{
		ptEarned = score;
	}
	
	public void setGPA (double gpa)
	{
		GPA = gpa;
	}
	
	//get methods or accessor methods
	
	public String getStudID()
	{
		return studID;
	}
	
	public double getCreditHours()
	{
		return creditHours;
	}
	
	public double getPTEarned()
	{
		return ptEarned;
	}
	
	public double getGPA()
	{
		return GPA;
	}
	
	//Constructor for the student class
	public Student ()
	{
		studID = "9999";
		ptEarned = 12;
		creditHours = 3;
		GPA = 12/4;		
	}
	
	
	
	
}
