class Solution {
    public int[][] merge(int[][] arr) {
          int length = arr.length;

        // Step 1: Sort intervals based on start times
        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        // Step 2: Use the same array to store merged intervals
        int index = 0; // To keep track of position in merged array

        for (int i = 1; i < length; i++) {
            if (arr[index][1] >= arr[i][0]) {
                // Overlapping intervals: merge
                arr[index][1] = Math.max(arr[index][1], arr[i][1]);
            } else {
                // Non-overlapping interval: move to the next position
                index++;
                arr[index] = arr[i];
            }
        }

        // Step 3: Create result array with only the merged intervals
        int[][] result = new int[index + 1][2];
        for (int i = 0; i <= index; i++) {
            result[i] = arr[i];
        }

        return result;
        }}






