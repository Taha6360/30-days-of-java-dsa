class Solution {
    public void reverseString(char[] s) {
        int first  = 0 ;
        int back = s.length - 1 ;
        while(first < back ){
            char temp = s[first];
            s[first] = s[back];
            s[back] = temp;
            first++;
            back--;
        }
        
    }
}