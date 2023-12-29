package NeetCodePractice;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for ( int i = 1 ; i < nums.length ; i++){
            for (int j = i ; j < nums.length ; j++){
                if (nums[j]+nums[j-i] == target){
                    int[] result = new int[]{j,j-i};
                    return result;
                }
            }
        }
        return null;
    }
}
