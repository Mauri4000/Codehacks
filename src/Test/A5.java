package Test;

public class A5 {

	public static void main(String[] args) {
        int n = 46288; // Example number
        int p = 3;   // Starting power
        int result = findK(n, p);
        System.out.println("Result: " + result);
    }

    public static int findK(int n, int p) {
        String numStr = Integer.toString(n);
        int sum = 0;

        // Calculate the sum of digits raised to consecutive powers
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, p + i);
        }

        // Check if the sum is divisible by n
        if (sum % n == 0) {
            return sum / n;
        } else {
            return -1;
        }
    }																																																																																																																																																				

}
