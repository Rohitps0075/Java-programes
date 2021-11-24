package PracticeProgram;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="welcome to tyss company";
String[] str = s.split(" ");
String s1="";

for (int i = str.length-1; i>=0 ; i--) {
	s1=s1+" "+str[i];
	
}
System.out.println(s1);
	}

}
