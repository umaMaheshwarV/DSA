//Find the pivot point->that is ascending order from right and the element which breaks the order will be pivot
//find the elements that are larger than the pivot element in the right side of the array and swap them
//reverse the array until the pivot 
//if no pivot is found then the order is in decending order from start,so reverse the entire array
class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        int len=nums.length;
        int min=len-1;
        //find pivot index
        for (int i=len-2;i>=0;i--){
            if(nums[i+1]>nums[i]) {
                pivot=i; 
                break;
            }
        }
        //if no pivot is found then array is sorted in descending order i.e it is the last possible permutation of a array
        if (pivot==-1) {
            reverse(nums,0,len-1);
            return;
        }
        //if pivot found,then swap with the min greatest number to the right of the pivot- successor
        //as it wil be in descending order break at first match
        for(int i=len-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums,pivot,i);
                break;
            }
        }
       // System.out.println("reverse calling");
        //reverse the array from the pivot to the right most end
        reverse(nums,pivot+1,len-1);
        //return nums;
    }
    //reverse method
    public void reverse(int[] arr,int left,int right){
        //System.out.println("reverse call");
        while(left<right){
            //System.out.println("reverse call in loop");
            swap(arr,left,right);
            left+=1;
            right-=1;
        }
    }
    public void swap(int[] arr,int left,int right){
        //System.out.println("reverse call in in loop after");
        int temprev= arr[right];
        arr[right] = arr[left];
        arr[left] = temprev;
    }
    
}