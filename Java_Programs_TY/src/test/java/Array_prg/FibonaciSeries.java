package Array_prg;

public class FibonaciSeries {

	public static void main(String[] args) 
	{
		//0 1 1 2 3 5 8 13 21 34 55.......
		int fib1=0;
		int fib2=1;
		int fib3=0;
		System.out.print(fib1+" "+fib2);
		for(int i=1;i<10;i++)
		{
			fib3=fib1+fib2;//add fib1+fib2
			fib1=fib2;//swap
			fib2=fib3;//swap
			System.out.print(" "+fib3);	
		}
		

	}

}
