package pkg;

public class Movie {

	private String movieRating;
	private String idNo;
	private String title;
	public String getRating()
	
	{
		return movieRating;
	}
	public String getId()
	{
		return idNo;
	}
	public String title()
	{
		return title;

	}
	public void setRating(String movieRating)
	{
		this .movieRating=  movieRating;

	}
	public void setidNo(String idNo)
	{
		this .idNo= idNo;
	}
	public void setTitle(String title)
	{
		this .title=title;
	}
	public Movie(String movieRating, String idNo,String title)
	{
		this .movieRating=movieRating;
		this .idNo= idNo;
		this .title=title;
	}
	public String  toString()
	{
		return "Rating :"+movieRating+" \nId Number: "+idNo+" \nMovie title :"+title;
	}
	public boolean equals(String title)
	{
		if(this .title.equals(title))
		{
			return true;
		}
		else
			return false;
	}
}
