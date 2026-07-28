/* Given an integer array, move all 0s to the end while maintaining the relative order of non-zero elements.

Example 1:

Input:

[0, 1, 0, 3, 12]

Output:

[1, 3, 12, 0, 0]

Explanation:

The order of non-zero elements should stay the same. 
Zeroes will go to the end.

*/

import java.util.*;

public class MoveZeroes {
    public static int[] moveZeroes(int[] arr) {

        int zeroIndex = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[zeroIndex];
                arr[zeroIndex] = temp;

                zeroIndex++;
            }
            
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();

        int array[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int[] moveZeroesArr = moveZeroes(array);
        System.out.println(Arrays.toString(moveZeroesArr));
    }
}