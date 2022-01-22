import java.util.*;
public class StudentGovPoll implements Subject{
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();
    private String school;
    private int numUpdates;

    public StudentGovPoll(String school) {
        observers = new ArrayList<Observer>();
        votes = new HashMap<String, Integer>();
        this.school = school;
    }
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(votes);
        }
    }
    public void addCandidate(String president) {
        votes.put(president, 0);
    }
    public void enterVotes(String president, int num) {
        numUpdates++;
        votes.put(president, votes.get(president) + num);
        if(numUpdates == 4) {
            notifyObservers();
        }
    }
    public String getSchool() {
        return this.school;
    }
}
