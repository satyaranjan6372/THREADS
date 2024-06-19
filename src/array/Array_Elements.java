package array;

   import java.util.Scanner;

   public class Array_Elements {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the n values");
		int n = s.nextInt();
		System.out.println(n);
		int[]a = new int[n];
		System.out.println("enter" +n+"integer element");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("entered element are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
   }
	

   



		
		
			
		
		
		
		
		
	


