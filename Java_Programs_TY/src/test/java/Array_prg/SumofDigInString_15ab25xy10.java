package Array_prg;

public class SumofDigInString_15ab25xy10 {

	public static void main(String[] args) {
		String s="15ab25$x10";
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


