import java.util.HashSet;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        HashSet<String> chars = new HashSet<>();

        phrase = phrase.toUpperCase().replace(" ", "").replace("-","");

        for (char c : phrase.toCharArray())
            chars.add(String.valueOf(c));
        return chars.size() == phrase.length();
    }

}
