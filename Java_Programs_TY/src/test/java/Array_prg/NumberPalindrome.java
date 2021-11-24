package Array_prg;

public class NumberPalindrome {

	public static void main(String[] args)
	{
	//take number 775 and check it is palindrome or not i.e; 577
		int no=775;
		int rev=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
		if(rev==copy)
		{
			System.out.println(rev+" "+"is a palindrome");
		}
		else
		{
			System.out.println(rev+" "+"is not a palindrome");
		}

	}

}
