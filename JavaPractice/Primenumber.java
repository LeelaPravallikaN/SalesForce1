package JavaPractice;

public class Primenumber {
	public static void main(String[] args) {
		//intialize the variable and assign the value
		int num =9;
		//intialize the variable count
		int count =0;
        //Apply condition 
		//i.e prime number condition is The number should be greater than one and divisible by one and itself
		if (num>1) {
		//Apply for loop iterate upto given number i.e  6
			for(int i=1;i<=num;i++) {
		//apply the condition 		
				if(num%i==0) {
					count++;
				}
				//if the count is equal to only two numbers i.e 2 is prime 
				if(count==2) {
					System.out.println(num +"Is primenumber");
				}
				else {
					System.out.println(num +"Is not a prime");
				}
					
			}
		}
		else {
			System.out.println("not a prime");
		}
	}

}