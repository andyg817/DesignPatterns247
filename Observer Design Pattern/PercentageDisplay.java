import java.util.*;
public class PercentageDisplay implements Observer{
    private Subject poll;
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();
    private int numVotes;

    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }
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
    private void display() {
        System.out.println("Current Percent of Votes: " + votes + "\n");
    }
}
