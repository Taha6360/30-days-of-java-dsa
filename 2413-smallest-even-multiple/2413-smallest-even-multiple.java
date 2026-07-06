class Solution {
    public int smallestEvenMultiple(int n) {
        int greaterNum = 0; 
        int lowerNum = 0;
        
        if(n >= 2){
            greaterNum = n ;
            lowerNum = 2;

        }
        else{
            greaterNum = 2;
            lowerNum = n;
        }
        int multiple = greaterNum ;
        for (int i  = 1 ; i< greaterNum ; i++){
            multiple *= i;
            if( multiple % lowerNum == 0 ){
                break;
            }
        }
    return multiple;
    }
}