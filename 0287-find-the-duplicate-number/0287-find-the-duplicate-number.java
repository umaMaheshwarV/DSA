//Intial approach -> iterate the array thru two loops and if two elements are equal then returnt the value
//optimised --
//->To intialize a boolean array of length.
//-->Mark all the array elements to true, so that for a repetetive element it returns the duplicate element.
class Solution {
    public int findDuplicate(int[] nums) {
        int len=nums.length;
        int dup=0;
        boolean[] find = new boolean[len];
        for(int i : nums){
            if(find[i]) return i; 
            find[i] = true;
        }
        return -1;
    }
}