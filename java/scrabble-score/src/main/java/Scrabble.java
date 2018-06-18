/*
*   Letter                           Value
*   A, E, I, O, U, L, N, R, S, T       1
*   D, G                               2
*   B, C, M, P                         3
*   F, H, V, W, Y                      4
*   K                                  5
*   J, X                               8
*   Q, Z                               10
* */

class Scrabble {
    private String word;

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        char[] arrayWord = this.word.toCharArray();
        int score = 0;


        for ( Character letter : arrayWord) {
            score += getValueLetter(letter);
        }
        return score;
    }


    int getValueLetter(char letter){
        switch (letter){
            case 'G':
            case 'D': return 2;

            case 'B':
            case 'C':
            case 'M':
            case 'P': return 3;

            case 'F':
            case 'H':
            case 'V':
            case 'W':
            case 'Y': return 4;

            case 'K': return 5;

            case 'J':
            case 'X': return 8;

            case 'Q':
            case 'Z': return 10;

            default: return 1;
        }
    }
}
