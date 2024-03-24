package JavaPractice;

public class Reverese_number {
public static void main(String[] args) {
	int num= 12345;
	int rem;
	int rev=0;
	while(num!=0) {
		rem =num%10;
		rev= rev *10+rem; //rev=0*10+rem
		num=num/10;
		System.out.println("reverse number is: "+rev);
		
	}
	 
}
}
