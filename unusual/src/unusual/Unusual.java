package unusual;
//�쳣
import java.util.InputMismatchException;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Unusual {
	private static Logger log=Logger.getLogger
			(Unusual.class.getName());
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("�����뱻����");
		log.debug("�����뱻����");
//		if(in.hasNextInt()) {
		try {
			int numOne = in.nextInt();
//			System.out.println("���������");
			log.debug("���������");
			int numTwo = in.nextInt();
//			System.out.println(String.format("%d / %d=%d",
//					numOne, numTwo, numOne / numTwo));
			log.debug(String.format("%d / %d=%d",
					numOne, numTwo, numOne / numTwo));

			// ���catch��ʱ���쳣�Ǵ�С�������ൽ���ࣩ
			// input���� �� matchƥ��
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("��������");
//			return;
			   //��������
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
//			System.out.println("��лʹ��");
			log.debug("��лʹ��");
		}

//		if(in.nextInt()==0) {
//			System.out.println("��������Ϊ0");
//			
//			//ǿ��ͣ��JVM
//			System.exit(0);
//			
//		}

//		}else {
//			System.out.println("��������");
//		}
	}

}
