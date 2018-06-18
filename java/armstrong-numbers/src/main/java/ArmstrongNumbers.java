public class ArmstrongNumbers {

	public boolean isArmstrongNumber(int numberToCheck) {
		int total = 0;

		// convert numberToCheck in Array character
		char[] aux = Integer.toString(numberToCheck).toCharArray();

		for (int i = 0; i < aux.length; i++){
			total += (Math.pow(Character.getNumericValue(aux[i]), aux.length));
		}
		return total == numberToCheck;
	}
}
