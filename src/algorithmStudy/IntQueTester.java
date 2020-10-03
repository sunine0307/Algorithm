package algorithmStudy;
import java.util.Scanner;

public class IntQueTester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		IntQue s = new IntQue(64);
		
		while (true) {
			System.out.println("���� ������ ��: " + s.size()+"/" + s.capacity());
			System.out.print("(1)��ť (2)��ť(3)��ũ(4)����(0)");
			
			int menu =sc.nextInt();
			if (menu==0) {
				break;
			}
			int x;
			switch (menu) {
			case 1:
				System.out.print("������ : ");
				x=sc.nextInt();
				try {
					s.enque(x);
				} catch (IntQue.OverFlowIntQueException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;
			case 2:
				try {
					x=s.deque();
				} catch (IntQue.EmptyIntQueException e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				break;
			case 3:
				try {
					x=s.peek();
					System.out.println("��ũ�� �����ʹ� "+x+"�Դϴ�.");
				} catch (IntQue.EmptyIntQueException e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				break;
			case 4:
				s.dump();
				break;

			default:
				break;
			}
		}
		
	}
	
}
