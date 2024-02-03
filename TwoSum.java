package LeetcodeProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class TwoSum{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a array size: ");
        int n = scanner.nextInt();
        System.out.println("Enter array elements: ");
        int [] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        int[] output = twoSum(nums, target);
        if (output != null) {
            System.out.println("output: " + output[0] + " " + output[1]);
        }else{
            System.out.println("Not Possible");
        }
    }
    static int [] twoSum (int[] nums, int target){
        Map<Integer, Integer> numIndices = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int result = target - nums[i];

            if(numIndices.containsKey(result)){
                return new int[] {numIndices.get(result), i};
            }
            numIndices.put(nums[i], i);
        }
        return null;
    }
}