package methods;

import java.util.ArrayList;
import java.util.List;

public class PsychoMetricTesting {

	public static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {

		List<Integer> returnList = new ArrayList<>();
		for (int i = 0; i < upperLimits.length; i++) {
			int count = 0;
			int upperLimit = upperLimits[i];
			int lowerLimit = lowerLimits[i];
			for (int j = 0; j < scores.length; j++) {
				int score = scores[j];
				if(score >= lowerLimit && score <= upperLimit) {
					count++;
				}
			}
			returnList.add(count);
		}
		
		return returnList.stream().mapToInt(i->i).toArray();
	}

}
