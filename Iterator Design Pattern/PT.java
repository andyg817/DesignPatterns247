/**
 * Creates PT name and bio along with exercises
 * @author Andrew Garccia
 */
import java.util.*;
public class PT {
    private String firstName;
    private String lastName;
    private String bio;
    private int num = 0;
    private Exercise[] exercises;
/**
 * Initializes firstname, lastname, and bio of PT
 * @param firstName first name of PT
 * @param lastName last name of PT
 * @param bio bio of physical trainer
 */
    public PT(String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        exercises = new Exercise[2];
    }
/**
 * Adds new exercise to trainer, includes instructions and muscles trained
 * @param title title of exercise
 * @param muscleGroups muscles groups worked in exercise
 * @param directions directions for exercise
 */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {
        int size = exercises.length;
        Exercise exercisez = new Exercise(title, muscleGroups, directions);
        exercises[num] = exercisez;
        num ++;
        if(num == size) {
            exercises = growArray(exercises);
        }
        
    }
/**
 * returns firstnameof PT
 * @return first name of PT
 */
    public String getFirstName() {
        return this.firstName;
    }
/**
 * return last name of PT
 * @return last name of PT
 */
    public String getLastName() {
        return this.lastName;
    }
/**
 * return bio of PT
 * @return bio of PT
 */
    public String getBio() {
        return this.bio;
    }
/**
 * Increases size of array by *2
 * @param exercises exercise array containing all exercises
 * @return new exercise array that is 2 times the size of param array
 */
    private Exercise[] growArray(Exercise[] exercises) {
        int size = exercises.length;
        size *= 2;
        Exercise[] newArr = new Exercise[size];
        for (int i = 0; i < exercises.length; i++) {
            newArr[i] = exercises[i];
        }
        return newArr;
    }
    //Reference to https://www.delftstack.com/howto/java/increase-array-size-in-java/
/**
 * creates new iterator for exersises
 * @return new exercise iterator
 */
    public ExerciseIterator createIterator() {
        return new ExerciseIterator(exercises);
    }
/**
 * returns information of PT
 */
    public String toString() {
        return firstName + " " + lastName + "\n" + bio + "\n";
    }
}
