package pkg;

public class TestShoe {
	public static void main (String [] args)
	{
		DressShoe obj= new DressShoe("Black", "Bata", 42, "Flats");
		System.out.println(obj.bill(200) );
		TennisShoe object= new TennisShoe ("White", "Cheetah", 41, "high top");
		System.out.println("Your bill is $"+ object.bill(500));
	}

}
