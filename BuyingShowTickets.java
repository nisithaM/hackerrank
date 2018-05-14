package methods;

import java.util.Arrays;

public class BuyingShowTickets {

	public static Long waitingTime(int[] tickets, int p) {
		long times = 0;
	    int[] tempArray = Arrays.copyOf(tickets, tickets.length);
	    for(int i = 0; i < tickets.length; i++ ) {
	       tempArray[i] = tickets[i] - tickets[p];
	    }
	    for(int i = 0; i < tickets.length; i++ ) {
	       if(tempArray[i] < 0) times += tickets[i];
	       else {
	          if(i <= p) times += tickets[p];
	          else times += tickets[p] - 1;
	       }
	    }
	    return times;
    }
}
