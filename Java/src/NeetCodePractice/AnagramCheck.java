package NeetCodePractice;

import java.util.Arrays;

public class AnagramCheck {
    public boolean isAnagram(String s, String t) {
        // if(sort(s).equals(sort(t))){
        //     return true;
        // }
        // return false;

        int[] feqs = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            feqs[ch - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            feqs[ch - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (feqs[i] != 0) return false;
        }
        return true;
    }

    public String sort(String x){
        char[] chars = x.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
