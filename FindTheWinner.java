package methods;

public class FindTheWinner {

	public static String winner(int[] andrea, int[] maria, String s) {

		String winner = null;
		int aCount = 0;
		int mCount = 0;
		for (int i = 0; i < maria.length; i++) {
			if (s.equalsIgnoreCase("Even") && i % 2 == 0) {
				aCount = andrea[i] - maria[i] + aCount;
				mCount = maria[i] - andrea[i] + mCount;
			} else if (s.equalsIgnoreCase("Odd") && i % 2 == 1) {
				aCount = andrea[i] - maria[i] + aCount;
				mCount = maria[i] - andrea[i] + mCount;
			}

		}

		if (aCount > mCount) {
			winner = "Andrea";
		} else if (mCount > aCount) {
			winner = "Maria";
		} else {
			winner = "Tie";
		}

		return winner;

	}

}
