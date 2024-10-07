class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        int majElem = nums[0];
        int count=0;
        for(int i=0;i<len;i++){
            if(majElem == nums[i]){
                count+=1;
            }else{
                count-=1;
                System.out.println("majELme" + count);
                if(count<0){
                    count+=1;
                    majElem = nums[i];
                    System.out.println("me" + majElem);
                }
            }
        }
        System.out.println("fwe" + majElem);
        return majElem;
    }
}