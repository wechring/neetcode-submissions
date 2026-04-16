class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        int temp1;
        int temp2;
        int sum = 0;

        for(String p : operations){
            if(p.equals("+")){
                temp1 = s.pop();
                sum -= temp1;
                temp2 = s.peek();
                sum += s.push(temp1);
                sum += s.push(temp1 + temp2);
            } else if(p.equals("D")){   
                temp1 = s.peek();
                sum += s.push(temp1*2);
            } else if(p.equals("C")) {
                sum -= s.pop();
            } else{
                sum += s.push(Integer.valueOf(p));
            }
        }

        return sum;
    }
}