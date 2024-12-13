class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();

        // Edge case: If needle is empty, return 0
        if (l2 == 0) {
            return 0;
        }

        // Ensure haystack has enough length to contain needle
        if (l1 < l2) {
            return -1;
        }

        // Iterate through haystack
        for (int i = 0; i <= l1 - l2; i++) {
            // Check if the substring of haystack matches needle
            if (haystack.substring(i, i + l2).equals(needle)) {
                return i; // Found match
            }
        }

        // If no match is found
        return -1;
    }
}
