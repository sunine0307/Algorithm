package algorithmStudy;

import java.util.Scanner;

public class Teamlab1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("number: ");
		int x = sc.nextInt();
		System.out.println(solution(x));	
	}
	
	static int solution(int n) {
	      int answer = 0;
	      int[] add = new int[1000];
	      int j =0;
	      for(int i = 10000001; i < n+1; i++){
	          if(n % i == 0) {
	        	  j++;
	        	  add[j]=i;
	        	  System.out.println(add[j]);
	              answer += i;
	          }
	      }

	      return answer;
	  }
}
