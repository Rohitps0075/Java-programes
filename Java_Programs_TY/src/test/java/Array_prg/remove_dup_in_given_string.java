package Array_prg;

import java.util.LinkedHashSet;

public class remove_dup_in_given_string
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
String s="tyss";
LinkedHashSet<Character> set=new LinkedHashSet<Character>();
for(int i=0;i<s.length();i++)
{
	set.add(s.charAt(i));
}
for(Character ch:set)
{
	System.out.print(ch);
}
	}
}
