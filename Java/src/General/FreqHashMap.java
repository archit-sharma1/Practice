package General;

import java.util.HashMap;

public class FreqHashMap {
    public HashMap<Integer, Integer> freqMap (int[] nums){

        HashMap<Integer, Integer> eleFreq = new HashMap<>();

        for (int n : nums) {
            eleFreq.put(n, eleFreq.getOrDefault(n, 0) + 1);
        }
//        int count = 1;
//        for (int num : nums){
//            if(eleFreq.containsKey(num)) {
//                count++;
//                eleFreq.put(num, count);
//                continue;
//            }
//            if (!eleFreq.containsKey(num)){
//                count = 1;
//                eleFreq.put(num, count);
//            }
//        }
        return eleFreq;
    }
}
