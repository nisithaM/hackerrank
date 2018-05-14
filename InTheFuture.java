package methods;

public class InTheFuture {

	public static int minNum(int A, int K, int P) {

		if((K - A) < 0 || ((K - A) == 0 && P > 0) ) {
			return -1;
		} else {
			int gap = K - A;
			int returnVal = (int)Math.floor((double)P/gap);
			return (returnVal+1);
		}
	}
}
