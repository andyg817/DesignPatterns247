import java.util.*;
/**
 * Displays tally of votes, implementation of Observer
 * @author Andrew Garcia
 */
public class TallyDisplay implements Observer{
    private Subject poll;
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();
    /**
     * Creates a new Subject poll that is registered as an observer
     * @param poll Subject poll
     */
    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }
    /**
     * updates votes Hashmap and calls display
     * @param votes Hashmap that conatains votes
     */
    public void update(HashMap<String, Integer> votes) {
        this.votes = votes;
        display();
    }
    /**
     * Displays votes in tally
     */
    private void display() {
        System.out.println("Current Tallies: " + votes + "\n");
    }
}
