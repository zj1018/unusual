package unusual;

public class Person {
	private String name="1212";
	private int age=0;
	private String sex="男";
	//声明异常
	public void setSex(String sex)throws Exception {				 
		   	 if("男".equals(sex)||"女".equals(sex)) {
		   		 this.sex=sex;
		   	 }else {
		   		 //抛出异常
		   		 throw new Exception("性别是\"男\"或者\"女\"!");
		   	 }
		}
//	public void setAge(int age) throws Exception {
//		try {
//			if(age>1||age<110) {
//				throw new Exception("年龄是\"1\"或者\"100\"!");
//			}
//		}catch(Exception a) {
//			a.printStackTrace();
//			
//		}
//	}
	}
