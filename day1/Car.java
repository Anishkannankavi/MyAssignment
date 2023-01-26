package week1.day1;

public class Car {
		
		public void applyBreak() {
		    System.out.println("Apply the break");			
		}
		public void applyGear() {
		    System.out.println("Apply the gear");			
		}
		public void switchOnAc() {
			System.out.println("Switch on the AC");
		}
		public void applyAcclerate() {
			System.out.println("Apply the acclerate");
			
		}
		public static void main(String[] args) {
			Car obj=new Car();
			obj.applyBreak();
			obj.applyGear();
			obj.switchOnAc();
			obj.applyAcclerate();
		}

}
