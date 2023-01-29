package week1.day2;

public class TwoWheeler {
	  
	  String bikeName="RE Meteor 350";
	  int noOfWheels=2;
	  short noOfMirrors=2;
	  long chassisNumber=646372819l;
	  boolean isPunctured=false;	  
	  double runningKM=6000;
	  
  public static void main(String[] args) {
	  TwoWheeler bike = new TwoWheeler();
	  System.out.println("No. of. Wheels : "+bike.noOfWheels);
	  System.out.println("No. of. Mirrors : "+bike.noOfMirrors);
	  System.out.println("Chassis Number : "+bike.chassisNumber);
	  System.out.println("Is the two wheeler punctured : "+bike.isPunctured);
	  System.out.println("Bike Name : "+bike.bikeName);
	  System.out.println("Running KM : "+bike.runningKM);

}

}
