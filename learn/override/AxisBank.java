package learn.override;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("This is Axis Bank deposit Account");
	}

	public static void main(String[] args) {
		AxisBank axis= new AxisBank();
		axis.deposit();
	}

}
