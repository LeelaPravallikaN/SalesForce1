package JavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigitsUsingScanner {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number");
		int num= scan.nextInt();
		int sum=0;
		
		while( num > 0) {
			sum+= num % 10;
			num=num/10;
		}
	    
	    System.out.println(sum);
	}

}
