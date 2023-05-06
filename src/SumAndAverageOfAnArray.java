public class SumAndAverageOfAnArray {
    public static void main(String[] args) {
        // Declares an integer variable called "sum"
        // and initialises it with the value of 0
        int sum = 0;
        // Declares and initiates an array of integers
        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        // loop for adding all the elements in the array
        for (int i = 0; i < numbers.length; i++) {
            // the value of each element is added to the sum variable
            sum += numbers[i];
        }
        // The sum is displayed on the console
        System.out.println("The sum of the numbers in the array is: " + sum);
        // Declares a decimal variable called average and initiates
        // it with/as the quotient of the sum divided by the length of
        // the array (the total number of elements in the array).
        // (double) is a cast operator: it converts what follows to a double
        // type of value
        double average = (double) sum/numbers.length;
        // The average is displayed on the console
        System.out.println("The average of the numbers in the array is: " + average);
    }
}
