class Solution {
    public String restoreString(String s, int[] indices) {
        
        char [] finalOutput = new char[s.length()];
        for(int i = 0 ; i < indices.length ; i++){
            finalOutput[indices[i]] = s.charAt(i);   
        }
        
        return new String(finalOutput);
        
    }
}