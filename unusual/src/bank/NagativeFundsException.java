package bank;
//���࣬�̳���bank��Exception
public class NagativeFundsException extends Exception {
	
	
	public String getMessage() {
		System.out.println("���ص�ֵ");
		return "ȡ��������Ϊ����";
	}

}
