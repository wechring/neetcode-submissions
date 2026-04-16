class Solution {
    public String minWindow(String s, String t) {
        
        if(s.length() < t.length()){
            return "";
        } else if (s.equals(t)){
            return s;
        }

        HashMap <Character, Integer> t1 = new HashMap<>();
        int need = 0;
        for(Character c: t.toCharArray()){
            if(!t1.containsKey(c)){
                need++;
            }
            t1.put(c, t1.getOrDefault(c,0)+ 1);
        }


        int l = 0;
        int r = 0;
        int have = 0;
        int[] low = {0, Integer.MAX_VALUE};

        HashMap <Character, Integer> s2 = new HashMap<>();

        while(l <= r && r < s.length()){
            while(have < need && r < s.length()){
                char c = s.charAt(r);
                s2.put(c, s2.getOrDefault(c, 0) + 1);

                if(t1.containsKey(c) && s2.get(c).equals(t1.get(c))){
                    have++;
                }
                r++;
            }

            while(have == need){

            if(r - l < low[1] - low[0]){
                low[1] = r;
                low[0] = l;
            }
                char c = s.charAt(l);
                s2.put(c, s2.get(c) - 1);

                if(t1.containsKey(c) && s2.get(c) < t1.get(c)){
                    have--;
                }
                l++;
            }

        }

        if(low[1] == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(low[0], low[1]);
    }
}
