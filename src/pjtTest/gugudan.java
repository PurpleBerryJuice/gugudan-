package pjtTest;

import java.util.Scanner;

public class gugudan {
	
	public static void main(String[] args) {
		/*int i ;
		int j;
		int how;
		while(true)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("���ϴ� ���� �Է��Ͻÿ�:");
			i = scanner.nextInt();
			for(j = 1; j <11 ; j ++)
			{
				System.out.printf("%d * %d = %d\n" , i , j , i*j);
			}
			System.out.println("���α׷��� �����Ͻðڽ��ϱ�?");
			System.out.println("1.��  2.�ƴϿ�");
			how = scanner.nextInt();
			if(how == 1)
			{
				System.out.println("===���α׷��� ����Ǿ����ϴ�===");
				scanner.close();				
				break;
				
			}
			
		} */
		
		
	
	// �迭�� �̿��Ͽ� ������ ������� ������ ����� ���� ����ϴ� �ڵ� 
		
		int i; //���� ��
		int [] result = new int[9]; // i �� �� ������� ������  i����� �迭
		Scanner scan = new Scanner(System.in);
		System.out.println("���ϴ� ���� �Է��ϼ��� :");
		i = scan.nextInt();
		int j;
		int length = result.length ; 
		
		for(j = 1; j < length+1 ; j++)
		{
			result[j-1] = i*j;
		
		}
		for(j=0;j<result.length ; j++)
		{
			System.out.printf("%d * %d = %d\n" , i , j+1 , result[j]);
		}
		scan.close();
	}
	
}
