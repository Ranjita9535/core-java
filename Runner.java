public class Runner{
	public static void main(String[] args){
		Television television = new Television("32s","Tizen","QLED",3.5f);
		System.out.println(television.screenSize);

	
		Television television1 = new Television("35s","Android","LED",4.5f);
		System.out.println(television1.screenSize);
		
		
		Television television2 = new Television("36s","Tizen","qLED",5.5f);
		System.out.println(television2.operatingSystem);
		
		
		Television television3 = new Television("37s","webOs","LED",3.5f);
		System.out.println(television3.screenType);
		
		
		Television television4 = new Television("38s","tvOs","QLED",4.0f);
		System.out.println(television4.weight);
	
		}
		}
		class Television{
		static String brand;
		String screenSize;
		String resolution;
		String operatingSystem;
		String screenType;
		float weight;
		String powerConsumption;
		int usbPorts;
		boolean isBluetooth;
		String panel;
		
		static{
		System.out.println("Static Block");
		brand="Samsung";
		}
		public static void toWatch(){
		String screenSize="32s";
		String operatingSystem="Android";
		String screenType="LED";
		float weight=4.5f;
		}
		
		public static void playVideo(){
		String screenSize="37s";
		String operatingSystem="webos";
		String screenType="LED";
		float weight=3.5f;
		}
		
		public static void platMusic(){
		String screenSize="38s";
		String operatingSystem="tvOs";
		String screenType="QLED";
		float weight=4.0f;
		}
		
		public Television(String screenSize,String operatingSystem,String screenType,float weight){
		this.screenSize=screenSize;
		this.operatingSystem=operatingSystem;
		this.screenType=screenType;
		this.weight=weight;
		}
		}
		
	