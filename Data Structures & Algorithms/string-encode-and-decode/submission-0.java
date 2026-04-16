class Solution {

    public String encode(List<String> strs) {
        String str = "";

        for(String s: strs){
            str += s.length() + "#" + s;
        }
        return str;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
int j = i;
        while (str.charAt(j) != '#') {
            j++;
        }

        // The characters between i and j are your length (e.g., "12" in "12#")
        int length = Integer.parseInt(str.substring(i, j));
        
        // The word starts at j + 1
        res.add(str.substring(j + 1, j + 1 + length));

        // Move 'i' to the beginning of the NEXT length segment
        i = j + 1 + length;
        }

        return res;
    }
    
}
