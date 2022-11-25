public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length ==0) return "";
        String prefix = strs[0];
        for (int i=1; i<strs.length; i++){
            while (strs[i].indexOf(prefix) !=0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}

/*Dacoda's Explanation:
 In an array of words, find the common longest prefix. Example => {"Flower", "Flow", "Flight"}.  If the array's length was zero, meaning that it had no characters, 
 return an empty string. The array is named strs.  The first word in the strs array
 is prefix; which is at the 0 index. Now we will loop through the rest of the array
 starting from index 1. While we loop through the words in the strs array in the 
 prefix word at index 0 does not match the looped word, then remove the last letter 
 from prefix. Loop again, see if they match if no, remove another letter from the end
 of prefix. Continue until prefix matches word in array. Then move to next word.
 Return prefix.

 */
