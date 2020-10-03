package algorithmStudy;
import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		int n = sc.nextInt();
		int count = 0 ;
		while (n!=0) {
			n/=10;
			count++;
		}
		
		System.out.println("그 숫자는 " + count +"자리입니다");
		
		
	}
		
	
	
	
}
