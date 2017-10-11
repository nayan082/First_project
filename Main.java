import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		choose();
		
	}
	
	public static void choose(){
		System.out.println("What type of operation do you want to perform\n");
		System.out.println("For Add press : A\nFor Sub press : S\n" +
				           "For Mul press : M\nFor Div press : D\n");
		
		Scanner m=new Scanner(System.in);
		char charinput=m.next().charAt(0);
		//System.out.println(charinput);
		if(charinput=='A')Add();
		else if(charinput=='S')Sub(charinput);
		else if(charinput=='M')Mul();
		else if(charinput=='D')Sub(charinput);
		else System.out.println("Wrong Input..");
		
	}
	private static void Add(){
		Scanner a=new Scanner(System.in);
		int aa=a.nextInt();
		Scanner b=new Scanner (System.in);
		int bb=b.nextInt();
		int res=aa+bb;
		System.out.print("Your result ");
		System.out.print(res);
	}
	private static void Sub(int charinput){
		Subtraction s = new Subtraction();
		if(charinput =='D')s.dv();
		else s.sub();
	}
	private static void Mul(){
		System.out.print("please input two numbers: ");
		Scanner a=new Scanner(System.in);
		int aa=a.nextInt();
		Scanner b=new Scanner (System.in);
		int bb=b.nextInt();
		Multiplication obj=new Multiplication(aa,bb);
	}
}
