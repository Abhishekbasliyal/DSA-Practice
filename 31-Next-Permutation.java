class Solution {
    public void nextPermutation(int[] nums) {
       int length = nums.length;
       int index=-1;
       int temp=0;
        int j= length-1;

       for(int i=length-2 ; i>=0 ; i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
       }

       if(index==-1){
        for(int i=0 ; i<length/2; i++){
        temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

        j--;
       }

       for(int i=0 ; i<length; i++){
        System.out.print(nums[i]);
       }
        return;
       }

       for(int i=length-1; i>0; i--){
        if(nums[index]<nums[i]){
            temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
            break;
        }
       }
        

       for(int i=index+1 ; i<j; i++){
        temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

        j--;
       }

       for(int i=0 ; i<length; i++){
        System.out.print(nums[i]);
       }
    }
}