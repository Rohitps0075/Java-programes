package PracticeProgram;

public class aaaaaaaaaaaaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="12ab45cd10";
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
sum=sum+gnum;
System.out.println(sum);
	}

}
