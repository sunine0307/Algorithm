package algorithmStudy;

import java.util.Arrays;

import java.util.LinkedList;
import java.util.Queue;


public class Practice1019 {
	
	
	public static void main(String[] args) {
		Queue<String> qu = new LinkedList<String>();
		int[] testArray = new int[5];
		testArray[0]=3;
		testArray[1]=2;
		testArray[2]=1;
		testArray[3]=5;
		testArray[4]=4;
		for (int i = 0; i < testArray.length; i++) {
			System.out.println(testArray[i]);
		}
		Arrays.sort(testArray);
		int[] tempArray = new int[5];
		int j = 0;
		for (int i = testArray.length-1; i >= 0; i--) {
			tempArray[j++]=testArray[i];
		}
		
		for (int i = 0; i < tempArray.length; i++) {
			System.out.println(tempArray[i]);
		}
		
		
		String str = "¾È³çÇÏ¼¼¿ä";
		String str1 = "";
		for (int i = str.length()-1; i >=0 ; i--) {
			str1 += str.charAt(i);
		}
		String strNum = "12345";
		int a = Integer.parseInt(strNum);
		System.out.println(a+1);
		int num =12345;
		String strStr = Integer.toString(num)+"1";
		System.out.println(strStr);
		int mathTest = Math.min(12345, 1234);
		System.out.println(mathTest);
		System.out.println(strNum.startsWith("123"));
		
		
		
	
 	}
}
