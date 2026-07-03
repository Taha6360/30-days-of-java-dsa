class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder finalop = new StringBuilder();
        char [] finalOutput = new char[s.length()];
        for(int i = 0 ; i < indices.length ; i++){
            finalOutput[indices[i]] = s.charAt(i);   
        }
        for(int i = 0 ; i< finalOutput.length ; i++){
            finalop.append(finalOutput[i]);
        }
        return finalop.toString();
        
    }
}