import java.util.*;
/**
 * Displays percent of votes, implimentation of Observer
 * @author Andrew Garcia
 */
public class PercentageDisplay implements Observer{
    private Subject poll;
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();
    private int numVotes;
    /**
     * Creates new Subject poll and registers it as an observer
     * @param poll Subject Poll
     */
    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }
    /**
     * Updates votes hashmap, turns tally into percent and calls display
     * @param votes hashmap that conatins the votes
     */
    public void update(HashMap<String, Integer> votes) {
        double k = 0;
        for(int i : votes.values()) {
            numVotes += i;
        }
        for(int j : votes.values()) {
            k = j;
            k /= numVotes;
            k *= 100;
        }
        this.votes = votes;
        display();
    }
    /**
     * Displays votes ad percent
     */
    private void display() {
        System.out.println("Current Percent of Votes: " + votes + "\n");
    }
}
