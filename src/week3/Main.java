package week3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare the array
		int[] intArray = {3, 9, 23, 64, 2, 8, 28, 93};
		//calculate first entry subtracted from the last entry
		int minus = intArray[intArray.length - 1] - intArray[0];
		//print results
		System.out.println(intArray[intArray.length - 1] + " - " + intArray[0] + " = " + minus);
	}

}
