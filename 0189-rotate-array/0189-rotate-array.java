class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
            k%=len;
        arrrev(len-k,len-1,nums);
        arrrev(0,len-k-1,nums);
        arrrev(0,len-1,nums);
    }
    public void arrrev(int first,int last,int[] nums){
        //System.out.println("first"+first+"last"+last);
        while(first<last){
            int temp = nums[first];
            nums[first]=nums[last];
            nums[last]=temp;
            last--;
            first++;
        }
    }
}