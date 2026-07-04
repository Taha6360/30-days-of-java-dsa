class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int indexToCheck = 0;
        
        // Step 1: Figure out exactly which column index we need to inspect
        if (ruleKey.equals("type")) {
            indexToCheck = 0;
        } else if (ruleKey.equals("color")) {
            indexToCheck = 1;
        } else if (ruleKey.equals("name")) {
            indexToCheck = 2;
        }
        for (int i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);
            
            if (item.get(indexToCheck).equals(ruleValue)) {
                count++;
            }
        }
        
        return count;
    }
}