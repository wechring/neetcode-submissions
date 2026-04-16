class PrefixTree {
    HashSet <String> hs;

    public PrefixTree() {
        hs = new HashSet<>();
    }

    public void insert(String word) {
        hs.add(word);
    }

    public boolean search(String word) {
        return hs.contains(word);
    }

    public boolean startsWith(String prefix) {
        for(String s: hs){
            if(prefix.length() <= s.length() && s.substring(0, prefix.length()).equals(prefix)){
                return true;
            }
        }
        return false;
    }
}
