class TestAccount 
{

	public static void main(String[] args) 
	{
		String accNo = null;
		int balance = 0;

		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo + "������ �ܰ�� "+balance+"�����Դϴ�.");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accObj.getAccNo() + "������ �ܰ�� "+balance+"�����Դϴ�.");

		accObj.withdraw(30);
		balance = accObj.getBalance();
		System.out.println(accNo+ "������ �ܰ�� "+balance+"�����Դϴ�.");

		// accObj.getAccNo() �� accNo �� ���� �ٸ���..?
		// �ν��Ͻ��� �����ؼ� getter�� accNo �������°Ͱ� �׳� �ʵ忡�� �������� �� ����

	}
}
