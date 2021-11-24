package Array_prg;

public class vowels 
{
public static void main(String[] args) {
	String s="abstraction";
	for(int i=0;i<s.length();i++){
	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
	{
		System.out.print(s.charAt(i)+" ");
	}
}
}
}
