package Array_prg;

import java.util.LinkedHashSet;

public class PrintOnlydupWordsInAGivenString {

	public static void main(String[] args)
	{
	String s="welcome to to tyss";
	String[] str = s.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	for(int i=0;i<str.length;i++)
	{
		set.add(str[i]);
	}
	for(String word:set)
	{
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(word.equals(str[i]))
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println(word+"="+count);
		}
	}
			

	}

}
