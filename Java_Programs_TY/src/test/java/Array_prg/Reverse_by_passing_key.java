package Array_prg;

import java.util.Scanner;

public class Reverse_by_passing_key {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the key");
		int key=sc.nextInt();
		int a[]={10,20,30,40,50};
		for(int i=1;i<=key;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");	
		}



	}

}
