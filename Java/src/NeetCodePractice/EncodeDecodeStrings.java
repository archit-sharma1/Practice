package NeetCodePractice;

import java.lang.reflect.Array;
import java.lang.reflect.GenericDeclaration;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

public class EncodeDecodeStrings {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // write your code here

        String encodedString = "";

        for (String string: strs) {
            if(strs.indexOf(string)!=strs.size()-1){
                encodedString = encodedString+Base64.getEncoder().encodeToString(string.getBytes(StandardCharsets.UTF_8))+";";
            }else{
                encodedString = encodedString+Base64.getEncoder().encodeToString(string.getBytes(StandardCharsets.UTF_8));
            }
        }
        return Base64.getEncoder().encodeToString(encodedString.getBytes(StandardCharsets.UTF_8));
    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        // write your code here

        byte[] bytes = Base64.getDecoder().decode(str);
        List<String> decodedString = new ArrayList<>();
        String[] encodedString = new String(bytes).split(";");
        for (String message: encodedString) {
            decodedString.add(new String(Base64.getDecoder().decode(message.strip())));
        }
        return decodedString;
    }
}
