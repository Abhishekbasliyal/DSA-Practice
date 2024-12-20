class Solution {
    public int maxSubArray(int[] nums) {
     int maximum = Integer.MIN_VALUE;
     int sum=0;
     int length = nums.length;

     for(int i=0; i<length; i++ ){
            sum=sum+nums[i];

            if(sum>maximum){
                maximum=sum;
            }

            if(sum<0){
                sum=0;
            }
     }
     
     return maximum;
}
}