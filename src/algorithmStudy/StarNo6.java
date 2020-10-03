package algorithmStudy;
import java.util.Scanner;

public class StarNo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요 : ");
		int n = sc.nextInt();
		/*
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j < 5; j++) {
		 * System.out.println("*"); } for (int j = 0; j < 5; j++) {
		 * System.out.println(" "); System.out.println(); }
		 * 
		 * } for(int i = 1; i <= n ; i++) { for(int j = 0; j < n-i; j++)
		 * System.out.print(" "); for(int j = 0; j < i*2-1; j++) System.out.print("*");
		 * System.out.println(); } for(int i = n-1; i >= 0 ; i--) { for(int j = 1; j <
		 * n-i; j++) System.out.print(" "); for(int j = 0; j < i*2-1; j++)
		 * System.out.print("*"); System.out.println();
		 * 
		 * }
		 * 
		 * for(int i = 1; i <= n ; i++) { for(int j = 0; j < n-i; j++)
		 * System.out.print(" "); for(int j = 0; j < i*2-1; j++) System.out.print("*");
		 * System.out.println(); }
		 * 
		 * for(int i = n-1; i >= 0 ; i--) { for(int j = 0; j < n-i; j++)
		 * System.out.print(" "); for(int j = 0; j < i*2-1; j++) System.out.print("*");
		 * System.out.println(); }
		 */
		/*
		 * for(int i = n-1; i >= 0 ; i--) { for(int j = 0; j < n-i; j++) {
		 * System.out.print(" "); } for(int j = 0; j < i*2-1; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		
		
		/*
		 * for(int i = 1; i <= n ; i++) { for(int j = 0; j < n-i; j++)
		 * System.out.print(" "); for(int j = 0; j < i*2-1; j++) System.out.print("*");
		 * 
		 * 
		 * System.out.println(); }
		 */
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
				
			}
			for (int k = (n-i)*2-1; k >0  ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < n-1; i++) {
			for (int j = n-i-2; j >0 ; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i+1)*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
		
}
