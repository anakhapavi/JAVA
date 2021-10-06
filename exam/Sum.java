import java.io.*;
import java.util.Scanner;
 class Sum{
 	public static void main(String args[])
 	{
 		int n,sum=0,dig;
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter a number");
 		n=sc.nextInt();
 		
 		sum=n%10;
 		System.out.println("Sum:"+sum);
 		
 	}
 }
