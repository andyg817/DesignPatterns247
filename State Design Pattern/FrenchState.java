import java.util.*;
/**
 * French state for music
 * @author Andrew Garcia
 */
public class FrenchState implements State{
    private MusicBox box;

    public FrenchState(MusicBox box) {
        this.box = box;
    }
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
    public void pressEnglishButton() {
        box.setState(box.getEnglishState());
    }
    public void pressFrenchButton() {
        System.out.println("Vous êtes déjà en mode français");
    }
    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
    }
}
