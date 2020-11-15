package algorithmStudy;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EuclidGCD {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] a = new int[100000];
		int j = 0;
		for (int i = 0; i < x; i++) {
			if (x/i == 0) {
				a[j++] = i;
			}
			
		}
		for (int i = 0; i < j; i++) {
			System.out.println(a[i]);
		}
		
	}
}
