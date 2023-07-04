public class Refrigerator {
    static String capacity;
    static int energyRating;
    static String color;
    static int warranty;
    static float coolingTime;
    static String defrostSystem;
    static String finishType;
    static float productDimention;
    static float weight;
    static String brand;
    static int voltage;
    static float freezerCapacity;
    static String pattern;
    static boolean isBatteryRequired;
    static String doorOrientation;
    static int noOfDoors;
    static String model;
    static int price;
    static String shelfType;

    public Refrigerator(String capacity, int energyRating, String color, int warranty, float coolingTime,
            String defrostSystem, String finishType, float productDimention, float weight, String brand,
            int voltage, float freezerCapacity, String pattern, boolean isBatteryRequired, String doorOrientation,
            int noOfDoors, String model, int price, String shelfType) {

        this.capacity = capacity;
        this.energyRating = energyRating;
        this.color = color;
        this.warranty = warranty;
        this.coolingTime = coolingTime;
        this.defrostSystem = defrostSystem;
        this.finishType = finishType;
        this.productDimention = productDimention;
        this.weight = weight;
        this.brand = brand;
        this.voltage = voltage;
        this.freezerCapacity = freezerCapacity;
        this.pattern = pattern;
        this.isBatteryRequired = isBatteryRequired;
        this.doorOrientation = doorOrientation;
        this.noOfDoors = noOfDoors;
        this.model = model;
        this.price = price;
        this.shelfType = shelfType;

    }

    public static void storingLeftOver() {
    }

    public static void keepFlowersFresh() {
    }

    public static void consumeElectricity() {
    }

    public static void preservingFood() {
    }

    public static void DecoratingKitchens() {
    }

    public static void Ammunition() {
    }

    public static void storeMedicine() {
    }

    public static void coolFood() {
    }

    public static void setTemperature() {
    }

    public static void storingFrozen() {
    }

    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator("184l",
                3,
                "Black", 3,
                2.5f, "Automatic",
                "Glass", 60.5f,
                3000.0f, "Whirlpool", 220,
                (float) 14.3, "solid", false,
                "Left", 1, "205 WDE", 25000, "Wire");

        System.out.println(Refrigerator.capacity);
        System.out.println(Refrigerator.energyRating);
        System.out.println(Refrigerator.color);
        System.out.println(Refrigerator.coolingTime);
        System.out.println(Refrigerator.warranty);
        System.out.println(Refrigerator.defrostSystem);
        System.out.println(Refrigerator.finishType);
        System.out.println(Refrigerator.productDimention);
        System.out.println(Refrigerator.weight);
        System.out.println(Refrigerator.brand);
        System.out.println(Refrigerator.voltage);
        System.out.println(Refrigerator.freezerCapacity);
        System.out.println(Refrigerator.pattern);
        System.out.println(Refrigerator.isBatteryRequired);
        System.out.println(Refrigerator.doorOrientation);
        System.out.println(Refrigerator.noOfDoors);
        System.out.println(Refrigerator.model);
        System.out.println(Refrigerator.price);
        System.out.println(Refrigerator.shelfType);

    }

}