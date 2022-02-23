class Employee 
{	

	//Field
	private String name;
	private int age;
	private String dept;

	//Constructor
	public Employee(String name,int age, String dept){
		this.name= name;
		this.age=age;
		this.dept=dept;
	}

	//Method

	//getter/setter mothod
	public void setName(String name){
		this.name= name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age= age;
	}

	public int getAge(){
		return age;
	}

	public void setId(String dept){
		this.dept= dept;
	}

	public String getDept(){
		return dept;
	}

	// print method
	public void print(){
		System.out.println("이름 : "+getName()+"  나이: "+getAge()+"   부서 : "+getDept());
	}

	

}
