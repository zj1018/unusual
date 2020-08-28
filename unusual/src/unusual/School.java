package unusual;

import java.util.InputMismatchException;
import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		try {
			System.out.println("请输入1~3之间任意数字");
			int op=in.nextInt();
		switch(op) {
		case 1:
			System.out.println("java课程");
			break;
		case 2:
			System.out.println("Html课程");
			break;
		case 3:
			System.out.println("大数据");
			break;
		default:
			System.out.println("没有这个课程");
		}
		//Exception e
		//输入不匹配
		}catch(InputMismatchException e) {
			//打印异常堆栈信息
			//e.printStackTrace();
			
			System.out.println("输入错误，请输入数字");
		}
		finally {
			System.out.println("欢迎提出建议");
		}
	}

}
