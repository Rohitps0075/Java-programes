package Array_prg;

public class Swap_Two_Strings_without_using_3rd_variable {

	public static void main(String[] args) {
		String s1="abc";
		String s2="xyz";
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("value of s1 is"+"="+s1);
		System.out.println("value of s2 is"+"="+s2);

	}

}
