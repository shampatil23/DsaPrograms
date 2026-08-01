class Solution {

    int findmax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    long findtotal(int[] nums, int speed) {
        long total = 0;

        for (int num : nums) {
            total += ((long) num + speed - 1) / speed;
        }

        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = findmax(piles);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long total = findtotal(piles, mid);

            if (total <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}