package algorithmStudy;
import java.util.Scanner;

public class Hanoi {
	static void move(int no, int x, int y) {
		if (no>1) {
			move(no-1, x , 6-x-y);
		}
		System.out.println("원반["+no+"]을"+x+"기둥에서"+y+"기둥으로 옮김");
		if (no>1) {
			move(no-1,6-x-y,y);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("하노이의탑");
		System.out.print("원반의 개수:");
		int n = sc.nextInt();
		
		move(n,1,3);
	}
}
