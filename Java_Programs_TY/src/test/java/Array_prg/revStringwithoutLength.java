package Array_prg;

public class revStringwithoutLength {
	public static void main(String[] args) {
		String s="rohit";
		String s1="";
		int count=s.compareTo(s1);
		for(int i=count-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}
}
