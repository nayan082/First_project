import java.util.Scanner;
import java.util.*;

public class Division {
	
	void dv()
	{
		System.out.print("Please input two numbers : " );
		Scanner a=new Scanner(System.in);
		int aa=a.nextInt();
		Scanner b=new Scanner(System.in);
		int bb=b.nextInt();
		
		int mod=aa%bb;
		int res=aa/bb;
		
		System.out.println("Your result " + res);
		System.out.println("Mod is " + mod);
		
	}
	
}
