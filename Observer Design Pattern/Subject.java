/**
 * Subject interface that modifys observers
 * @author Andrew Garcia
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
