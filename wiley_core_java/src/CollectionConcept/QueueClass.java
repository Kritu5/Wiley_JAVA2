package CollectionConcept;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
	public static void main(String[] args) {
		Queue<String> aq = new PriorityQueue<>();
		aq.add("A");
		aq.add("A");
		aq.add("A");
		aq.add("A");
		System.out.println(aq);
	}

}
