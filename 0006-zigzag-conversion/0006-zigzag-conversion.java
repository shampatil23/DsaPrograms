class Solution {
    public String convert(String s, int numRows) {

        // If there is only one row, no zigzag is possible
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Create a StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        int direction = 1; // 1 = moving down, -1 = moving up

        // Traverse every character
        for (char c : s.toCharArray()) {

            // Add character to the current row
            rows[currentRow].append(c);

            // Change direction at the top and bottom
            if (currentRow == 0) {
                direction = 1;
            } else if (currentRow == numRows - 1) {
                direction = -1;
            }

            // Move to next row
            currentRow += direction;
        }

        // Combine all rows
        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}