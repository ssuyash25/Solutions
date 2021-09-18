
import java.util.*;

public class LRU {
	private Set<Integer> cache;
    private int capacity;
 
    public LRU()
    {
        this.capacity = 10;
        this.cache = new LinkedHashSet<Integer>(10);
    }
    
    public LRU(int capacity)
    {
        this.cache = new LinkedHashSet<Integer>(capacity);
        this.capacity = capacity;
    }
    
    public void refer(int key) {
    	 if (get(key) == false)
             put(key);
    }
    
    public boolean get(int key)
    {
        if (!cache.contains(key))
            return false;
        cache.remove(key);
        cache.add(key);
        return true;
    }
    
    public void put(int key)
    {
         
      if (cache.size() == capacity) {
            int firstKey = cache.iterator().next();
            cache.remove(firstKey);
        }
 
        cache.add(key);
    }
    
    public void display()
    { LinkedList<Integer> list = new LinkedList<>(cache);
      Iterator<Integer> itr = list.descendingIterator();     
      while (itr.hasNext())
      System.out.print(itr.next() + " ");
    }
    
    public static void main(String[] args)
    {
        LRU ca = new LRU(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }
    
}
