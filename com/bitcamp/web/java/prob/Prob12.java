class Prob12 
{

	//Method 
	public void calc(int[] ix){

		int sumEven=0;
		int sumOdd=0;

		for (int i = 0; i<ix.length; i++)
		{
			if (ix[i] % 2 ==1)	// 2�� ���� �������� 1�̸�
			{
				sumOdd += ix[i];	// Ȧ��
			}else{
				sumEven += ix[i];	// ¦��
			}
		}

		System.out.println("Ȧ���� �� : "+ sumOdd);
		System.out.println("¦���� �� : "+ sumEven);
	}

	//Main
	public static void main(String[] args) 
	{
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10};
		int[] ib = new int[]{1,2,3,4,5};

		Prob12 p = new Prob12();
		System.out.println("�迭 ia");
		p.calc(ia);
		System.out.println("�迭 ib");
		p.calc(ib);

	}
}
