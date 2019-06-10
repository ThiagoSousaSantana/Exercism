import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    private final String string;

    public Anagram(String string) {
        this.string = string.toUpperCase();
    }

    public List<String> match(List<String> asList) {
        List<String> answer = new ArrayList<>();
        char[] chars = toSortedCharArray(this.string);
        for (String s : asList) {
            char[] charsAnagram = toSortedCharArray(s);
            if (Arrays.compare(charsAnagram, chars) == 0 &&
                    !this.string.equals(s.toUpperCase()))
                answer.add(s);
        }
        return answer;
    }

    private char[] toSortedCharArray(String string) {
        char[] charList = string.toUpperCase().toCharArray();
        Arrays.sort(charList);
        return charList;
    }
}
