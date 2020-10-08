package algorithmStudy;

import java.util.Scanner;

public class BFmatch {
	static int bfMatch(String txt, String pat) {
		int pt = 0;
		int pp = 0;
		
		while (pt != txt.length()&&pp!=pat.length()) {
			if (txt.charAt(pt)==pat.charAt(pp)) {
				pt++;
				pp++;
			}else {
				pt=pt-pp+1;
				pp=0;
				
			}
			
		}
		if (pp==pat.length()) {
			return pt-pp;
		}
		return -1;
	}
	//s1.indexOf("ab") ab�� �ִ� index���� ��ȯ��
	//s1.lastIndexOf("ab") ab�� �ִ� ������ index���� ��ȯ��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ؽ�Ʈ:");
		String s1 = sc.next();
		System.out.print("����:");
		String s2 =sc.next();
		int idx = bfMatch(s1, s2);
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
