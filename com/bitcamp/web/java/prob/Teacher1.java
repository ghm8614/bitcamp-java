class Teacher1 extends Human
{
	//Field
	private String subject;

	//Constructor
	public Teacher1(String name,int age, String subject){
		super(name,age);
		this.subject=subject;
	}

	//Method

	//getter/setter mothod
	public void setSubject(String subject){
		this.subject= subject;
	}

	public String getSubject(){
		return subject;
	}

	// print method overridng
	public void print(){
		System.out.println("이름 : "+getName()+"  나이: "+getAge()+"   담당과목 : "+getSubject());
	}


}
