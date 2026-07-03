class Solution {
    public String interpret(String command) {
        StringBuilder finalOutput = new StringBuilder();
        for(int i = 0 ; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                finalOutput.append("G");
            }
            else if (command.charAt(i) == '(' && command.charAt(i+1) == ')')
            {
                finalOutput.append("o");
            }
            else if (command.charAt(i) == '(' && command.charAt(i+1)== 'a'){
                finalOutput.append("al");
            }
        }
        return finalOutput.toString();
    }
}