package NeetCodePractice.VideoSolution;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class EncodeDecodeStrings {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // write your code here

        /* encode the string to
           length of string + delimiter + string
         */
        String encodedStirng = "";
        for (String string: strs) {
            encodedStirng += string.length()+";"+string;
        }
        return encodedStirng;
    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        // write your code here
        List<String> decodedString = new ArrayList<>();
        int i = 0 ;
        int j = 0;
        int stringLength = 0 ;
        while (i < str.length()){
            j = i;
            while (!str.subSequence(j,j+1).equals(";")){
                j++;
            }
            stringLength = Integer.valueOf(str.substring(i,j));
            decodedString.add(str.substring(j+1, j+1+stringLength));
            i = j + 1 + stringLength;
        }
        return decodedString;
    }
}
