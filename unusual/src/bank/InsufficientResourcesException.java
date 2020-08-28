package bank;

public class InsufficientResourcesException 
   extends Exception{

	public String getMessage() {
		System.out.println("返回的值");
		return "余额不足";
	}

}
