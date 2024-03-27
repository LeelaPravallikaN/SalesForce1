package JavaPractice;

public class RemoveVowels {
public static void main(String[] args) {
	String text = "TestLeaf";
	String replaceAll = text.replaceAll("[a,e,i,o,u]","");
	System.out.println(replaceAll);
}
}
