
public class pattern {

	public static void main(String[] args) {
	int n = 3;
	for(int i=1;i<n;i++)
	{
		 char c='a';
		for(int j=1;j<=(n-i);j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(c);
			c++;
		}
		c-=2;
		for(int l=1;l<i;l++)
		{
			System.out.print(c);
			c--;
		}
		System.out.println();
	}
	for(int i=n-1;i>=0;i--)
	{
		 char c='a';
		for(int j=2;j<=(n-i);j++)
		{
			System.out.print(" ");
		}	
		for(int l=0;l<=i;l++)
		{
			System.out.print(c);
			c++;
		}
		c-=2;
		for(int k=0;k<i;k++)
		{
			System.out.print(c);
			c--;
		}
		System.out.println();
	}
}
}