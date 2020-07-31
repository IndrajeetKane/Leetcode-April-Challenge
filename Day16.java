class Solution {
    public boolean checkValidString(String s) {
        int count = 0;
        int count1 = 0;
        for(char ch: s.toCharArray())
        {
            if(ch=='(')
            {
                count++;
                count1++;
            }
            else if(ch==')')
            {
                count--;
                count1--;
            }
            else
            {
                count--;
                count1++;
            }

            if(count1 < 0)
            {
                return false;
            }
            if(count < 0) count = 0;
        }

        if(count == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
