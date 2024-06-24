package command;

/**
 * Command Class for Running
 * @author Andrew Garcia
 */
public class RunCommand implements Command {
    private Player player;

    /**
     * Initializes player
     * @param player to initialize
     */
    public RunCommand(Player player) {
        this.player = player;
    }

    /**
     * Executes the run option
     */
    public void execute() {
        player.runForward();
    }
}
