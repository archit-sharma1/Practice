package NeetCodePractice;

import java.util.*;

public class GroupAnagrams {
//    public List<List<String>> groupAnagrams(String[] str){
//        List<String> strList = List.of(str);
//        List<List<String>> result = new ArrayList<>(){};
//        List<String> innerResult = new ArrayList<>();
//
//        if( str.length == 1 ){
//            innerResult.add(str[0]);
//            result.add(innerResult);
//            return result;
//        }
//        Iterator itr = strList.iterator();
//        for (int i = 0 ; i < str.length; i++){
//            while (itr.hasNext()){
//                if (str[i] == itr.next()){
//                    itr.remove();
//                }
//                if (AnagramCheck.isAnagram(str[i], (String) itr.next())){
//                    innerResult.add(str[i]);
//                    innerResult.add((String) itr.next());
//                }
//            }
//            result.add(innerResult);
//        }
//
//
//        return result;
//    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
