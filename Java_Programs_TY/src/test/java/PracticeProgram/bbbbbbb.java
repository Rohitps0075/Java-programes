package PracticeProgram;

public class bbbbbbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a2b3c4";
		String s1="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				int n=s.charAt(i)-48;
			 char ss = s.charAt(i-1);
			 s1=s1+ss*n;
					 
			
			}
		}
System.out.println(s1);
	}

}
