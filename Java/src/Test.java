import Algorithms.QuickSort;
import General.FreqHashMap;
import General.Patterns;
import NeetCodePractice.AnagramCheck;
import NeetCodePractice.GroupAnagrams;
//import NeetCodePractice.TopKFrequentElements;
import NeetCodePractice.EditorialAnswers.TopKFrequentElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test{
    // Driver program to test above function
    public static void main(String[] args) {
//        System.out.println(new FreqHashMap().freqMap(new int[]{1,1,1,2,2,3})); ;
            System.out.println(Arrays.toString(new TopKFrequentElements().topKFrequent(new int[]{4,1,-1,2,-1,2,3},2)));
    }
}