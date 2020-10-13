package algorithmStudy;

import java.util.Arrays;

public class ArrayMethodTest {
	public static void main(String[] args) {
		String[] arr = new String[5];
		arr[0]="1";
		arr[1]="2";
		arr[2]="3";
		arr[3]="4";
		arr[4]="5";
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int answer = Arrays.asList(arr).indexOf("5");
		System.out.println(answer);
	}
	}
	
