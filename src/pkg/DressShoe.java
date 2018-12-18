package pkg;

public class DressShoe extends Shoe{
	String type;

	public DressShoe(String color, String designer, int size, String type) {
		super(color, designer, size);
		this .type=type;
	}
	public boolean equals(String designer)
	{
		if(getdesigner().equals(designer))
		{
			return true;
		}
			else
				return false;
		}
	
public String bill(float price)
{
	System.out.println(super.toString());
	return "Your bill is $"+price; 
}
}


