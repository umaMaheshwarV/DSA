//Can improve the code by directly skipping the first and last index as everytime it willbe 0
//instead of checking the
class Solution {

    public int trap(int[] height) {
        int len = height.length;
        int left=0,right=len-1,leftMax=height[left],rightMax=height[right];
        int unit=0;
        while(left<right){
            leftMax = Math.max(leftMax,height[left]);
            rightMax = Math.max(rightMax,height[right]);
            if(height[left]>height[right]){
                unit+= rightMax-height[right];
                right--;
            }else{
                unit+= leftMax-height[left];
                left++;
            }
        }
        return unit;
}
}