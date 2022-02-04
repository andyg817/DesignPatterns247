/**
 * Crerats new luxury car and adds items to it
 * @author Andrew Garcia
 */
public class LuxuryCar extends Car{
/**
 * Assignes make and model of car
 * @param make make of luxury car
 * @param model model of luxury car
 */
    public LuxuryCar(String make, String model) {
        super(make, model);
    }
/**
 * adds frame to car (output)
 */
    protected void addFrame() {
        System.out.println("Adding a Beutiful Frame");
    }
/**
 * overrides addengine in car class and adds luxury engine
 */
    protected void addEngine() {
        System.out.println("Adding a Supped Up Engine");
    }
/**
 * adds accessories to luxury car
 */
    protected void addAccessories() {
        Accessory.add(Accessories.PHONE_CHARGER);
        Accessory.add(Accessories.FLOOR_MATTS);
        Accessory.add(Accessories.BACK_UP_CAMERA);
        Accessory.add(Accessories.EXTRA_CUP_HOLDERS);
        Accessory.add(Accessories.HEATED_SEATS);
        Accessory.add(Accessories.SPORTS_SEATS);
        Accessory.add(Accessories.WINDOW_TINT);
        Accessory.add(Accessories.HIGH_END_SOUND);
        Accessory.add(Accessories.TRUNK_ORGANIZER);
        Accessory.add(Accessories.BLUE_TOOTH);
    }
}
