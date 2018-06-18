class RnaTranscription {

    public char transcribeChar(char c){
        switch (c){
            case 'G':
                return  'C';
            case 'C':
                return  'G';
            case 'T':
                return  'A';
            case 'A':
                return  'U';
            default:
                return c;
        }
    }

    String transcribe(String dnaStrand) {

        dnaStrand.toUpperCase();

        char[] aux = dnaStrand.toCharArray();

        for (int i = 0; i < aux.length; i++){
            aux[i] = transcribeChar(aux[i]);
        }
        return String.valueOf(aux);
    }
}
