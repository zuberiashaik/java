package pack1;

public class PerfectSquare {

    public static void main(String[] args) {
        int num = 49;
        boolean isPerfectSquare = false;
        
        // Check if num is a perfect square
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break; // No need to continue once we found the perfect square
            }
        }

        // Output result
        if (isPerfectSquare) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }
}
