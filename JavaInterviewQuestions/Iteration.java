package helloworld;
import java.util.ArrayList;
import java.util.*;

public class Iteration {

	
	

public static void main(String[] args) {
	
	ArrayList<String> al = new ArrayList<String>();
	al.add("test");
	al.add("test1");
	al.add("test2");
	al.add("test3");
	al.add("test4");

	Iterator<String> it = al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	ListIterator<String> li = al.listIterator();
	System.out.println(li.next());
	System.out.println(li.previous());

	
}
}