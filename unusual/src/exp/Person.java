package exp;

public class Person {
	private int age;
	public void setAge(int age)throws AgeException{
		try {
			if(age<=0||age>100) {
				throw new AgeException("����1-100֮��");
			}else {
				this.age=age;
			}
				
			}catch(Exception e){
				e.printStackTrace();
		}	
}
}