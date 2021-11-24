package Array_prg;

import java.util.LinkedHashSet;

public class No_order_of_occurance_of_word_in_string
{
public static void main(String[] args) 
{
String s="welcome to tyss";
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
	System.out.println(word+"="+count);
}
}
}
