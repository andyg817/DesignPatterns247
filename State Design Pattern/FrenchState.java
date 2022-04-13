import java.util.*;
/**
 * French state for music
 * @author Andrew Garcia
 */
public class FrenchState implements State{
    private MusicBox box;
/**
 * Constructor of the french music box
 * @param box 
 */
    public FrenchState(MusicBox box) {
        this.box = box;
    }
/**
 * Fills ArrayList with french twinkle little star
 */
    public void pressStarButton() {
        String name = "Brille, brille, petite étoile";
        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Brille, brille, petite étoile,");
        lyrics.add("Je me demande vraiment ce que tu es!");
        lyrics.add("Au-dessus du monde si haut,");
        lyrics.add("Comme un diamant dans le ciel.");
        lyrics.add("Brille, brille, petite étoile,");
        lyrics.add("Je me demande vraiment ce que tu es!");
        box.playSong(name, lyrics);
    }
/**
 * Fills ArrayList with french if your happy
 */
    public void pressHappyButton() {
        String name = "Si tu as d' la joie au cœur";
        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Si tu as d' la joie au cœur Frappe des mains");
        lyrics.add("Si tu as d' la joie au cœur Frappe des mains");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Frappe des mains.");
        box.playSong(name, lyrics);
    }
/**
 * Sets box to english state
 */
    public void pressEnglishButton() {
        box.setState(box.getEnglishState());
    }
/**
 * Displays that french state is already set
 */
    public void pressFrenchButton() {
        System.out.println("Vous êtes déjà en mode français");
    }
/**
 * Sets box to spanish state
 */
    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
    }
}
