package pkg;

public class Shoe {
	private String color;
	private String designer;
	private int size;
	public String getColor()
	{
		return color;
	}
	public String getdesigner()
	{
		return designer;
	}
	public int size()
	{
		return size;
	}
	public void setColor(String color)
	{
		this .color= color;
	}
	public void setDesigner(String designer)
	{
		this .designer= designer;
	}
	public void setSize(int size)
	{
		this .size= size;
	}
	public Shoe(String color, String designer, int size)
	{
		this .color=color;
		this .designer=designer;
		this .size=size;
	}
	public String toString ()
	{
		return "Color: "+color+"\nDesigner:"+designer+"\nSize:"+size;
	}
}
	

