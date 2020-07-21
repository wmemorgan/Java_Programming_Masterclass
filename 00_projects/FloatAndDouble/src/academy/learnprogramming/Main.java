package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);	    
        
        double myMinDoubleValue = Double.MIN_VALUE;
	    double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5 / 3f;
        double myDoubleValue = 5 / 3.0;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Covert pounds to kilograms
        // Create variable with appropriate type to store pounds
        double pounds = 200;
        // Calculate the result number of kilograms based on value of pounds variable
        double poundsToKilograms = pounds * 0.45359237;
        // Print out result
        System.out.println(pounds + " pounds is " + poundsToKilograms + " kilograms");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_457_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
