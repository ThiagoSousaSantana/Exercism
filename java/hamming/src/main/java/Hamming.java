class Hamming {
    private String leftStrand;
    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

        if(leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {
        char[] aux1 = this.leftStrand.toCharArray();
        char[] aux2 = this.rightStrand.toCharArray();
        int distance = 0;

        for (int i = 0; i < aux1.length; i++ ){
            if (aux1[i] != aux2[i]){
                distance++;
            }
        }
        return distance;
    }



}
