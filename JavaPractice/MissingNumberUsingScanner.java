package JavaPractice;


	import java.util.Scanner;

	public class MissingNumberUsingScanner {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get the size of the array
	        System.out.println("Enter the size of the array: ");
	        int n = scanner.nextInt();

	        // Create an array of size n
	        int[] arr = new int[n];

	        // Get the elements of the array
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Find the missing number
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            sum += arr[i];
	        }

	        int sumOfFirstNNumbers = n * (n + 1) / 2;

	        int missingNumber = sumOfFirstNNumbers - sum;

	        // Print the missing number
	        System.out.println("The missing number is: " + missingNumber);
	    }
	}

