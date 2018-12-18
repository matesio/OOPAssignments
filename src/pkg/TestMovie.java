package pkg;
import java.util.*;
public class TestMovie {
	public static void main (String [] args )
	{
		Scanner object= new Scanner (System.in);
		Action obj= new Action ("PG-18","PGNFC123X2","Big Hero 6");
		
		
		obj.print();
		System.out.println("Enter No of days");
		int noDays= object.nextInt();
		System.out.println(obj.calcLateFee(noDays));
		//baqi classes comedy aur dusaray khud dal k daikh lana
	}

}
