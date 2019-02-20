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
			System.out.println("원하는 단을 입력하시오:");
			i = scanner.nextInt();
			for(j = 1; j <11 ; j ++)
			{
				System.out.printf("%d * %d = %d\n" , i , j , i*j);
			}
			System.out.println("프로그램을 종료하시겠습니까?");
			System.out.println("1.예  2.아니요");
			how = scanner.nextInt();
			if(how == 1)
			{
				System.out.println("===프로그램이 종료되었습니다===");
				break;
			}
		}
	}
}
