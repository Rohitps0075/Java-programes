package Array_prg;

public class SeperatecharctersNumbersAlpha {

	public static void main(String[] args) {

String s="a1b$x2%?!";
String alpha="";
String num="";
String spl="";
for (int i = 0; i < s.length(); i++) 
{
if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z'))
{
	alpha=alpha+s.charAt(i);
			
}
else if ((s.charAt(i)>=48 && s.charAt(i)<=57))
{
	num=num+s.charAt(i);
}
else
{
	spl=spl+s.charAt(i);
			
}
}
System.out.println("alphbets are:"+alpha);
System.out.println("numbers are:"+num);
System.out.println("specal char are:"+spl);

	}

}
