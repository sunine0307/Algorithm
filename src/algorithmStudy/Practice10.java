package algorithmStudy;
import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���: ");
		int n = sc.nextInt();
		int count = 0 ;
		while (n!=0) {
			n/=10;
			count++;
		}
		
		System.out.println("�� ���ڴ� " + count +"�ڸ��Դϴ�");
		
		
	}
		
	
	
	
}
