package PracticeProgram;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean flag=true;
		int no=5;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println("it is prime");
		}
		else
		{
			System.out.println("it is not a prime");
		}

	}

}
