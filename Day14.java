class Solution {
    public String stringShift(String s, int[][] shift) {

        int side = 0;
        for(int []move:shift)
        {
            if(move[0]==0) side-=move[1];
            else side+=move[1];
        }
        side = side % s.length();
        if(side < 0)
        {
            String ans = s.substring(Math.abs(side)) + s.substring(0,Math.abs(side));
            return ans;
        }
        else if(side>0)
        {
            String ans = s.substring(s.length()-Math.abs(side)) + s.substring(0,s.length()-Math.abs(side));
            return ans;
        }
        else
        {
            return s;
        }
    }
}
