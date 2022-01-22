import java.util.*;
public class TallyDisplay implements Observer{
    private Subject poll;
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();
    
    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }
    public void update(HashMap<String, Integer> votes) {
        this.votes = votes;
        display();
    }
    private void display() {
        System.out.println("Current Tallies: " + votes + "\n");
    }
}
