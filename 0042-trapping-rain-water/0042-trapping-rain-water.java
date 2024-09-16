class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int left=0,right=len-1,leftMax=height[left],rightMax=height[right];
        int unit=0;
        while(left<right){
            if(leftMax>rightMax){
                right--;
                rightMax = Math.max(rightMax,height[right]);
                unit+= rightMax-height[right];
            }else{
                left++;
                leftMax = Math.max(leftMax,height[left]);
                unit+= leftMax-height[left];
            }
        }
        return unit;
}
}