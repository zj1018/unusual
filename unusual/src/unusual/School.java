package unusual;

import java.util.InputMismatchException;
import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		try {
			System.out.println("������1~3֮����������");
			int op=in.nextInt();
		switch(op) {
		case 1:
			System.out.println("java�γ�");
			break;
		case 2:
			System.out.println("Html�γ�");
			break;
		case 3:
			System.out.println("������");
			break;
		default:
			System.out.println("û������γ�");
		}
		//Exception e
		//���벻ƥ��
		}catch(InputMismatchException e) {
			//��ӡ�쳣��ջ��Ϣ
			//e.printStackTrace();
			
			System.out.println("�����������������");
		}
		finally {
			System.out.println("��ӭ�������");
		}
	}

}
