//To find the max subarray we use Kadane algo
//1.It will consider primarily on two variables -- maxsofar and maxcurrent  
//Maxcurrent - Compares the current element with sum till ith element
//Maxsofar - compares the maxcurrent with the previous maxsofar
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSofar = nums[0];
        int maxCurr = 0;
        for(int i: nums){
            maxCurr = Math.max(i,maxCurr+i);
            maxSofar = Math.max(maxSofar,maxCurr);
        }
        return maxSofar;
    }
}