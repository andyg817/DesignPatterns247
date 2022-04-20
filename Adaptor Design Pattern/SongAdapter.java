/**
 * Adapts tunes and songs
 * @author Andrew Garcia
 */
public class SongAdapter extends Song{
    private Tune tune;
    
/**
 * Contructor for song adaptor
 * @param tune
 */
    public SongAdapter(Tune tune) {
        this.tune = tune;
    }
/**
 * Returns title
 */
    public String getTitle() {
        String title = "";
        for (int i = 0; i < tune.getDisplayTitle().length(); i++) {
            title += tune.getDisplayTitle().charAt(i);
            if(tune.getDisplayTitle().charAt(i) == ':') break;
        }
        return title;
    }
/**
 * Returns albums
 */
    public String getAlbum() {
        String album = "";
        for (int i = 0; i < tune.getDisplayTitle().length(); i++) {
            if(tune.getDisplayTitle().charAt(i) == ':') {
                for (int j = 0; j < i; i++) album += tune.getDisplayTitle().charAt(j);
            }
        }
        return album;
    }
/**
 * returns artist first name
 */
    public String getArtistFirstName() {
        String fName = "";
        for (int i = 0; i < tune.getArtistName().length(); i++) {
            fName += tune.getArtistName().charAt(i);
            if(tune.getArtistName().charAt(i) == ':') break;
        }
        return fName;
    }
/**
 * returns artist last name
 */
    public String getArtistLastName() {
        String lName = "";
        for (int i = 0; i < tune.getArtistName().length(); i++) {
            if(tune.getArtistName().charAt(i) == ':') {
                for (int j = 0; j < i; i++) lName += tune.getArtistName().charAt(j);
            }
        }
        return lName;
    }
/**
 * returns category
 */
    public String getGenre() {
        return tune.getCategory();
    }
}
