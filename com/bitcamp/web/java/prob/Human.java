class Human 
{
	//Field
	private String name;
	private int age;

	//Constructor
	public Human(String name,int age){
		this.name=name;
		this.age = age;
	}

	//Method
	//getter/setter
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


	//print
	public void print(){
		System.out.println("이름 : "+getName()+"  나이: "+getAge());
	}


}
