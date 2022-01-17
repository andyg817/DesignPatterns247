import java.util.ArrayList;
/**
 * BubbleSort algorithm
 * @writer Andrew Garcia
 */
public class BubbleSort implements SortBehavior {
	/**
	 * Implementation of BubbleSort
	 * @param ArrayList of type string
	 * @return ArrayList of type string sorted using Bubble sort
	 */
    public ArrayList<String> sort(ArrayList<String> data) {
//Referencing from https://stackabuse.com/bubble-sort-in-java/
		boolean hasSwapped = true;
		while(hasSwapped) {
			hasSwapped = false;
			for(int i=0;i<data.size()-1;i++) {
				if(data.get(i).compareTo(data.get(i+1)) > 0) {
					String temp = data.get(i);
					data.set(i, data.get(i+1));
					data.set(i+1, temp);
					hasSwapped = true;
				}
			}
		}
        return data;
    }
} 