class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int larger=0;
        HashMap<Character, Integer> map = new HashMap<>();
        if (s == "") {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))){
               map.put(s.charAt(i),i);
               count++;
            }
            else{
                int value= map.get(s.charAt(i));
                i=value;
                map.clear();
                if(larger<count){
                    larger=count;
                }
                count=0;
            }

        }
        if(larger<count){
            larger=count;
        }
        return larger;
  
    }
}

class Assesment1{

public static void main (String[] args) {
    Solution s = new Solution();
    String a = "abcabcbb"; //give any string
    System.out.println(s.lengthOfLongestSubstring(a));
    
}
}
