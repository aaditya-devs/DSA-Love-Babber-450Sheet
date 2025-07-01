import java.util.*;

public class FindExtremes {
    public static int getLargest(int nums[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    public static int getSmallest(int nums[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
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
        System.out.println();
        System.out.println("The largest is " + getLargest(nums));
        System.out.println("The smallest is " + getSmallest(nums));
        sc.close();
    }
}
