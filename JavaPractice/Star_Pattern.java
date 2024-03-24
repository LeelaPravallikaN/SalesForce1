/**
 * 
 */
package JavaPractice;

import java.util.Scanner;
public class Star_Pattern {
	public static void main(String[] args) {
		//int number ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int number = scan.nextInt();
		
		for(int i=0; i<number ; i++)
		{
		for(int j=0; j<=i; j++)
		{
			System.out.print("*");
			
		}
		System.out.println();
		}
		scan.close();
		}	
}