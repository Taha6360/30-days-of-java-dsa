class Solution {
    public String defangIPaddr(String address) {
        StringBuilder NewString = new StringBuilder();
        for (int i = 0 ; i< address.length();i++){
            char current = address.charAt(i);
            if (current  != '.'){
                NewString.append(current);
            }
            else{
                NewString.append("[.]");
            }
        
    }
    return NewString.toString();
    }
}
