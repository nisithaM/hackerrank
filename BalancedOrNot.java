package methods;

import java.util.Stack;

public class BalancedOrNot {

	public static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {

		int[] returnArray = new int[maxReplacements.length];

		for (int i = 0; i < expressions.length; i++) {

			Stack<Character> stack = new Stack<>();
			int count = 0;
			int balance = 0;
			for (int j = 0; j < expressions[i].length(); j++) {
				char ch = expressions[i].charAt(j);
				if (ch == '<') {
					stack.push(ch);
				} else if ((ch == '>') && (!stack.isEmpty())) {
					if (((char) stack.peek() == '<' && ch == '>')) {
						stack.pop();
					} else {
						count++;
					}
				} else {
					if ((ch == '>')) {
						count++;
					}
				}
			}
			if (stack.isEmpty()) {
				count = 0;
			} else {
				count = -1;
			}

			if (count == -1) {
				balance = 0;
			} else if (count == 0) {
				balance = 1;
			} else if (count > 0) {
				if (maxReplacements[i] <= count) {
					balance = 1;
				} else {
					balance = 0;
				}
			}

			returnArray[i] = balance;
		}

		return returnArray;
	}

}
