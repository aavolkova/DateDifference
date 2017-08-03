package datedifference;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateDifference {
	/**
	 * This application tell the difference between two dates in days.
	 * @author Anna Volkova
	 */	
	public static void main(String[] args) {
		
	 	int year1;
	 	int year2;
		
	 	int month1;
	 	int month2;
		
	 	int dayOfMonth1;
	 	int dayOfMonth2;
	 
	 	// Create a Scanner object
	 	Scanner input = new Scanner(System.in);
	 	
	 	System.out.println("*** Calculate Duration Between Two Dates ***");
	 	System.out.println();
	 	
	 	System.out.println("Enter First date: "); 	
	 	System.out.print("Year YYYY: ");
	 	year1 = Integer.parseInt(input.next());
	 	System.out.print("Month MM: ");
	 	month1 = Integer.parseInt(input.next());
	 	System.out.print("Day DD: ");
	 	dayOfMonth1 = Integer.parseInt(input.next());
	 	System.out.println();
	 	System.out.println("Enter Second date: ");
	 	System.out.print("Year YYYY: ");
	 	year2 = Integer.parseInt(input.next());
	 	System.out.print("Month MM: ");
	 	month2 = Integer.parseInt(input.next());
	 	System.out.print("Day DD: ");
	 	dayOfMonth2 = Integer.parseInt(input.next());
	 	System.out.println();	 	
	 	
	 	// Create two dates
	 	LocalDate firstDate = LocalDate.of(year1, month1, dayOfMonth1 );
	 	LocalDate secondDate = LocalDate.of(year2, month2, dayOfMonth2);
		
	 	// Calculate difference in days
		final long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);
		
		// Display result
        System.out.println("Days between two dates: " + daysBetween);		
	}
}
