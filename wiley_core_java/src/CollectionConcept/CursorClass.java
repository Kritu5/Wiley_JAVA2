package CollectionConcept;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CursorClass {
 public static void main(String[] args) {
	Vector<String> vc = new Vector<>();
	vc.addElement("A");
	vc.addElement("A");
	vc.addElement("A");
	vc.addElement("A");
	vc.addElement("A");
	Enumeration<String> ev = vc.elements();
	while(ev.hasMoreElements()) {
		System.out.println(ev.nextElement());
	}
	//List Iterator
	LinkedList<String> li = new LinkedList<>();
	List<String> li1 = new ArrayList<>();
	
	
}
}
