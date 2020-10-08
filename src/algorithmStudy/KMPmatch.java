package algorithmStudy;

import java.util.Scanner;

public class KMPmatch {
	static int kmpMatch(String txt, String pat) {
		int pt = 1;
		int pp = 0;
		int[] skip = new int[pat.length()+1];
		skip[pt]=0;
		while (pt!=pat.length()) {
			if (pat.charAt(pt)==pat.charAt(pp)) {
				skip[++pt]=++pp;
			}else if(pp==0) {
				skip[++pt]=pp;
			}else {
				pp=skip[pp];
			}
			
		}
		pt=pp=0;
		while (pt != txt.length() && pp!=pat.length()) {
			if (txt.charAt(pt)==pat.charAt(pp)) {
				pt++;
				pp++;
			}else if (pp==0) {
				pt++;
			} else {
				pp=skip[pp];
			}
			
		}
		if (pp==pat.length()) {
			return pt-pp;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ؽ�Ʈ:");
		String s1 = sc.next();
		System.out.print("����:");
		String s2 =sc.next();
		int idx = kmpMatch(s1, s2);
		if (idx==-1) {
			System.out.println("�ؽ�Ʈ�� ������ �����ϴ�");
		}
		else {
			int len = 0;
			for (int i = 0; i < idx; i++) {
				len+=s1.substring(i,i+1).getBytes().length;
			}
			len += s2.length();
			
			System.out.println((idx+1)+"��° ���ں��� ��ġ�մϴ�.");
			System.out.println("�ؽ�Ʈ:" + s1);
			System.out.printf(String.format("����: %%%ds\n", len),s2);
		}
		
	}
}
