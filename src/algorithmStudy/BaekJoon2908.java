package algorithmStudy;
import java.util.Scanner;

public class BaekJoon2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] num = sc.nextLine().split(" ");
	
		int[] result = new int[num.length];
		
		for (int i = 0; i < num.length; i++) {
			String reversedNum="";
			for (int j = 0; j <num[i].length() ; j++) {
				reversedNum += num[i].charAt(num[i].length()-j-1);
			}
			result[i]=Integer.parseInt(reversedNum);
		}
		if (result[0] < result[1]) {
			System.out.println(result[1]);
		}
		if (result[0] > result[1]) {
			System.out.println(result[0]);
		}
		sc.close();
	}
}
