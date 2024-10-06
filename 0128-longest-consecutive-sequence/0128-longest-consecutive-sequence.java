import java.util.HashSet;
import java.util.Set;
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> hset = new HashSet<>();
        for(int num:nums){
            hset.add(num);
        }
        int longStreak = 0;
        for(int num:hset){
            if(!hset.contains(num-1)){
                int currNum = num;
                int currStreak = 1;
                while(hset.contains(currNum+1)){
                    currNum++;
                    currStreak++;
                }
                longStreak=Math.max(currStreak,longStreak);
            }
        }
        return longStreak;
    }
}