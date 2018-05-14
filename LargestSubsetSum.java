package methods;

public class LargestSubsetSum {

	public static int[] maxSubsetSum(int[] k) {
		int[] returnArray = new int[k.length];

		for (int i=0; i < k.length; i++) {
			int sum = 0;
			int lim = (int) Math.sqrt(k[i]);

			for (int j = 1; j <= lim; j++) {
				if (k[i] % j == 0) {
					if (j == (k[i] / j))
						sum += j;
					else
						sum += (j + k[i] / j);
				}
			}
			
			returnArray[i] = sum;
		}

		return returnArray;
	}
}
