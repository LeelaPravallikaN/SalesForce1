package JavaPractice;
public class PrintTheDuplicateWords {
	public static void main(String[] args) {
		// initialize the array
		String text = "my self leela leela";//and 
		// initialize the count
		int count;
		// change the text to lower case
		text = text.toLowerCase();
		// split the words
		String[] word = text.split(" ");
		// print the statement
		System.out.println("Duplicate words are: ");
		// iterate the loop
		for (int i = 0; i < word.length; i++) {
			// count value =1
			count = 1;
			for (int j = i + 1; j < word.length; j++) {

				if (word[i].equals(word[j]))
				{
					count++;
					word[j]= "0";
				}
			}
				if (count >1 && word[i]!="0") 
				{
					System.out.println(word[i]);
				}
			}
		}
	}