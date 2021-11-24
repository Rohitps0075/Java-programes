package Array_prg;

public class SumOfDigInString_15ab25xy
{
public static void main(String[] args) 
{
String s="15ab25$x";
int gnum=0;
int sum=0;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)>=48 && s.charAt(i)<=57)
	{
		int n=s.charAt(i)-48;
		gnum=gnum*10+n;
	}
	else
	{
		sum=sum+gnum;
		gnum=0;
	}
	
}
System.out.println(sum);
}
}
