package week3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 77};
		//calculate first entry subtracted from the last entry
		int minus = ages[ages.length - 1] - ages[0];
		System.out.println(ages[ages.length - 1] + " - " + ages[0] + " = " + minus);
		//1c: Calculate average
		double sum = 0;
		for (int i = 0; i < ages.length; i++) {
			//calculate sum of ages
			sum += ages[i];
		}
		//calculate average age
	    double average = sum / ages.length;
		System.out.println("Average of all ages = " + average);
		
		//Question 2
		//2a: Average number of letters.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double charSum = 0;
		for (int i = 0; i < names.length; i++) {
			//sum of characters
			charSum += names[i].length();
		}
		//calculate average
		double charAverage = charSum / names.length;
		System.out.println("Average number of letters = " + charAverage);
		
		//2b: Concatenate names
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println("");
		
		/* Question 3: How do you access the last element of any array?
		   arrayName[arrayName.length - 1
		   
		   Question 4: How do you access the first element of any array?
		   arrayName[0]
		*/
		
		//Question 5
		int[] nameLengths = new int[6];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//Question 6
		int lengthSum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
	    lengthSum += nameLengths[i];
		}
		System.out.println("The sum of the elements in nameLengths is " + lengthSum);
		
		//Question 7
		System.out.println(repeat("word", 5));
		
		//Question 8
		System.out.println(fullName("Garrett", "Yarbrough"));
		
		//Question 9
		int[] numbers = {13, 69, 7, 11, 55};
		System.out.println(greaterThan(numbers));
		
		//Question 10
		double[] decimals = {3.14, 6.66, 2.71, 13.97, 99.99, 0.13};
		System.out.println(decimalAverage(decimals));
		
		//Question 11
		double[] decimalsOne = {3.14, 6.66, 2.71, 13.97, 99.99, 0.13};
		double[] decimalsTwo = {3.14, 6.66, 2.71, 13.97, 99.99, 0.13};
		
		//Question 12
		
		//Question 13
		}
	
	    //Question 7
	public static String repeat(String word, int n) {
		String phrase = "";
		for (int i = 0; i < n; i++) {
			phrase += word;
		}
		return phrase;
	}
	
	//Question 8
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//Question 9
	public static boolean greaterThan(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	//Question 10
	public static double decimalAverage(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}
	
	//Question 11
	
	
	//Question 12
	
	
	//Question 13
	 
	}
