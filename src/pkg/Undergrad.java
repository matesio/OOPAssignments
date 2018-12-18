package pkg;

public class Undergrad extends Student {
	int year;
	float gpa;
	public Undergrad(String name, String regId, String courseTitle,int creditHr, char grade, int year)
	{
		super(name,regId,courseTitle,creditHr,grade);
		this.year= year;
		gpa=0;
	
	}
	public void computeGpa()
	{
		if(getGrade()=='A')
		{
			gpa =  getCredithour()* 4;
			System.out.println(super.toString());
			System.out.println("Gpa is "+gpa);
		}
		else if(getGrade()=='B')
		{
			gpa =  getCredithour()* 3;
			System.out.println(super.toString());
			System.out.println("Gpa is "+gpa);
		}
		else if(getGrade()=='C')
		{
			gpa =  getCredithour()* 2;
			System.out.println(super.toString());
			System.out.println("Gpa is "+gpa);
		}
		else
		{
			
			System.out.println(super.toString());
			System.out.println("Fail");
		}
		
	}
	public boolean equals(float newgpa )
	{
		
		if(this.gpa== newgpa)
		{
			return true;
		}
		else 
			return false;
	}

}
