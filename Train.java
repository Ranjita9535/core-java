//Create 1 class , 5 variables -> 2 enums 1 should have string , 1 should have int , initialize the values using constructor

public class Train{
String inventedBy ;
String trainLength;
String trainResolution;
int noOfPassengers;

TrainColor color= TrainColor.BLACK;
NoOfCompartments noOfCompartments= NoOfCompartments.TEN;

public Train(String inventedBy,String trainLength,String trainResolution,int noOfPassengers){
	this.inventedBy= inventedBy;
	this.trainLength=trainLength;
	this.trainResolution=trainResolution;
	this.noOfPassengers=noOfPassengers;
}

public static void main(String[] args){
	
	Train train=new Train("Richard Trevithick","25 m","55 s",500);

	System.out.println(train.inventedBy);
	System.out.println(train.trainLength);
	System.out.println(train.trainResolution);
	System.out.println(train.noOfPassengers);
	System.out.println(train.color.getValue());
	System.out.println(train.noOfCompartments.getValue());
}


public String getInventedBy(){  //Get Method
	return inventedBy;
}
public String getTrainLength(){
	return trainLength;
}
public String getTrainResolution(){
	return trainResolution;
}
public int getNoOfPassengers(){
	return noOfPassengers;
}

}
enum TrainColor{             
	BLACK("black"), RED("red"),BLUE("blue");
	String value;
	TrainColor(String value) {
		this.value=value;
	}
	public String getValue(){
		return value;
	}
}
 enum NoOfCompartments{
	 TEN(10),NINE(9),EIGHT(8);
	 int value;
	 NoOfCompartments(int value){
		 this.value=value;
	 }
	 public int getValue(){
		return value;
	}
 }










