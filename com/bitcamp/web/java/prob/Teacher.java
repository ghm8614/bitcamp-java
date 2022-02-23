class Teacher
{
	//Field
	private String name;
	private int age;
	private String subject;

	//Constructor
	public Teacher(String name,int age, String subject){
		this.name = name;
		this.age=age;
		this.subject=subject;
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

	public void setSubject(String subject){
		this.subject= subject;
	}

	public String getSubject(){
		return subject;
	}

	// print method
	public void print(){
		System.out.println("이름 : "+getName()+"  나이: "+getAge()+"   학번 : "+getSubject());
	}



}
