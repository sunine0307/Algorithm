package algorithmStudy;
import java.util.Scanner;

public class Gauss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ֽñ� �ٶ��ϴ� : ");
		int n = sc.nextInt();
		
		System.out.println("���콺 ������ ����� " + gauss(n));
	}
	
	static int gauss(int k) {
		int sum = (1+k)*k/2;
		
		return sum;
	}
}
