package PracticeProgram;

public class SeperatecharNum 
{
public static void main(String[] args) {
	String s="as@#er12&^";
	String A="";
	String num="";
	for(int i=0;i<s.length();i++)
	{
		if((s.charAt(i)>=97 && s.charAt(i)<=122))
				{
			A=A+s.charAt(i);
				}
		else if ((s.charAt(i)>=48 && s.charAt(i)<=57))
		{
		num=num+s.charAt(i)	;
		}
	}
	System.out.println(A);
	System.out.println(num);
}
}
