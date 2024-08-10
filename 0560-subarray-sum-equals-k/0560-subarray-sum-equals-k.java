//- sliding window tech can be applied only for positicve numbers or negative numbers
// Using hashmap we calculate both sum and diff until that point
// If diff key as map in the hashMap that means -- it either considering the value from the entire array or initial cond that
//    if diff is 0 then it is considered as expected
// Map the sum value in the map and the corresponding key value increments the occurence
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,1);
        int count =0;
        int sum=0;
        for(int num:nums){
            sum+=num;
            int diff=sum-k;
            if(hmap.containsKey(diff)){
                count+= hmap.get(diff);
            }
            hmap.put(sum,hmap.getOrDefault(sum,0)+1);
        }
        return count;

        }
}