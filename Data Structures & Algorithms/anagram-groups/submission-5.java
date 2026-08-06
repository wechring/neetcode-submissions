class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        HashMap<HashMap<Character, Integer>, List<String>> h = new HashMap<>();
        for(String s : strs){
            HashMap<Character, Integer> hp = new HashMap<>();
            for(Character c : s.toCharArray()){
                hp.put(c, hp.getOrDefault(c,0) + 1);
            }

            if(h.containsKey(hp)){
                
                h.get(hp).add(s);
            } else{
            List<String> l = new ArrayList<>();
            l.add(s);
            h.put(hp, l);
            }
        }
    
        return new ArrayList<>(h.values());
    }
}
