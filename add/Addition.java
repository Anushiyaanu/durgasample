import java.util.Collection;  
import java.util.Iterator;  
import java.util.concurrent.ConcurrentLinkedQueue;  
public class    Addition {  
    static int i = 1;  
    public static void main(String[] args) {  
        Collection<String> collection = new ConcurrentLinkedQueue<String>();  
        collection.add("Ram");  
        collection.add("Sham");  
        collection.add("Mira");  
        collection.add("Rajesh");  
        Iterator<String> iterator = collection.iterator();  
        //Returns an iterator over the elements  
        while (iterator.hasNext()) {  
            System.out.println(i++ + "." + iterator.next());  
        }  
    }  
} 