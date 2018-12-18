package pkg;

public class Comedy extends Movie {

	public Comedy(String movieRating, String idNo,String title)
	{
		super(movieRating, idNo, title);
	}
	public void print()
	{
		System.out.println(super.toString());
	}
	public float calcLateFee(int noDays)
	{
		
		 float fee;
		 return(float) (2+(2.50*noDays)); 
		
	}
}
