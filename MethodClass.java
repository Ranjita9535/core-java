public class MethodClass{
	
	public static void main(String[]args){
	add();
	sub();
	mul();
	div();
	mod();
    }
	
	public static void add(){
    int[] noOfRooms = {1,2,3,4,5};
	for(int i=0;i<noOfRooms.length;i++){
		System.out.println(noOfRooms[i]);
	}
	}
	
	public static void sub(){
	float[] tempOfBody = new float[5];
    tempOfBody [0]= 27.0f;
	tempOfBody [1]= 22.6f;
    tempOfBody [2]= 21.3f;
	tempOfBody [3]= 37.6f;
	tempOfBody [4]= 41.8f;
	for(int i=0;i<tempOfBody.length;i++){
		System.out.println(tempOfBody[i]);
	}
	}
	public static void mul(){
    long[] mobileNumber= new long[5];
	mobileNumber [0]=1234567899l;
    mobileNumber [1]=6574897643l;
	mobileNumber [2]=2394637486l;
	mobileNumber [3]=4075392873l;
	mobileNumber [4]=5036273582l;
	for(int i=0;i<mobileNumber.length;i++){
		System.out.println(mobileNumber[i]);
	}
	}
	public static void div(){
	byte[] pulseRate = new byte[5];
    pulseRate [0]= 45;
	pulseRate [1]= 39;
    pulseRate [2]= 50;
	pulseRate [3]= 46;
	pulseRate [4]= 42;
	for(int i=0;i<pulseRate.length;i++){
		System.out.println(pulseRate[i]);
	}
	}
	public static void mod(){
	char[] partsOfBody = new char[5];
	partsOfBody [0] = 'B';
	partsOfBody [1] = 'H';
	partsOfBody [2] = 'L';
	partsOfBody [3] = 'E';
	partsOfBody [4] = 'L';
	for(int i=0;i<partsOfBody.length;i++){
		System.out.println(partsOfBody[i]);
	}
	}
	}
	
	
	
	
	
	