public class MultidimensionalArrays {
    public static void main(String[] args) {
        // Declares a multidimensional integer array called "myNumbers" and
        //  assigns (initiates) to it 2 arrays (e.g. {1, 2, 3, 4}, etc.)
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        // Declares a n integer variable called "x" and
        // assigns it the value of the third element of the second array (7)
        int x = myNumbers[1][2];
        // Displays variable x on the console
        System.out.println(x);
    }
}
