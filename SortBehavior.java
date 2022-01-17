import java.util.*;
/**
 * SortBehavior interface used to choose between insertion and bubble sort algorithms
 * @written Andrew Garcia
 */
public interface SortBehavior {
    /**
     * Inserts an arraylist of type string and outputs it sorted
     * @param data ArrayList of type string
     * @return ArrayList of type string sorted
     */
    public ArrayList<String> sort(ArrayList<String> data);
}