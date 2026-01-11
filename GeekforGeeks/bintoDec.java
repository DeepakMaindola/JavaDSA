class Solution {
    public int binaryToDecimal(String b) {

        int dec = 0;

        for(int i = 0; i < b.length(); i++) {
            dec = dec * 2 + (b.charAt(i) - '0');
        }

        return dec;
    }
}


//Problem name :Binary number to decimal number
//Problem Link : https://www.geeksforgeeks.org/problems/binary-number-to-decimal-number3525/1

