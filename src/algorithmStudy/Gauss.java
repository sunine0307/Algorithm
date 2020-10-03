package algorithmStudy;
import java.util.Scanner;

public class Gauss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주시기 바랍니다 : ");
		int n = sc.nextInt();
		
		System.out.println("가우스 덧샘의 결과는 " + gauss(n));
	}
	
	static int gauss(int k) {
		int sum = (1+k)*k/2;
		
		return sum;
	}
}
