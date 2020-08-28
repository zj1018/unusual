package bank;

public class TestBank {
	public static void main(String[] args) {
		Bank b=new Bank(100);
		try {
			b.withDrawal(150);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}try {
			b.withDrawal(-15);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
