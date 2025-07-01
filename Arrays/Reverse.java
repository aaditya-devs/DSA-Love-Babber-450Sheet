// In this question we have to return the reversed array without using any extra space.
import java.util.*;
public class Reverse{

    public static void reverseArray(int nums[]) {
        for (int i = 0; i < nums.length/2; i++) {
            //Classic Swap  Function to be used
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("The Input Array is...");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("The Reversed Array is...");
        //In Java, arrays are objects, and when they are passed to a method, their reference (memory address) is passed by value. This means the method receives a copy of the reference, and both the caller and callee refer to the same array in memory. Hence, modifications made to the array inside the method affect the original array. 
        reverseArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();

    }
}