package Array_prg;

public class StringPalindrome
{
public static void main(String[] args) 
{
String s1="amma";
String s2="";
String copy=s1;
for(int i=s1.length()-1;i>=0;i--)
{
	s2=s2+s1.charAt(i);
}
if(copy.equals(s2))
{
	System.out.println(s2+" "+"it is a palindrome");
}
else
{
	System.out.println(s2+" "+"it is not a palindrome");	
}
	
}
}
