import java.util.Scanner;
public class Search_Element {

	public static void main(String[] args) {
		int n,x,flag=0,i=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements to the array:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			}
		System.out.println("Enter the element you want to search:");
		x=s.nextInt();
		for(i=0;i<=n;i++)
		{
			if(a[i]==x)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Element found at position:"+(i+1));
		}
			else
			{
				System.out.println("Element not found");
			}
		}
		}

		
