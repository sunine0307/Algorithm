package algorithmStudy;
import java.util.Scanner;

public class BubbleSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	
	//한 횟수가 끝났을 때 바뀐 것이 없다면 그대로 종료시킴
	//static void bubbleSort(int[] a,int n) {
		//for (int i = 0; i < n-1; i++) {
			//int exg=0;
			//for (int j = n-1; j > i; j--) {
				//if (a[j-1]>a[j]) {
					//swap(a, j-1, j);
					//exg++;
				//}
			//}
	//if (exg==0) {
	//		break;
	//	}
	//}
	//}
	//가장 마지막에 바뀌었던 구간을 저장함.
	static void bubbleSort(int[] a,int n) {
		int k =0;
		while (k<n-1) {
			int last = n-1;
			for (int i = 0; i < n-1; i++) {
				for (int j = n-1; j >k ; j--) {
					if (a[i-1]>a[i]) {
						swap(a,j-1,i);
						last=j;
					}
					
				}
				k=last;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블정렬(버전1)");
		System.out.print("요소수:");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("x["+ i +"]:");
			x[i]=sc.nextInt();
		}
		
		bubbleSort(x,nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x["+ i +"]="+x[i]);
		}
		
	}
	//단순 선택 정렬
	/*
	 * static void selectionSort(int[] a,int n) { for (int i = 0; i < n-1; i++) {
	 * int min = i; 아직 정렬되지 않은 부분의 가장 작은 인덱스, 0부터 n-1까지 정렬시킴 if (a[j]<a[min]) {
	 * min=j; } swap(a, j, min); } }
	 */

}
