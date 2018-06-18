class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String acronym = "";
        String[] splitString = this.phrase.split(" |-");

        for (String s: splitString) {
            acronym += s.substring(0,1).toUpperCase();
        }
        return acronym;
    }
}