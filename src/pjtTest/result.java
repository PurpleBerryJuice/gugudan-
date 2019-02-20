package pjtTest;

public class result {

	int i;
	int j;
	int r;
	public result()
	{
		System.out.println("=====result 메소드가 실행됩니다 =====");
	}
	public void R1(int i)
	{
		this.i = i;
		
		for(this.r=0 ; this.r<i ; this.r++)
		{
			System.out.printf("%d * %d = %d\n" , r+1 , r+1 , (r+1)*(r+1));
		}
		
	}
	public void R2(int first , int second)
	{
		this.i = first;
		this.j = second;
		
		for(this.r=1 ; this.r <j+1 ; this.r ++)
		{
			System.out.printf("%d*%d = %d\n" , i ,r  , i*r);
		}
		
	}
}
