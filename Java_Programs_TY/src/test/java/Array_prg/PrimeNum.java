package Array_prg;

public class PrimeNum {

	public static void main(String[] args) {
		Boolean flag=true;
		int no=7;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("it is prime number");
		}
		else
		{
			System.out.println("it is not a prime number");
		}

	}

}
