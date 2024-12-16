class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=m;
        for(int i=0 ; i<n; i++){
            nums1[a]=nums2[i];
            a++;
        }

        Arrays.sort(nums1);
    }
}