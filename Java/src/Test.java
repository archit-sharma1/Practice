import Algorithms.QuickSort;
import General.FreqHashMap;
import General.Patterns;
import NeetCodePractice.AnagramCheck;
import NeetCodePractice.EncodeDecodeStrings;
import NeetCodePractice.GroupAnagrams;
//import NeetCodePractice.TopKFrequentElements;
import NeetCodePractice.EditorialAnswers.TopKFrequentElements;
import NeetCodePractice.ProductExceptSelf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test{
    // Driver program to test above function
    public static void testTopKFrequentElements(){
        System.out.println(Arrays.toString(new TopKFrequentElements().topKFrequent(new int[]{4,1,-1,2,-1,2,3},2)));
    }

    public static void testProductExceptSelf(){
        System.out.println(Arrays.toString(new int[]{1,2,3,4}));
        System.out.println(Arrays.toString(new ProductExceptSelf().productExceptSelf(new int[]{1})));
    }

    public static void testEncodeDecodeStrings(){
        String encodedMessage = new EncodeDecodeStrings().encode(Arrays.asList("lint","code","love","you"));
        System.out.println(new EncodeDecodeStrings().decode(encodedMessage));
    }

    public static void testVideoSolutionEncodeDecodeStrings(){
        String encodedMessage = new NeetCodePractice.VideoSolution.EncodeDecodeStrings().encode(Arrays.asList("lint","code","love","you"));
        System.out.println(encodedMessage);
        System.out.println(new NeetCodePractice.VideoSolution.EncodeDecodeStrings().decode(encodedMessage));
    }

    public static void main(String[] args) {
//        String str = "4;lint4;code4;love3;you";
//        System.out.println(str.substring(0,1));
        testVideoSolutionEncodeDecodeStrings();
    }
}