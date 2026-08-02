class Solution {

    boolean possible(int[] bloomDay, int mid, int m, int k) {

        int b = 0;
        int c = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= mid) {
                c++;
            } else {
                b += c / k;
                c = 0;
            }
        }

        b += c / k;

        return b >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        long val = (long) m * k;

        if (val > bloomDay.length)
            return -1;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }

        while (mini <= maxi) {

            int mid = mini + (maxi - mini) / 2;

            if (possible(bloomDay, mid, m, k)) {
                maxi = mid - 1;
            } else {
                mini = mid + 1;
            }
        }

        return mini;
    }
}