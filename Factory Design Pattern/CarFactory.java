/**
 * Creates new car
 * @author Andrew Garcia
 */
public class CarFactory {
   /**
    * Creates new car depending on type, make and model
    * @param type the type of car 
    * @param make the make of the car
    * @param model the model of the car
    * @return the car complete with type make and model
    */
   public static Car createCar(String type, String make, String model) {
      Car car = null;
      if(type.equals("small")) {
         System.out.println("Creating a " + make + " " + model);
         car = new SmallCar(make, model);
      } else if(type.equals("sedan")) {
         System.out.println("Creating a " + make + " " + model);
         car = new SedanCar(make, model);
      } else if(type.equals("luxury")) {
         System.out.println("Creating a " + make + " " + model);
         car = new LuxuryCar(make, model);
      }
      return car;
   }
}
