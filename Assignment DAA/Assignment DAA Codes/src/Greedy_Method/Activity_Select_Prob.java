package Greedy_Method;

import java.util.*;
//Simple pair class to store the start time and finish time
//of the activities

public class Activity_Select_Prob extends PairClass{
	
		// Activity-Selection problem
		public static Set<Integer> selectActivity(List<PairClass> activities)
		{
			// k keeps track of the index of the last selected activity
			int k = 0;

			// set to store the selected activities index
			Set<Integer> out = new HashSet<>();

			// select 0 as first activity
			out.add(0);

			// start iterating from the second element of
			// vector up to its last element
			for (int i = 1; i < activities.size(); i++)
			{
				if (activities.get(i).getStart() >= activities.get(k).getFinish())
				{
					out.add(i);
					k = i;	// update i as last selected activity
				}
			}

			return out;
		}

		public static void main(String[] args)
		{
			// list of given jobs. Each job has an identifier, a deadline and
			// profit associated with it
			List<PairClass> activities = Arrays.asList(new PairClass(1, 4), new PairClass(3, 5),
					new PairClass(0, 6), new PairClass(5, 7), new PairClass(3, 8),
					new PairClass(5, 9), new PairClass(6, 10), new PairClass(8, 11),
					new PairClass(8, 12), new PairClass(2, 13), new PairClass(12, 14));

			// Sort the activities according to their finishing time
			Collections.sort(activities, (a, b) -> a.getFinish() - b.getFinish());

			Set<Integer> res = selectActivity(activities);

			for (Integer i: res) {
				System.out.println(activities.get(i));
			}
		}
}

