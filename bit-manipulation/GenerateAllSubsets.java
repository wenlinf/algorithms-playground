import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubsets {
    public static List<List<Character>> possibleSubsets(char[] charSet, int size) {
        List<List<Character>> subsets = new ArrayList<>();
        for (int i = 0; i < 1 << size; i++) {
            List<Character> sameSizeSubset = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                if ((i & (1 << j)) != 0) {
                    sameSizeSubset.add(charSet[j]);
                }
            }
            subsets.add(sameSizeSubset);
        }
        return subsets;
    }



    public static void main(String[] args) {
        System.out.println(possibleSubsets(new char[]{'a','b','c'}, 3));
    }

}
