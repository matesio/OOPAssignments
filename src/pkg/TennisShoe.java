package pkg;

public class TennisShoe extends Shoe {
	String type;
	final float discount=(float) 0.1;
	public TennisShoe(String color, String designer, int size,String type) {
		super(color, designer, size);
		this.type=type;
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
	public float bill(float price)
	{
		System.out.println(super.toString());
		return price-(price*discount); 
	}

}
