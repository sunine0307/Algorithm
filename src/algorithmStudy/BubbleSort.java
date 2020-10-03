package algorithmStudy;
import java.util.Scanner;

public class BubbleSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	
	//�� Ƚ���� ������ �� �ٲ� ���� ���ٸ� �״�� �����Ŵ
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
	//���� �������� �ٲ���� ������ ������.
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
		
		System.out.println("��������(����1)");
		System.out.print("��Ҽ�:");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("x["+ i +"]:");
			x[i]=sc.nextInt();
		}
		
		bubbleSort(x,nx);
		
		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x["+ i +"]="+x[i]);
		}
		
	}
	//�ܼ� ���� ����
	/*
	 * static void selectionSort(int[] a,int n) { for (int i = 0; i < n-1; i++) {
	 * int min = i; ���� ���ĵ��� ���� �κ��� ���� ���� �ε���, 0���� n-1���� ���Ľ�Ŵ if (a[j]<a[min]) {
	 * min=j; } swap(a, j, min); } }
	 */

}
