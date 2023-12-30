package NeetCodePractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int postfix = 1;
        if (nums.length==1){
            result[0] = 0;
            return result;
        }
        if (nums.length==2){
            result[0] = nums[1];
            result[1] = nums[0];
            return result;
        }
        result[0] = 1;

        //Calculating Prefixes
        for (int i = 1 ; i < nums.length ; i++){
            result[i] = result[i-1] * nums[i-1];
        }

        //Calculating postfix and multiplying postfix with prefix values
        postfix = 1;
        for (int i = nums.length - 1 ; i >= 0 ; i--){
            result[i] = result[i] * postfix;
            postfix = postfix * nums[i];
        }
        return result;
    }
}
