package week3.day1java;

public class AxisBank extends BankInf {
	public void deposit() {
		super.deposit();
		System.out.println("Axis Deposit");
		
		
	}
	public static void main(String[] args)
	{
		AxisBank bank=new AxisBank();
		bank.deposit();
	
	}
}
