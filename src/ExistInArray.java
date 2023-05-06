import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        // Declaration and initialisation of an
        // array with integers as elements
        int[] myArray = {1, 2, 8, 13, 19, 25};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer to look for: ");
        // The next line makes it explicit that the system will expect
        // an integer (nextInt) so there is no need for the use of parse
        int number = input.nextInt();
        // Declaring an auxiliary boolean variable called "integerFound";
        // Assign it as false (i.e. that the number the user inputs is
        // not found in the pre-made array
        boolean integerFound = false;
        // A for loop that goes through all the elements of the array
        for (int i = 0; i < myArray.length; i++) {
            // Conditional: if the particular element in the array
            // matches user's input then change integerFound variable
            // to true
            if (myArray[i] == number) {
                integerFound = true;
            }
            // if the particular element in not in the array
            // keep on 'looping'
        }
        // Another conditional: if the value of the integerFound
        // variable after the loop is completed is true then display
        //  the message that the number was found
        if ( integerFound == true ) {
            System.out.println("Value " + number + " found in array");
        } // otherwise display the message that the number was not found
        else {
            System.out.println("Value was not found in array");
        }
    }
}
