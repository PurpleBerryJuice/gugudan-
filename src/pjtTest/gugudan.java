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
				scanner.close();				
				break;
				
			}
			
		} */
		
		
	
	// 배열을 이용하여 구구단 결과값을 저장후 저장된 값을 출력하는 코드 
		
		int i; //변수 단
		int [] result = new int[9]; // i 단 의 결과값을 저장할  i결과값 배열
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 단을 입력하세요 :");
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
