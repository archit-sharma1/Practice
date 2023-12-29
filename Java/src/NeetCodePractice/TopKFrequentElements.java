package NeetCodePractice;

import General.FreqHashMap;

import java.util.*;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> eleFreq = new HashMap<>();

        for (int n : nums) {
            eleFreq.put(n, eleFreq.getOrDefault(n, 0) + 1);
        }

        System.out.println(eleFreq);

        int[] result = new int[k];
        int x = k;
        int maxValue = 1;
        int maxValueKey = nums[0];
        List<Integer> elementWithMaxCount = new ArrayList<>();
        for (Map.Entry<Integer, Integer> val : eleFreq.entrySet()) {
            if (maxValue < val.getValue()){
                maxValueKey = val.getKey();
                maxValue = val.getValue();
            }
            maxValue = maxValueKey-1;
//                System.out.println(maxValue);
            if (k > 0 ) {
                elementWithMaxCount.add(maxValueKey);
            }
            if (k > 0){
                result[x-k] = maxValueKey;
            }
            if (k > 0 ){

            }
            k--;
        }

        return elementWithMaxCount;
    }
}
