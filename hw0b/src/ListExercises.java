import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int listSum = 0;
        if (!L.isEmpty()) for (int i: L) listSum += i;
        return listSum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> result = new ArrayList<>();
        for (int i: L) if (i % 2 == 0) result.add(i);
        return result;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> commonList = new ArrayList<>();

        HashMap<Integer, Integer> compareMap = new HashMap<>();
        List<Integer> longerL = L1.size() >= L2.size() ? L1 : L2;
        List<Integer> shorterL = L1.size() < L2.size() ? L1 : L2;

        for (int i: longerL) compareMap.put(i, i);
        for (int j: shorterL) if (compareMap.get(j) != null) commonList.add(j);

        return commonList;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int totalOccurences = 0;

        for (String word: words) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) totalOccurences++;
            }
        }
        return totalOccurences;
    }
}
