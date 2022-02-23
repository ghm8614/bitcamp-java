class Account 
{
	//Field
	String accNo;
	int balance;

	//Constructor

	//�⺻������ �ݵ�� ���������ϳ�?
	public Account(){
	}

	public Account(String accNo){
		this.accNo = accNo;
		System.out.println(accNo+" ���°� �����Ǿ����ϴ�.");
	}

	//Method
	public void save(int money){
		balance += money;
		System.out.println(accNo+ " ���¿� "+ money +"������ �Ա޵Ǿ����ϴ�.");
	}

	public void withdraw(int money){
		balance -= money;
		System.out.println(accNo+ " ���¿� "+ money +"������ ��ݵǾ����ϴ�.");
	}

	public int getBalance(){
		return balance;
	}	

	public String getAccNo(){
		return accNo;
	}	

}
