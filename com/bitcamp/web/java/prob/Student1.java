class Student1 extends Human
{	
	//Field
	private int id;

	//Constructor
	public Student1(String name, int age, int id){
		super(name,age);
		this.id = id;
	}


	//Method

	//getter/setter
	public void setId(int id){
		this.id= id;
	}

	public int getId(){
		return id;
	}

	// print method overriding
	public void print(){
		System.out.println("이름 : "+getName()+"  나이: "+getAge()+"   학번 : "+getId());
	}


}
