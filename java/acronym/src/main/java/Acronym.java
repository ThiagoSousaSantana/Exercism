import java.util.Arrays;
import java.util.List;

class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase.toUpperCase();
    }

    String get() {
        String acronym = "";
        List<String> splitString = Arrays.asList(this.phrase.split(" |-"));

        for (String s: splitString) acronym += s.substring(0, 1);
        return acronym;
    }
}