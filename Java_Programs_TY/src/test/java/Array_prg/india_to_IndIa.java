package Array_prg;

public class india_to_IndIa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='i')
			{
				s1=s1+'I';
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}
System.out.println(s1);
	}

}
