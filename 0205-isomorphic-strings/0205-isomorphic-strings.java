class Solution {
    public boolean isIsomorphic(String s, String t) {
        //If lenght are not equal strings cant be isomorphic
        if(s.length() != t.length()) return false;
        //Two hashmap because two key characters cant have same value pair
        HashMap<Character, Character> hms = new HashMap<>();
        HashMap<Character, Character> hmt = new HashMap<>();
        //int count =0 ;

        for(int i=0;i<s.length();i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(hms.containsKey(cs)){
                //if the second occurence doesnt map with the same character then it cant be isomorphci
                if(hms.get(cs)!=ct) return false;
            }else{
                hms.put(cs,ct);
            }
            if(hmt.containsKey(ct)){
                //if the second occurence doesnt map with the same character then it cant be isomorphci
                if(hmt.get(ct)!=cs) return false;
            }else{
                hmt.put(ct,cs);
            }
        }
        return true;
        
    }
}