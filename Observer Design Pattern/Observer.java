import java.util.*;
/**
 * An observer that observes and updates observee classes
 * @author Andrew Garcia
 */
public interface Observer {
   /**
    * Updates hashmap votes
    * @param votes
    */
   public void update(HashMap<String, Integer> votes); 
}
