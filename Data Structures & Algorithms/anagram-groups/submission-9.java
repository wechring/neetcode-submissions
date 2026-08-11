class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        HashMap<String, ArrayList<String>> h = new HashMap<>();

        for(String s : strs){

            char[] cha = new char[26];

            for(Character c : s.toCharArray()){
                cha[c - 'a'] += 1;
            }

            String str = new String(cha);

            if(!h.containsKey(str)){
                h.put(str,  new ArrayList<>());
            }
            h.get(str).add(s);

            }

        return new ArrayList<>(h.values());
        }
 }

