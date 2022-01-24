import java.util.*;
/**
 * Insertion sort algorithm that doest work
 * @writer Andrew Garcia
 */
public class InsertionSort implements SortBehavior {
    /**
	 * Implementation of Insertion Sort
	 * @param ArrayList of type string
	 * @return ArrayList of type string sorted using Insertion sort
	 */
    public ArrayList<String> sort(ArrayList<String> data) {
    //Referencing from https://stackabuse.com/insertion-sort-in-java/
        for (int i = 1; i < data.size(); i++) {
            String current = data.get(i);
            int j = i-1;
            while ((j > -1) && ((data.get(j).compareTo(current)) == 1)) {
                data.set(j+1, data.get(j));
                j--;
            }
            data.set(j+1, current);
        }
        return data;
    }
}
