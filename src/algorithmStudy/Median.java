package algorithmStudy;
import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.println("ù ��°�� �Է� ���� ��:");
		int a = sc.nextInt();
		System.out.println("�� ��°�� �Է� ���� ��:");
		int b = sc.nextInt();
		System.out.println("�� ��°�� �Է� ���� ��:");
		int c = sc.nextInt();
		
		
		System.out.println("�߾Ӱ��� : " + median(a,b,c));
	}
	
	static int median(int a, int b, int c) {
		
		if (a>=b) {
			if (c>=a) {
				return a;
			}
			else if (b>=c) {
				return b;
			}
			else return c;
		}
		else if (a>c) {
			return a;
		}
		else if (b>c) {
			return c;
		}
		else return b;
	}
}
