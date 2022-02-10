/**
 * Creates exercise array that contains title muscles and directions
 * @author Andrew Garcia
 */
import java.util.*;
public class Exercise {
    private String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;
/**
 * Initializes title of exercise
 * @param title title of exercise
 */
    public Exercise(String title) {
        this.title = title;
    }
/**
 * Initializes all things for exercise, title, muscles, and directions
 * @param title title of exercise
 * @param targetMuscles muscles targeted in exercise
 * @param directions directions for exercise
 */
    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }
/**
 * Adds muscles targeted to array
 * @param muscle muscle targeted in exercise
 */
    public void addTargetMuscle(String muscle) {
        for (int i = 0; i < targetMuscles.size(); i++) {
            if (targetMuscles.get(i) == muscle) {
                targetMuscles.add(muscle);
            }
        }
    }
/**
 * Removes target muscle from array
 * @param muscle muscle targeted in exercise
 */
    public void removeTargetMuscle(String muscle) {
        for (int i = 0; i < targetMuscles.size(); i++) {
            if (targetMuscles.get(i) == muscle) {
                targetMuscles.remove(i);
            }
        }
    }
/**
 * Returns toString of exercise title, musclestargeted, and directions for exercise
 */
    public String toString() {
        String workout = String.join("\n- ", directions);
        String muscles = String.join(", ", targetMuscles);
        return "\n... " + title + " ...\n Muscles: " + muscles + "\n Exercises: \n- " + workout + "\n";
    }
}
