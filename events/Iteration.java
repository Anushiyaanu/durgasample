import java.util.Collection;  
import java.util.Collections;  
import java.util.Iterator;  
import java.util.concurrent.ConcurrentLinkedQueue;  
public class JavaCollectionIteratorExample2 {  
    public static void main(String[] args) {  
        Integer[] val = new Integer[2];  
        Collection<Integer> collection = new ConcurrentLinkedQueue<Integer>();  
        collection.add(71018);  
        collection.add(8000);  
        collection.add(1178);  
        collection.add(1190);  
        //Returns an iterator over the elements  
        Iterator<Integer> iterator = collection.iterator();  
        while(iterator.hasNext()){  
            System.out.println(iterator.next());  
            val[0] = Collections.max(collection);  
            val[1] = Collections.min(collection);  
        }  
        System.out.println("Max number = "+ val[0]);  
        System.out.println("Min number = "+ val[1]);  
    }  
} 