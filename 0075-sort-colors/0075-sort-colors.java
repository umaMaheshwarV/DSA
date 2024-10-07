class Solution {
    public void sortColors(int[] nums) {
        int count1=0,count2=0,count0=0;
        int len=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0+=1;
            }else if(nums[i]==1){
                count1+=1;
            }else{
                count2+=1;
            }
        }
        int j=0;
        if(count0>0||count1>0||count2>0){
            while(count0>0&&j<len){
                nums[j]=0;
                j++;
                count0--;
            }
            while(count1>0&&j<len){
                nums[j]=1;
                j++;
                count1--;
            }
            while(count2>0&&j<len){
                nums[j]=2;
                j++;
                count2--;
            }
        }
    }
}