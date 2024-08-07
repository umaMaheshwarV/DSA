class Solution {
    public int[] rearrangeArray(int[] nums) {
        //Divide all integers into two arrays and write into a whole at end
        int len = nums.length;
        int[] ans = new int[len];
        int pos =0;
        int neg =1;
        for(int i=0;i<len;i++){
            if(nums[i]>0){
                //pos+=2;
                ans[pos]=nums[i];
                pos+=2;
            }else{
                //neg+=2;
                ans[neg]=nums[i];
                neg+=2;
            }
        }
    return ans;      
    }
}
