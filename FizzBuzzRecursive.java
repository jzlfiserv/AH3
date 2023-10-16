public class FizzBuzzRecursive {
    
    static void fizzBuzz (int n) {
        if (n == 0) {
            return;
        }
        fizzBuzz(n - 1);
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.print("FizzBuzz ");
        }
        else if (n % 3 == 0) {
            System.out.print("Fizz ");
        }
        else if (n % 5 == 0) {
            System.out.print("Buzz ");
        }
        else {
            System.out.print(n + " ");
        }
    }
}
