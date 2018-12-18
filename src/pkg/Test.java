package pkg;

public class Test {
	public static void main(String [] args )
	{
		Undergrad obj = new Undergrad("Shuja", "Fa13-BCS-111","OOP", 2, 'A', 2014);
		obj.computeGpa();
		Undergrad obj1 = new Undergrad("Shuja", "Fa13-BCS-111","OOP", 2, 'A', 2014);
		obj1.computeGpa();
		System.out.println(obj.equals(obj1.gpa));
		Graduate object= new Graduate("Shuja", "Fa13-BCS-111","OOP", 2, 'A', "Thesis");
		object.computeGpa();
		System.out.println(object.toString());
		Graduate object1= new Graduate("Shuja", "Fa13-BCS-111","OOP", 2, 'A', "Thesis1");
		object1.computeGpa();
		object1.toString();
		object.equals(object1.thesisTitle);
	}

}
