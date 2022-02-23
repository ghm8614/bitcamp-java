class Account 
{
	//Field
	String accNo;
	int balance;

	//Constructor

	//기본생성자 반드시 만들어줘야하나?
	public Account(){
	}

	public Account(String accNo){
		this.accNo = accNo;
		System.out.println(accNo+" 계좌가 개설되었습니다.");
	}

	//Method
	public void save(int money){
		balance += money;
		System.out.println(accNo+ " 계좌에 "+ money +"만원이 입급되었습니다.");
	}

	public void withdraw(int money){
		balance -= money;
		System.out.println(accNo+ " 계좌에 "+ money +"만원이 출금되었습니다.");
	}

	public int getBalance(){
		return balance;
	}	

	public String getAccNo(){
		return accNo;
	}	

}
