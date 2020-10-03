package algorithmStudy;
import java.util.Arrays;
import java.util.Scanner;

public class BaekJooon11728 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int[] arr1 = new int[num1];
		int[] arr2 = new int[num2];
		String result = "";
		int[] result2 = new int[num1+num2];
		for (int i = 0; i < num1; i++) {
			arr1[i]=sc.nextInt();
			result+=Integer.toString(arr1[i]);
		}
		for (int i = 0; i < num2; i++) {
			 arr2[i]=sc.nextInt(); 
			 result+=Integer.toString(arr2[i]);
		}
		System.out.println(result);
		for (int i = 0; i < num1+num2; i++) {
			
			result2[i] = result.charAt(i)-48;
		} 
		Arrays.sort(result2);
		for (int i = 0; i < result2.length; i++) {
			System.out.print(result2[i]);
		}
		sc.close();
		
		
		/*
		 * TreeSet tSet = new TreeSet();
		 * 
		 * 
		 * for(int i = 0; i<Array.length;i++) {
		 * 
		 * tSet.add(Array[i]);
		 * 
		 * }
		 * 
		 * Iterator it = tSet.iterator();
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 * has next는 뒤에값이 있는지 없는지...! 
		 */
	}
}
