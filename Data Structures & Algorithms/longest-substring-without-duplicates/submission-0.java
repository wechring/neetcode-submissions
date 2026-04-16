class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2){
            return s.length();
        }

        int l = 0;
        int r = 0;
        int max = 0;
        HashSet<Character> h = new HashSet<>();

        while(r < s.length()){
            int cur = 0;

            while(h.contains(s.charAt(r))){
                h.remove(s.charAt(l));
                l++;
            }

            h.add(s.charAt(r));
            r++;

            if(r-l > max){
                max = r-l;
            }
        }
        return max;
    }
}
