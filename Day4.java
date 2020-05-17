/*
Given a positive integer num, output its complement number. The complement strategy is to flip the bits of its binary representation.

 

Example 1:

Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:

Input: num = 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 

Constraints:

The given integer num is guaranteed to fit within the range of a 32-bit signed integer.
num >= 1
You could assume no leading zero bit in the integer’s binary representation.
*/

class Day4 {
    public int findComplement(int n) {
         int number_of_bits =  
               (int)(Math.floor(Math.log(n) / 
                             Math.log(2))) + 1; 
 
        return ((1 << number_of_bits) - 1) ^ n; 
        
    }
}
