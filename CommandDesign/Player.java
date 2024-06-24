package command;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Displays run, fire, jump, or quit commands
 * @authors Andrew Garcia, Ryan, Thomas, Miller 
 */
public class Player {


    /**
     * Constructor
     */
    public Player() {

        System.out.println("Our her is born");

    }

    /**
     * Print the player jumping
     */
    public void jump() {
        try {
            Scanner scan = new Scanner(new File("jump.txt"));
            while (scan.hasNextLine()) {
                for (int i = 0; i < 6; i++) {
                    String line = scan.nextLine();
                    System.out.println(line);
                }
                sleep(100);
                clear();
            }
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    /**
     * Prints the player firing a bullet across the terminal
     */
    public void fire() {
        try {
            Scanner reader = new Scanner(new File("fire.txt"));
            StringBuffer sb = new StringBuffer();
            int lineCounter = 0;

            // iterate over each line in the file
            while (reader.hasNextLine()) {
                
                // print the buffer of 3 lines
                if (lineCounter == 3) {
                    this.clear();

                    System.out.println(sb.toString());
                    lineCounter = 0;
                    sb = new StringBuffer();

                    this.sleep(100);
                }

                sb.append(reader.nextLine() + "\n");

                ++lineCounter;
            }

            reader.close(); // close the input stream
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }    
    }

    /**
    * Displays character running forward
    */
    public void runForward() {
        try {
            Scanner scanner = new Scanner(new File("run.txt"));
            while (scanner.hasNextLine()) {
                for (int i = 0; i < 3; i++) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
                sleep(100);
                clear();
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Pause for num milliseconds
     * @param num seconds to pause the output
     */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timer error");
        }
    }

    /**
     * Clears the console
     */
    private void clear() {
        System.out.print("\033[H\033[2J");
    }

}