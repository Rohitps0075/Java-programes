package PracticeProgram;

public class PrimeNum {

	public static void main(String[] args) {
	Boolean flag=true;
	int no=17;
	for(int i=2;i<17;i++)
	{
		if(no%i==0)
		{
			flag=false;
			break;
		}
	}
	if(flag==true)
	{
		System.out.println("it is a prime number");
	}
	else
	{
		System.out.println("it is not a prime number");
	}

	}

}
