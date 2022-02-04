import java.util.*;
public abstract class Car {
/**
 * assembles and adds all things to car
 * @author Andrew Garcia
 */
   private String make;
   private String model;
   protected ArrayList<Accessories> Accessory = new ArrayList<Accessories>();
/**
 * Set make and model to car, calling accessories
 * @param make make of the car
 * @param model model of the car
 */
   public Car(String make, String model) {
      this.make = make;
      this.model = model;
      ArrayList<Accessories> Accessory;
      assemble();
   }
/**
 * Calls all of respective methods assembling the car
 */
   public void assemble() {
      addFrame();
      addWheels();
      addEngine();
      addWindows();
      addAccessories();
      displayAccessories();
   }
/**
 * adding respective frame to car (abstract method)
 */
   protected void addFrame() {
      //Abstract
   }
/**
 * adding wheels to the car
 */
   protected void addWheels() {
      System.out.println("Adding the Wheels");
   }
/**
 * adding engine to the car
 */
   protected void addEngine() {
      System.out.println("Adding the Standard Engine");
   }
/**
 * adding windows to the car
 */
   protected void addWindows() {
      System.out.println("Adding the Windows");
   }
/**
 * adding respective ccessories to car (abstract method)
 */
   protected void addAccessories() {
      //Abstract
   }
/**
 * displaying all accessories in car
 */
   protected void displayAccessories() {
      System.out.println("Accessories: ");
      for(Accessories Accessor : Accessory) {
         System.out.println(Accessor);
      }
   }
}
