package pkg;

public class Student {
	private String name;
	private String regId;
	private String courseTitle;
	private int creditHr;
	private char grade;
	public String getname ()
	{
		return name;
	}
	public String getregId()
	{
		return regId;
		
	}
	
public String getCourse()
{
	return courseTitle;
}
public  int getCredithour()

{
	return creditHr;
}
public char getGrade()
{
	return grade;
}

public  void setName (String name )
{
	this .name = name ;
	
}
public void setregId(String regId)
{
	this.regId= regId;
}
public void setcourse(String courseTitle )
{
	this.courseTitle= courseTitle;
}
public void setCredit(int creditHr)
{
	this .creditHr= creditHr;
}
public void setGrade(char grade)
{
	this .grade=grade;
}
public Student(String name, String regId, String courseTitle,int creditHr, char grade)
{
	this .name= name ;
	this .regId= regId;
	this.courseTitle=courseTitle;
	this.creditHr=creditHr;
	this.grade= grade;
}
public String toString()
{
	return "name:"+name +" :Reg:"+regId+":course:"+courseTitle+":Credit hours:"+creditHr+":grade:"+grade;
}

}
