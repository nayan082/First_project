import java.util.Scanner;
import java.util.*;
public class Subtraction extends Division{
	
	void sub(){
		System.out.print("please input two numbers: ");
		Scanner a= new Scanner (System.in);
		int val1=a.nextInt();
		Scanner b=new Scanner(System.in);
		int val2=b.nextInt();
		int res=val1-val2;
		System.out.print("Your result is " + res);
	}
	Subtraction(){}
	
}
