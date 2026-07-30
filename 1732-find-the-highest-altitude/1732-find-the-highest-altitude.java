class Solution {
    public int largestAltitude(int[] gain) {

        int largest = 0;

        for (int i = 1; i < gain.length; i++) {
            gain[i] = gain[i] + gain[i - 1]; // Add, don't subtract
        }

        for (int x : gain) {
            largest = Math.max(largest, x);
        }

        return largest;
    }
}