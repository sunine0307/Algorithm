package algorithmStudy;
import java.util.Scanner;

public class IntStackTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IntStack s = new IntStack(64);
		while (true) {
			System.out.println("���絥���� �� :" + s.size() + "/" + s.capacity());
			System.out.println("(1)Ǫ�� (2)�� (3)��ũ (4)���� (5)����");
			int menu = sc.nextInt();
			if (menu == 0) {
				break;
			}
			int x;
			switch (menu) {
			case 1:
				System.out.print("������: ");
				x=sc.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverFlowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			case 2:
				try {
					x=s.pop();
					System.out.println("���� �����ʹ� " + x +"�Դϴ�");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			case 3:
				try {
					x=s.peek();
					System.out.println("��ũ�� ����Ÿ��" + x+ "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				
				break;

			default:
				break;
			}
			}
		}
	}

