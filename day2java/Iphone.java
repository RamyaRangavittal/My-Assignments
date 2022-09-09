package week3.day2java;

public class Iphone implements Mobile {
	

	public void sendSms() {
		System.out.println("sendsms");
	
	}

	public void dialNumber() {
		System.out.println("dial no");
		
	}

	public void switchOn() {
		System.out.println("switch on");
		
	}
	
	public static void main(String[] args) {
		Iphone ph=new Iphone();
		ph.sendSms();
		ph.dialNumber();		
		ph.switchOn();
	}
	

}
