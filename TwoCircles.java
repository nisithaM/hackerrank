package methods;

import java.util.Arrays;

public class TwoCircles {

	public static String[] circles(String[] args) {

		String[] returnArray = new String[args.length];

		for (int i=0; i<args.length; i++) {
			String[] lineElements = args[i].split(" ");
			int[] array = Arrays.asList(lineElements).stream().mapToInt(Integer::parseInt).toArray();

			int x1 = array[0];
			int y1 = array[1];
			int r1 = array[2];

			int x2 = array[3];
			int y2 = array[4];
			int r2 = array[5];
			
			String ele = null;

			if ((x1 == x2) && (y1 == y2)) {
				ele = "Concentric";
			} else {
				double distance = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);

				if (distance == (r1 + r2) || distance == Math.abs(r1 - r2)) {
					ele = "Touching";
				} else if ((r2 >= r1 && distance <= (r2 - r1)) || (r1 >= r2 && distance <= (r1 - r2))) {
					ele = "Disjoint-Inside";
				} else if (distance > (r1 + r2)) {
					ele = "Disjoint-Outside";
				} else {
					ele = "Intersecting";
				}
			}
			
			returnArray[i] = ele;
		}
		
		return returnArray;

	}
}
