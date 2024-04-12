package solution;
import java.util.Arrays;
import java.util.Scanner;
/*Programmed by Adriel
  Project finished: 11/4/2024
  Program scope: Sum two arrays and return index
/* 
public class Solution {

  
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int target;
  
       System.out.println("Enter array length: ");
       int length = Keyboard.nextInt();
       int [] nums = new int [length];
       
       for(int i = 0; i < length; i++ ){
            nums[i] = Keyboard.nextInt();
       }
       System.out.print("What is your target number ?  ");
       target = Keyboard.nextInt();
       
       System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
       int [] solution = findsum(nums, target);
       System.out.print("Output: [" + solution[0] + ", " + solution[1] + "]");
    }
    
    public static int [] findsum(int[] x, int y) {
        for (int i = 0; i < x.length; i++) {
            for(int j = i+1; j < x.length; j++) {
                if (x[i] + x[j] == y) {
                    x[0] = i;
                    x[1] = j;
                    return x;
                }
            }
        }
        return x;
    }
    
}


/* ******************* OutPut *********************
Test Case 1:
Enter array length: 
4
2
7
11
15
What is your target number ?  9
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]

Test Case 2:
Enter array length: 
3
3
2
4
What is your target number ?  6
Input: nums = [3, 2, 4], target = 6
Output: [1, 2]

Test Case 3: 
Enter array length: 
2
3
3
What is your target number ?  6
Input: nums = [3, 3], target = 6
Output: [0, 1]

*/
