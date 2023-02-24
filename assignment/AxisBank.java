package week5.assignment;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Deposit Amount ");
	}
	public static void main(String[] args) {
		AxisBank details=new AxisBank();
		details.deposit();
		details.fixed();
		details.saving();
	}
}
