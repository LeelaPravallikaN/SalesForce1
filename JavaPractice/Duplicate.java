package JavaPractice;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		        //scanner class
		        Scanner input = new Scanner(System.in);
		        //initialize the array (initialize the length of array)
		        int[] num = new int[5];
		        //Give the print statetmnt 
		        System.out.println("Enter the numbers");
		        //iterate the loop upto the length of array
		        for (int i = 0; i < num.length; i++) {
		        //The given numbers will be stored in arr[i]
		            num[i] = input.nextInt();
		        }
		        //iterate the for loop upto the length
		        for (int i = 0; i < num.length; i++) {
		        //iterate the another loop
		            for (int j = i + 1; j < num.length; j++) {
		            	//compare the both loops
		                if (num[i] == num[j]) {
		                	//print the repeated number in array
		                    System.out.println("The duplicate elements in the array are :"+ num[j]);
		                }
		            }
		        }}}
