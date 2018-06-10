public class PangramChecker {
    private String alfabet = "abcdefghijklmnopqrstuvwxyz";

    public boolean isPangram(String input) {
        int isPangran = 0;


        input = input.toLowerCase();
        input = input.replaceAll(" ", "");

        char[] inputChar = input.toCharArray();

        for (int i = 0; i < inputChar.length; i++){
            isPangran += verifyChar(inputChar[i]);
        }

        return  isPangran == 26;
    }


    public int verifyChar(char letter){

        int posditionExist = this.alfabet.indexOf(letter);

        if (posditionExist > -1){
            this.alfabet = this.alfabet.replace(letter,' ');
            return 1;
        }
        return 0;
    }

}
