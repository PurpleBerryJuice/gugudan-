package pjtTest;

import java.util.Scanner;

public class gugudan {
	
	public static void main(String[] args) {
		int i ;
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
				break;
			}
		}
	}
}
