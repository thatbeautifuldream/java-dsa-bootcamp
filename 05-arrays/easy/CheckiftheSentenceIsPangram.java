// Problem Link : https://leetcode.com/problems/check-if-a-string-is-a-pangram/
package Arrays.Easy;

public class CheckiftheSentenceIsPangram {
    public boolean checkIfPangram(String str) {
        boolean[] mark = new boolean[26];
 
        // For indexing in mark[]
        int index = 0;
 
        // Traverse all characters
        for (int i = 0; i < str.length(); i++) {
            // If uppercase character, subtract 'A'
            // to find index.
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';
 
            // If lowercase character, subtract 'a'
            // to find index.
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
 
                index = str.charAt(i) - 'a';
 
            // If this character is other than english
            // lowercase and uppercase characters.
            else
                continue;
            mark[index] = true;
        }
 
        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);
 
        // If all characters were present
        return (true);
    }
}
