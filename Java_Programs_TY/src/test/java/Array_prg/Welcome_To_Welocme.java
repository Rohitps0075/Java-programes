package Array_prg;

public class Welcome_To_Welocme {

	public static void main(String[] args) {
		String s="welcome";
		String s1="";
		for (int i = 0; i < s.length(); i++)
		{
		for (int j = i+1; j < s.length(); j++) 
		{
		if(s.charAt(i)=='c'&& s.charAt(j)=='o')
		{
			 char temp = s.charAt(i);
			 char temp1 = s.charAt(j);
			 temp=temp1;
			 s1=s1+s.charAt(i);
		}
		else
		{
			 s1=s1+s.charAt(i);
		}
		
		}
		
		}
		System.out.println(s1);

	}

}
