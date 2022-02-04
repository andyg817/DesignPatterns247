/**
 * Creates and adds all things to smallcar
 * @author Andrew Garcia
 */
public class SmallCar extends Car {
/**
 * Assigns make and model to small car
 * @param make make of smallcar
 * @param model model of smallcar
 */
   public SmallCar(String make, String model) {
      super(make, model);
   }
/**
 * adds frame to smallcar 
 */
   protected void addFrame() {
      System.out.println("Adding a Small Frame");
   }
/**
 * adds accessories to accessory enum
 */
   protected void addAccessories() {
      Accessory.add(Accessories.PHONE_CHARGER);
      Accessory.add(Accessories.FLOOR_MATTS);
   }
}
