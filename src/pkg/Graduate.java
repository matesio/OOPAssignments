package pkg;

public class Graduate extends Student {
		String thesisTitle;
		float gpa;
		public Graduate(String name, String regId, String courseTitle,int creditHr, char grade, String thesisTitle)
		{
			super(name,regId,courseTitle,creditHr,grade);
			this.thesisTitle=thesisTitle;
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
		public boolean equals(String thesisTitle )
		{
			
			if(this.thesisTitle.equals(thesisTitle) )
			{
				return true;
			}
			else 
				return false;
		}

	}



