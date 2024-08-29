package Test;

public class A5 {

	public static void main(String[] args) {
        double expectedValue = calculateExpectedValue();
        System.out.printf("Expected number of times: %.6f%n", expectedValue);
    }

    public static double calculateExpectedValue() {
        // Initial state: 1 A1 sheet
        int[] initialState = {1, 0, 0, 0, 0}; // A1, A2, A3, A4, A5
        return calculateExpectedValue(initialState, 0);
    }

    public static double calculateExpectedValue(int[] state, int depth) {
        // If we have reached the 15th batch (excluding the first and last), return 0
        if (depth == 15) {
            return 0;
        }

        // Check if there's exactly one sheet in the envelope
        int sheetCount = 0;
        for (int count : state) {
            sheetCount += count;
        }
        double singleSheetProbability = (sheetCount == 1) ? 1.0 : 0.0;

        // Calculate the expected value for the next state
        double expectedValue = singleSheetProbability;
        for (int i = 0; i < 5; i++) {
            if (state[i] > 0) {
                int[] newState = state.clone();
                newState[i]--;
                for (int j = i + 1; j < 5; j++) {
                    newState[j]++;
                }
                expectedValue += (state[i] / (double) sheetCount) * calculateExpectedValue(newState, depth + 1);
            }
        }

        return expectedValue;
    }

}
