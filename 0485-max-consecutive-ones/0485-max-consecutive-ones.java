class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]==1){
                count+=1;
            }else{
                count=0;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}