class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        for(int num:nums){
            hset.add(num);
        }
        int longStreak = 0;
        for(int num:nums){
            if(!hset.contains(num-1)){
                int currNum = num;
                int currStreak = 1;
                while(hset.contains(currNum+1)){
                    currNum=currNum+1;
                    currStreak+=1;
                }
                longStreak=Math.max(currStreak,longStreak);
            }
        }
        return longStreak;
    }
}