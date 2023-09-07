public class Recursive {

// this is a comment
    public static void printHello() {
        System.out.println("Hello");
        printHello();
    }
    
    public static int sum(int n) {
        if (n == 0)
            return 0;
        else { // n is not 1            
            int smallerSolution = sum(n-1);  
            return n  +smallerSolution;   
        }
    }


    public static int factorial(int n) {
        if (n == 1)
            return 1;
        else { // n is not 1
            System.out.println("n is " + n);
            int smallerSolution = factorial(n-1);
            System.out.println("smallerSolution: " + smallerSolution);

            return n * smallerSolution;   
        }
    }

    private static int [] array = {1,2,3,4,5,6,7,8,9,10};

    // add up all elements in the array from index 0 to index i
    private static int sumByHead(i-1) {  // adds up all index from 0 to i-1
        if (i == 0)
            return array[0];
        else {
            int subproblem = sumByHead (i - 1);
            return subproblem + array[i];

        }
    }
    
    private static int maxByHead(int i) {  // adds up all index from 0 to i-1
        if (i == 0)
            return array[0];
        else {
            int subproblem = maxByHead (i - 1);
            if (array [i] > subproblem)
                return array[i];

            else // subproblem > array [i]
                return subproblem;

        }
    }

    // add up all elements in the array
    public static int sum() {
        return sumByHead(array.length-1);

    }

    public static int fib(int n) {
        if ( n == 0 || n == 1)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }

    // prints numbers 0 ... n
    public static void head(int n) {
        if (n == 0)
            System.out.println(0);
        else {
            head(n-1);
            System.out.println(n);
        }
    }

    // prints numbers 0 ... n
    public static void tail(int n) {
        if (n == 0)
            System.out.println(0);
        else {
            System.out.println(n);
            tail(n-1);
            
        }
    }

    public static int max() {

        return maxByHead(array.length-1);

    }

    public static void main(String[] args) {
       System.out.println(max());
    }
}