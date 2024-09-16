class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int left=0,right=len-1,leftMax=0,rightMax=0;
        int unit=0;
        while(left<=right){
            leftMax = Math.max(leftMax,height[left]);
            rightMax = Math.max(rightMax,height[right]);
            if(height[left]>height[right]){
                unit+= Math.min(leftMax,rightMax)-height[right];
                right--;
            }else{
                unit+= Math.min(leftMax,rightMax)-height[left];
                left++;
            }
        }
        return unit;
}
}