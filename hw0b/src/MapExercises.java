import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 1; i < 27; i++) {
            char currentLetter = (char) (96 + i);
            result.put(currentLetter, i);
        }
        return result;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int num: nums) result.put(num, (int) Math.pow(num, 2));
        return result;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String word: words) {
            int currentSum = result.get(word) == null ? 1 : result.get(word) + 1;
            result.put(word, currentSum);
        }
        return result;
    }
}
