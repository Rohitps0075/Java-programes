package Array_prg;

public class Swap2NumWithout3rdVar {

	public static void main(String[] args) 
	{
		int a=175;
		int b=75;
		System.out.println("value of a before swap "+a);
		System.out.println("value of b before swap "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a after swap "+a);
		System.out.println("value of a after swap "+b);

	}

}
