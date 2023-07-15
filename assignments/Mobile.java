package week1.day1.assignments;

public class Mobile {
	public void makeCall(String mobileModel,Float mobileWeight )
	
	{
		
		System.out.println("MobileModel: "+mobileModel+" Mobileweight: "+mobileWeight);
	}
public void sendMsg(boolean isFullCharged,int mobileCost)
	{
	
		System.out.println("isFullCharged: "+isFullCharged+" MobileCost: "+mobileCost);
	}
public static void main(String[] args) {
	Mobile mob=new Mobile();
	System.out.println("This is my Mobile");
	mob.makeCall("Samsung",0.5f);
	mob.sendMsg(true,53000);
}
	
}

