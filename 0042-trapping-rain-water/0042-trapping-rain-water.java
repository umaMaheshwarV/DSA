class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] leftArray = new int[len];
        int[] rightArray =new int[len];
        int i=0;
        int max=0;
        while(i<len-1){
            if(height[i]>max){
                max = height[i];
                leftArray[i] = max;
            }else{
                leftArray[i] = max;
            }
            i++;
        }
        i = len-1;
        max=0;
        while(i>=0){
            if(height[i]>max){
                max = height[i];
                rightArray[i] = max;
            }else{
                rightArray[i] = max;
            }
            i--;
        }
        int unit =0 ;
        for(int j=0;j<len-1;j++){
            unit += Math.min(leftArray[j],rightArray[j])-height[j];
        }
        return unit;
    }
}