public class RefrigeratorString {
	public static void main(String[] args) {
		
	//using litrals
    String capacity="187l";
    String energyRating="3 Star";
    String color="Black";
    String warranty="2 yr";
    String coolingTime="3 hours";
    String defrostSystem="Automatic";
    String finishType="Glass";
    String productDimention="60.5D*53.5W*118.8H";
    String itemWeight="334000 Grams";
    String brand="Samsung";
	
	// new keyword
    String voltage=  new String("220 v");
    String freezerCapacity= new String("143l");
    String pattern=new String("Solid");
    String batteryRequired= new String("No");
    String doorOrientation=new String("Left");
    String model=new String("205 WDE CLS 3S");
    String price=new String("25000 Rs");
    String shelfType=new String("Wire");
	String coolingMethod= new String ("Compressor");
	String energyConsumption= new String("170 Kw/h");
	
	String returnedValue= capacity.substring(2);
	System.out.println(returnedValue);
	
	String realedValue= color.replace('B','W');
	System.out.println(realedValue);
	
    int result1= brand.lastIndexOf("godrage");
	System.out.println(result1);
	
	boolean value=shelfType.endsWith("e");
	System.out.println(value);
	
	boolean value2=shelfType.endsWith("ed");
	System.out.println(value2);
	
	int valued=pattern.indexOf(2);
	System.out.println(valued);
	
	}
}