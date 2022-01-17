import java.util.ArrayList;
/**
 * A ArrayList of type String
 * @writer Andrew Garcia
 */
public class Listing{
    private ArrayList<String> items = new ArrayList<String>();
    private SortBehavior sortBehavior;
    private String title;
    /**
     * Creates a string for the title of the lists and initializer for sortBehavior
     * @param title The name of the title of Lists
     */
    public Listing(String title) {
        this.sortBehavior = new BubbleSort();
        this.title = title;
    }
    /**
     * adds items to list
     * @param item  Items being added to list
     */
    public void add(String item) {
        items.add(item);
    }
    /**
     * removes items from list
     * @param item  Items being removed from list
     */
    public void remove(String item) {
        items.remove(item);
    }
    /**
     * Returns title of list
     * @return title
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * Sets sortBehavior to the input parameter
     * @param sortBehavior type of sort being set
     */
    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }
    /**
     * Returns sorted list of items
     * @return  ArrayList of items
     */
    public ArrayList<String> getSortedList() {
        return sortBehavior.sort(items);
    }
    /**
     * Returns the unsorted list of items
     * @return  ArrayList of items
     */
    public ArrayList<String> getUnSortedList() {
        return this.items;
    }
}