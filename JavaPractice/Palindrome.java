package JavaPractice;

public class Palindrome {
	public static void main(String[] args) {
		String text = "mom";
		String rev = "";
		char[] charArray = text.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
		{
			rev+=charArray[i];
			System.out.println(rev);
			if(text.equals(rev))
			{
				System.out.println("print given is palindrome "+text);
			}
			else
			{
				System.out.println("print given is not palindrome "+text);
			}
		}
	}

}
