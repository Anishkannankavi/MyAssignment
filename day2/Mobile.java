package week1.day2;

public class Mobile {
	
	String mobileBrandName="Realme";
	char mobileLogo='R';
	short noOfMobilePiece=20;
	int modelNumber=1901;
	long mobileImeiNumber=112478965221435L;
	float mobilePrice=18000f;
	boolean isDamaged =false; 
	
public static void main(String[] args) {
	Mobile mbl=new Mobile();
	System.out.println("Mobile Brand Name = "+ mbl.mobileBrandName);
	System.out.println("Mobile Logo = "+mbl.mobileLogo);
	System.out.println("No of Mobile Piece = "+mbl.noOfMobilePiece);
	System.out.println("Model Number = "+mbl.modelNumber);
	System.out.println("Mobile IMEI Number = "+mbl.mobileImeiNumber);
	System.out.println("Mobile Price = "+mbl.mobilePrice);
	System.out.println("Is mobile damaged = "+mbl.isDamaged);
}

}


