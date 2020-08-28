package exp;

public class Person {
	private int age;
	public void setAge(int age)throws AgeException{
		try {
			if(age<=0||age>100) {
				throw new AgeException("ƒÍ¡‰1-100÷Æº‰");
			}else {
				this.age=age;
			}
				
			}catch(Exception e){
				e.printStackTrace();
		}	
}
}