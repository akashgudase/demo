class Demo 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i < 10; i++)
		{
			if(i == 1 || i == 5 || i == 9)
			{
				for(int j = 1; j <= 10; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			else if(i <= 5)
			{
				System.out.println("*");
			}
			else
			{
				for(int k = 1; k <= 10; k++)
				{
					if(k == 10)
					{
						System.out.println("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
		}
	}
}
