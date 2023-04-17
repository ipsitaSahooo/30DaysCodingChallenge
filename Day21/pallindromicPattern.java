public class pallindromicPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=(5-i);s++)
			{
				System.out.print(" ");
			}
			//first half
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

