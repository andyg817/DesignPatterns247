import java.util.*;
/**
 * Student gov poll that modifys observer and votes
 * @author Andrew Garcia
 */
public class StudentGovPoll implements Subject{
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();
    private String school;
    private int numUpdates;
    /**
     * Initializes observers, votes, and school
     * @param school name of school
     */
    public StudentGovPoll(String school) {
        observers = new ArrayList<Observer>();
        votes = new HashMap<String, Integer>();
        this.school = school;
    }
    /**
     * adds observer to arraylist
     * @param observer arraylist of observers
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    /**
     * removes observer from arraylist
     * @param observer arraylist of observers
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    /**
     * notifies observers of votes
     */
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(votes);
        }
    }
    /**
     * adds candidate to votes hashmap
     * @param president
     */
    public void addCandidate(String president) {
        votes.put(president, 0);
    }
    /**
     * Enter votes and presidents into hashmap
     * @param president president in school gov poll
     * @param num number of votes
     */
    public void enterVotes(String president, int num) {
        numUpdates++;
        votes.put(president, votes.get(president) + num);
        if(numUpdates == 4) {
            notifyObservers();
        }
    }
    /**
     * returns school name
     * @return string of school
     */
    public String getSchool() {
        return this.school;
    }
}
