class Employee1 extends Human 
{
	//Field
	private String dept;

	//Constructor
	public Employee1(String name,int age, String dept){
		super(name,age);
		this.dept=dept;
	}

	//Method

	//getter/setter mothod
	public void setDept(String dept){
		this.dept= dept;
	}

	public String getDept(){
		return dept;
	}

	// print method overrding
	public void print(){
		System.out.println("이름 : "+getName()+"  나이: "+getAge()+"   부서 : "+getDept());
	}

}
