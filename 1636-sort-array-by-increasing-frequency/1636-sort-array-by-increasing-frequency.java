class Solution {
    public int[] frequencySort(int[] nums) {

        int n = nums.length;
        int[] frequency = new int[n];

        // Store frequency of each element
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                }
            }
            frequency[i] = cnt;
        }

        // Sort according to frequency
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (frequency[i] > frequency[j] ||
                   (frequency[i] == frequency[j] && nums[i] < nums[j])) {

                    // Swap frequencies
                    int temp = frequency[i];
                    frequency[i] = frequency[j];
                    frequency[j] = temp;

                    // Swap corresponding numbers
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}