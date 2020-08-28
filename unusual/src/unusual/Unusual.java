package unusual;
//异常
import java.util.InputMismatchException;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Unusual {
	private static Logger log=Logger.getLogger
			(Unusual.class.getName());
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("请输入被除数");
		log.debug("请输入被除数");
//		if(in.hasNextInt()) {
		try {
			int numOne = in.nextInt();
//			System.out.println("请输入除数");
			log.debug("请输入除数");
			int numTwo = in.nextInt();
//			System.out.println(String.format("%d / %d=%d",
//					numOne, numTwo, numOne / numTwo));
			log.debug(String.format("%d / %d=%d",
					numOne, numTwo, numOne / numTwo));

			// 多个catch块时：异常是从小到大（子类到父类）
			// input输入 不 match匹配
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("输入数字");
//			return;
			   //算数例外
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
//			System.out.println("感谢使用");
			log.debug("感谢使用");
		}

//		if(in.nextInt()==0) {
//			System.out.println("除数不能为0");
//			
//			//强制停掉JVM
//			System.exit(0);
//			
//		}

//		}else {
//			System.out.println("输入数字");
//		}
	}

}
