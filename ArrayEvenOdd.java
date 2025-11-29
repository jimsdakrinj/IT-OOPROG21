class ArrayEvenOdd {
    public static void main(String[] args) {


        int[] nums = {3, 10, 7, 8, 2, 11, 6};

        int evenCount = 0;
        int oddCount = 0;

        // Count even and odd
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
