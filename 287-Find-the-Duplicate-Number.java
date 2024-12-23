class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int length= nums.length;
        int index=0;

        for(int i =1; i<length; i++){
            if(nums[i]==nums[i-1]){
                index =i;
                break;

            }
        }

        return nums[index];
    }
}