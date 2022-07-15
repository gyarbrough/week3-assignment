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
		double[] decimalsOne = {3.14, 6.66, 2.71, 13.97, 99.99, 0.13, 66.66};
		double[] decimalsTwo = {3.14, 6.66, 2.71, 13.97, 99.99, 0.13};
		System.out.println(compareAverage(decimalsOne, decimalsTwo));
		
		//Question 12
		System.out.println(willBuyDrink(true, 12.50));
		
		/*Question 13
		  I created a function to convert the temperature from celsius to fahrenheight and visa versa, 
		  because I've always found it useful to be able to convert between the two. */
		System.out.println("The converted temperature is " + tempConversion(95, "f") + " degrees.");
		
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
	public static boolean compareAverage(double[] array1, double[] array2) {
		double sum1 = 0;
		double sum2 = 0;
		
		for (int i = 0; i < array1.length; i++) {
			sum1 += array1[i];
		}
        
		for (int i = 0; i < array2.length; i++) {
			sum2 += array2[i];
		}
        
		double average1 = sum1 / array1.length;
        double average2 = sum2 / array2.length;
        
        if (average1 > average2) {
        	return true;
        } else {
        	return false;
        }
	}
	
	//Question 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	//Question 13
	public static double tempConversion(double temp, String unit) {
		double convertedTemp = 0;
		if (unit.equalsIgnoreCase("c")) {
			convertedTemp = temp * 9 / 5 + 32;
		}
		if (unit.equalsIgnoreCase("f")) {
			convertedTemp = ((temp - 32) * 5)/ 9;
		}
		return convertedTemp;
	}
	 
	}
