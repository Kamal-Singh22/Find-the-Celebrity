public class FindCelebrity {
    // Dummy implementation of the knows API
    static boolean knows(int a, int b) {
        // This is just a placeholder. Replace with the actual implementation.
        return true;
    }

    public static int findCelebrity(int n) {
        // Step 1: Find a potential celebrity
        int celebrity = 0;
        for (int i = 1; i < n; i++) {
            if (knows(celebrity, i)) {
                celebrity = i;
            }
        }

        // Step 2: Verify the potential celebrity
        for (int i = 0; i < n; i++) {
            if (i != celebrity && (knows(celebrity, i) || !knows(i, celebrity))) {
                return -1;
            }
        }

        return celebrity;
    }

    public static void main(String[] args) {
        int n = 3;

        // Find the celebrity
        int result = findCelebrity(n);

        if (result != -1) {
            System.out.println("Celebrity is person " + result);
        } else {
            System.out.println("No celebrity found");
        }
    }
}
