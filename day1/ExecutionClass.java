package week1.day1;

public class ExecutionClass {
public static void main(String[] args) {
	Mymobile mymobile =new Mymobile();
	FriendMobile friendmobile=new FriendMobile();
	
	mymobile.makeCalls();
	mymobile.typeMessage();
	
	friendmobile.makeTransaction();
	friendmobile.takePhotos();
}
	
}
