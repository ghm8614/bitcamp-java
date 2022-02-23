class Student 
{	
	//Field
	private String name;
	private int age;
	private int id;

	//Constructor
	public Student(String name, int age, int id){
		this.name = name;
		this.age = age;
		this.id = id;
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

	public void setId(int id){
		this.id= id;
	}

	public int getId(){
		return id;
	}

	// print method
	public void print(){
		System.out.println("이름 : "+getName()+"  나이: "+getAge()+"   학번 : "+getId());
	}


}
