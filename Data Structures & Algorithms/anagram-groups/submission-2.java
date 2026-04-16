class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap,List<String>> h = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for(String p : strs){

            HashMap<Character, Integer> h1 = new HashMap<>();

            for(char c : p.toCharArray()){
                h1.put(c, h1.getOrDefault(c, 0) + 1);

            }

            if (!h.containsKey(h1)) {
                h.put(h1, new ArrayList<>());
            }
            h.get(h1).add(p);

        }

    return new ArrayList<>(h.values());
    }
}
