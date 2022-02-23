class TestAccount 
{

	public static void main(String[] args) 
	{
		String accNo = null;
		int balance = 0;

		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo + "계좌의 잔고는 "+balance+"만원입니다.");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accObj.getAccNo() + "계좌의 잔고는 "+balance+"만원입니다.");

		accObj.withdraw(30);
		balance = accObj.getBalance();
		System.out.println(accNo+ "계좌의 잔고는 "+balance+"만원입니다.");

		// accObj.getAccNo() 와 accNo 는 뭐가 다른가..?
		// 인스턴스에 접근해서 getter로 accNo 가져오는것과 그냥 필드에서 가져오는 것 차이

	}
}
