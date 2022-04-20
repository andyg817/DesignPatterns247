import java.util.*;
/**
 * Juke box that interracs with driver
 * @author Andrew Garcia
 */
public class JukeBox {
    private HashMap<String, Song> songs = new HashMap<String, Song>();
    private int currentSong;

/**
 * Constructor for jukebox
 */
    public JukeBox() {
        HashMap<String, Song> songs = new HashMap<String, Song>();
        int currentSong;
    }
/**
 * adds song to hashmap
 * @param song
 */
    public void addSong(Song song) {
        songs.put(song.getTitle(), song);
    }
/**
 * Play music based on the song name
 * @param songName
 */
    public void play(String songName) {
        if(songs.containsValue(songName) != true) {
            System.out.println("Sorry");
        } else songName.toString();
    }
}