package command;

/**
 * Command class for firing a bullet
 * @author rleboeu
 * @version 1.0.0
 */
public class FireCommand implements Command {

    // fields
    private Player player;

    /**
     * Constructor
     * @param player that will execute the command
     */
    public FireCommand(Player player) {
        this.player = player;
    }
    
    /**
     * Calls the player's fire method
     */
    public void execute() {
        player.fire();
    }

}
