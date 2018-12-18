package pkg;

public class Drama extends Movie {

	public Drama(String movieRating, String idNo,String title)
	{
		super(movieRating, idNo, title);
	}
	public void print()
	{
		System.out.println(super.toString());
	}
	public float calcLateFee(int noDays)
	{
//		super.toString();
		 float fee;
		 return(float) (2+(2*noDays)); 
		
	}
}
