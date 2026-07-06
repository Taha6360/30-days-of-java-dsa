class Solution {
    public int subtractProductAndSum(int n) {
        int sumOfDigits = 0 ;
        int productOfDigits = 1 ;
        while (n > 0){
            int currentNum = n%10;
            sumOfDigits += currentNum;
            productOfDigits *= currentNum;
            n = n/10 ;
        }
        return productOfDigits - sumOfDigits;
        
    }
}