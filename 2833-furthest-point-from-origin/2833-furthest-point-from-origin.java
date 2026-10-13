class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int position = 0;
        int blanks = 0;

        for (char move : moves.toCharArray()) {
            if (move == 'L') {
                position--;
            } else if (move == 'R') {
                position++;
            } else {
                blanks++;
            }
        }

        return Math.abs(position) + blanks;
    }
}