package JavaPractice;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {	
		
//	int num=123;
//	 int sum =0;
//	 while(num>0) {           //123>0 T 123%10=3 sum=3 123/10=12 num 12 
//		 sum+=num%10;          //12>0 T  12%10=2 sum=2 12/10=1  num=1
//		 num/=10;				//1>0 T  1%10=1  sum=1 1/10=0  num=0
//	 }
//	System.out.println("sum of digits is: "+ sum);

int num=123;
int sum = 0,rem = 1;
while(num>0) {
	rem=num%10;
	sum=sum+rem;
	num=num/10;
}
System.out.println("sum is: "+sum);
}}
