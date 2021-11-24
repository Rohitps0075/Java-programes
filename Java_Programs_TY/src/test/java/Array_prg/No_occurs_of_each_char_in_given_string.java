package Array_prg;

import java.util.HashSet;

public class No_occurs_of_each_char_in_given_string 
{
public static void main(String[] args) 
{
String s="tyss";
//step1: create set collection and add all the char of given string into set
HashSet<Character>set=new HashSet<Character>();
for (int i = 0; i < s.length(); i++)
{
	set.add(s.charAt(i));	
}
//step2: compare each char of set with all the char of given string
for (Character ch : set) 
{
int count=0;
for (int i = 0; i < s.length(); i++) 
{
if (ch==s.charAt(i))
{
	//step3:if char is matching increment the count.
count++;	
}	
}
//print both char and count
System.out.println(ch+"="+count);
}

}
}
