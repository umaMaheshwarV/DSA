class Solution {
    public int findDuplicate(int[] nums) {
        int len=nums.length;
        int dup=0;
        boolean[] find = new boolean[len];
        for(int i=0;i<len;i++){
            if(!find[nums[i]]){
                find[nums[i]] = true;
            }else{
                dup = nums[i];
            }
        }
        return dup;
    }
}