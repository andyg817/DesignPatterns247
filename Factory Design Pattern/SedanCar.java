/**
 * Creates and adds things to sedancar
 * @author Andrew Garcia
 */
public class SedanCar extends Car {
/**
 * assigns make and model to car
 * @param make make of sedancar
 * @param model model of smallcar
 */
    public SedanCar(String make, String model) {
        super(make, model);
    }
/**
 * adds frame to sedancar (output)
 */
    protected void addFrame() {
        System.out.println("Adding a Three part Frame");
    }
/**
 * adds accessories to accessory enum
 */
    protected void addAccessories() {
        Accessory.add(Accessories.PHONE_CHARGER);
        Accessory.add(Accessories.FLOOR_MATTS);
        Accessory.add(Accessories.BACK_UP_CAMERA);
        Accessory.add(Accessories.EXTRA_CUP_HOLDERS);
        Accessory.add(Accessories.HEATED_SEATS);
    }
}
