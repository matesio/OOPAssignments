package pkg;

public class Action extends Movie {
	public Action(String movieRating, String idNo,String title)
	{
		super(movieRating, idNo, title);
	}
	public void print()
	{
		System.out.println(super.toString());
	}
	public float  calcLateFee(int noDays)
	{
		//super.toString();
		float fee;
		super.toString();
		return (float) (fee=2+(3*noDays));

		
	}

}
