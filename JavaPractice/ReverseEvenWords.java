package JavaPractice;


	import java.util.*;

	public class ReverseEvenWords {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String input = scanner.nextLine();

	        // Split the string into words
	        String[] words = input.split(" ");

	        // Reverse the even-positioned words
	        for (int i = 0; i < words.length; i += 2) {
	            StringBuilder sb = new StringBuilder(words[i]);
	            sb.reverse();
	            words[i] = sb.toString();
	        }

	        // Join the words back into a string
	        String output = String.join(" ", words);

	        // Print the output
	        System.out.println("Reversed string: " + output);
	    }
	}

