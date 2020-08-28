package bank;
//子类，继承了bank的Exception
public class NagativeFundsException extends Exception {
	
	
	public String getMessage() {
		System.out.println("返回的值");
		return "取款数不能为负数";
	}

}
