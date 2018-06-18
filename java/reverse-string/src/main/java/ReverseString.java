class ReverseString {

    String reverse(String inputString) {
        String newString="";

        char[] arrayString = inputString.toCharArray();

        for (int i = arrayString.length -1; i >=0; i--){
            newString += arrayString[i];
        }
        return newString;
    }
}