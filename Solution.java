class Solution {
    public boolean areNumbersAscending(String s) {
        String[] strs = s.split(" ");
        int prev = -1;
        for(int i = 0; i < strs.length; i++){
            char c = strs[i].charAt(0);
            if(c >= '0' && c <= '9'){
                int x = Integer.parseInt(strs[i]);
                if(x <= prev){
                    return false;
                }

                prev = x;
            }
        }

        return true;
    }
}
