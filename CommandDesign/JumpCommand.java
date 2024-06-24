package command;

/**
 * command class for Jumping
 * @author Thomas Ferguson
 */
public class JumpCommand implements Command {
    private Player player;

    /**
     * Initializes player
    * @param player 
    */
    public JumpCommand(Player player){
        this.player = player;
    }

    /**
    * executes jump option
    */
    public void execute() {
        player.jump();
    }
}
