package algorithmStudy;
import java.util.Scanner;

public class IntQueTester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		IntQue s = new IntQue(64);
		
		while (true) {
			System.out.println("현재 데이터 수: " + s.size()+"/" + s.capacity());
			System.out.print("(1)인큐 (2)디큐(3)피크(4)덤프(0)");
			
			int menu =sc.nextInt();
			if (menu==0) {
				break;
			}
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x=sc.nextInt();
				try {
					s.enque(x);
				} catch (IntQue.OverFlowIntQueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x=s.deque();
				} catch (IntQue.EmptyIntQueException e) {
					System.out.println("큐가 비어있습니다.");
				}
				break;
			case 3:
				try {
					x=s.peek();
					System.out.println("피크한 데이터는 "+x+"입니다.");
				} catch (IntQue.EmptyIntQueException e) {
					System.out.println("큐가 비어있습니다.");
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
