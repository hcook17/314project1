/*
 * This program receives two boolean values from the user and determines five values.
 * The values determined are; conjunction, disjunction, exclusive or, 
 * condtional and biconditional.These values are printed out for the user
 * and the user can then alter their boolean values to determine the five new truth values. 
 */
//
import java.util.*;
public class Test {
public static void main(String[] args) {
	    boolean p; //values to be initialized by user
	    boolean q;
	    String cont = "yes"; //will be used to let the program loop
	    Scanner input = new Scanner(System.in); //will let us receive input from user
	    while(cont.equalsIgnoreCase("yes"))
	    {
	    System.out.println("Would you like p to be true or false?");
	    p = input.nextBoolean(); //sets boolean value to user's desired value
	    System.out.println("Would you like q to be true or false?");
	    q = input.nextBoolean(); //sets boolean value to user's desired value
	    //prints the 5 values using the methods created below
	    System.out.print("\nThe conjunction value of your p and q values is: ");
	    System.out.println(conjunction(p, q));
	    System.out.print("\nThe disjunction value of your p and q values is: ");
	    System.out.println(disjunction(p, q));
	    System.out.print("\nThe exclusive or value of your p and q values is: ");
	    System.out.println(exclusiveOr(p, q));
	    System.out.print("\nThe condtional value of your p and q values is: ");
	    System.out.println(conditional(p, q));
	    System.out.print("\nThe bicondtional value of your p and q values is: ");
	    System.out.println(biConditional(p, q));
	    System.out.println("\nWould you like to continue? yes or no");
	    cont = input.next(); //allows for looping
	    }
	    
}
//conjunction requires both p and q values to be true to return true, if not, the value is false.
// as shown in method below
	public static boolean conjunction(boolean p, boolean q) {
		if (p == false || q == false) {
			return false;
		} else
			return true;
	}
//disjunction only requires p or q to be true, if both are false, then it is false.	As shown in method below
	public static boolean disjunction(boolean p, boolean q) {
		if (p == true || q == true) {
			return true;
		} else
			return false;
	}
//if p is true, q needs to be false for exclusive or to be true and vice versa.  Otherwise, it is false,
// as shown in method below
	public static boolean exclusiveOr(boolean p, boolean q) {
		if (p == true && q == false) {
			return true;
		} else if (p == false && q == true) {
			return true;
		} else
			return false;
	}
//conditional can be thought of as "not p" or q.  So the only time it will have a false value
// is when p is true and q is false, as shown in the method below.
	public static boolean conditional(boolean p, boolean q) {
		if (p == true && q == false)
			return false;
		else
			return true;
	}
//biconditional is only false when p and q are not equal to each other.  As shown in method below.
	public static boolean biConditional(boolean p, boolean q) {
		if (p == true && q == false)
			return false;
		else if (p == false && q == true)
			return false;
		else
			return true;
	}
}