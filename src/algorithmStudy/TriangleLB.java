package algorithmStudy;
import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n; 
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		
		do {
			System.out.println("�� �� �ﰢ���ΰ���?");
			n = sc.nextInt();
		} while (n<=0); 
			
		for (int i = 1; i <=n ; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {									
			for (int j = 1; j <= i - 1; j++) {			
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i + 1; j++) {		
				System.out.print("*"); 				
			}
			System.out.println();						
		}
		sc.close();
		
	}
}
