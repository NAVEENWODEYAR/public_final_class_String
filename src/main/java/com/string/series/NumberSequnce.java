package com.string.series;
/**
 * @author Naveen K Wodeyar
 * @date 30-Sept-2024
 */
public class NumberSequnce {

	    private long currentNumber;

	    // Initialize the generator with a starting number
	    public NumberSequnce(long startingNumber) {
	        if (startingNumber < 1000000000L || startingNumber >= 10000000000L) {
	            throw new IllegalArgumentException("Starting number must be a 10-digit number.");
	        }
	        this.currentNumber = startingNumber;
	    }

	    // Method to get the next ticket number
	    public long getNextNumber() {
	        if (currentNumber >= 9999999999L) {
	            throw new IllegalStateException("No more 10-digit numbers available.");
	        }
	        return currentNumber++;
	    }

	    public static void main(String[] args) {
	        // Start from the first 10-digit number
	    	NumberSequnce generator = new NumberSequnce(1000000000L);

	        // Example: Generate the next 10 ticket numbers
	        for (int i = 0; i < 10; i++) {
	            System.out.println(generator.getNextNumber());
	        }
	    }
	}

