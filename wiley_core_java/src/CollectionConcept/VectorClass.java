package CollectionConcept;

import java.util.ArrayList;
import java.util.List;

public class VectorClass {
	public static void main(String[] args) {
		int size=1000;
		List<Integer> arrayList = new ArrayList<>();
		long start = System.currentTimeMillis();
		for(int i=0;i<size;i++) {
			arrayList.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken to add "+size+ "Values"+(end-start) );
		List<Integer> vectorList = new ArrayList<>();
		start = System.currentTimeMillis();
		for(int i=0;i<size;i++) {
			arrayList.add(i);
		}
	    end = System.currentTimeMillis();
		System.out.println("Time taken to add "+size+ "Values"+(end-start) );
		
	}
	}
//Multi threaded concept
//ListInteger<> multiThreadVectorList = new Vector<>();


