/**
 * Parameters for Exercise Iterator
 * @author Andrew Garcia
 */
public class ExerciseIterator implements Iterator{
    private Exercise[] exercises;
    private int position;
/**
 * Initializes exercises array
 * @param exercises exercsises array
 */
    public ExerciseIterator(Exercise[] exercises) {
        this.exercises = exercises;
    }
/**
 * checks if exercises has next element
 */
    public Boolean hasNext() {
        if(position >= exercises.length || exercises[position] == null) {
            return false;
            
        } else {
            return true;
        }

    }
/**
 * goes to next element of exercise array
 */
    public Exercise next() {
        Exercise excersize = exercises[position];
        position = position + 1;
        return excersize;
    }
}
