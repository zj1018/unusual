package unusual;

public class Person {
	private String name="1212";
	private int age=0;
	private String sex="��";
	//�����쳣
	public void setSex(String sex)throws Exception {				 
		   	 if("��".equals(sex)||"Ů".equals(sex)) {
		   		 this.sex=sex;
		   	 }else {
		   		 //�׳��쳣
		   		 throw new Exception("�Ա���\"��\"����\"Ů\"!");
		   	 }
		}
//	public void setAge(int age) throws Exception {
//		try {
//			if(age>1||age<110) {
//				throw new Exception("������\"1\"����\"100\"!");
//			}
//		}catch(Exception a) {
//			a.printStackTrace();
//			
//		}
//	}
	}
