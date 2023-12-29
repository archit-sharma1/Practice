package Algorithms;

public class SortStrings {

    static final int MAX_CHAR = 26;

    static void sortString(String str) {

        // Hash array to keep count of characters.
        int letters[] = new int[MAX_CHAR];


        // Traverse string and increment
        // count of characters
        for (char x : str.toCharArray()) {

            // 'a'-'a' will be 0, 'b'-'a' will be 1,
            // so for location of character in count
            // array we will do str[i]-'a'.
            // assining the numnber of occurence of the letter according to their place in alphabetical numbering
            // if "a" is 4 times in a string then the letters[0] will have 4
            // if "b" is 2 times in a string then the letters[1] will have 2
            letters[x - 'a']++;
        }
        char[] chars = null;
        // Traverse the hash array and print
        // characters
        for (int i = 0; i < MAX_CHAR; i++) {
            for (int j = 0; j < letters[i]; j++) {
                System.out.print((char) (i + 'a'));
            }
        }
    }
}
