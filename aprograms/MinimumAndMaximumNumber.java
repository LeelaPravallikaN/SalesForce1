package aprograms;

public class MinimumAndMaximumNumber {
	public static void main(String[] args) {

		minimum();
		maximum();
	}

	private static void maximum() {
		// initialize the array
		int[] arr = { 1, 2, 3, 4, 5 }; // arr[0]=1,arr[1]=2,....
		int max = arr[0]; // max=1
		// iterate for loop upto the length
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) { // arr[i]=2 ,max=1
				// max=1 // 2>1 T //max=2 //3>2 T //max=3 4>3 T //max=4 5>4 T //max=5
				max = arr[i];
			}
			System.out.println("maximum value is :" + max);
		}
	}

	private static void minimum() {
		// initialize the array
		int[] arr = { 6, 8, 7, 4, 1 }; // arr[0]=6,arr[1]=8,....
		int min = arr[0]; // min=6
		// iterate for loop upto the length
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) { // arr[i]=8 ,min=6//8<6 F

				// min=6 7<6 F //min=6 4<6 T //min=4 1<6 T //min=1
				min = arr[i];
			}
			System.out.println("minimum value is :" + min);
		}
		System.out.println(" ");
	}
}
