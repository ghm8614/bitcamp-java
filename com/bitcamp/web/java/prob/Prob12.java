class Prob12 
{

	//Method 
	public void calc(int[] ix){

		int sumEven=0;
		int sumOdd=0;

		for (int i = 0; i<ix.length; i++)
		{
			if (ix[i] % 2 ==1)	// 2·Î ³ª´« ³ª¸ÓÁö°¡ 1ÀÌ¸é
			{
				sumOdd += ix[i];	// È¦¼ö
			}else{
				sumEven += ix[i];	// Â¦¼ö
			}
		}

		System.out.println("È¦¼öÀÇ ÇÕ : "+ sumOdd);
		System.out.println("Â¦¼öÀÇ ÇÕ : "+ sumEven);
	}

	//Main
	public static void main(String[] args) 
	{
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10};
		int[] ib = new int[]{1,2,3,4,5};

		Prob12 p = new Prob12();
		System.out.println("¹è¿­ ia");
		p.calc(ia);
		System.out.println("¹è¿­ ib");
		p.calc(ib);

	}
}
