package algorithmStudy;

import java.util.Scanner;

public class BMmatch {
	static int bmMatch(String txt, String pat) {
		int pt;
		int pp;
		int txtlen = txt.length();
		int patlen = pat.length();
		int[] skip = new int[Character.MAX_VALUE+1];
		
		for (pt = 0; pt <= Character.MAX_VALUE+1; pt++) {
			skip[pt] =patlen;
		}
		for (pt = 0; pt < patlen; pt++) {
			skip[pat.charAt(pt)] = patlen - pt -1;
			
		}
		while (pt<txtlen) {
			pp=patlen-1;
			while (txt.charAt(pt)==pat.charAt(pp)) {
				if (pp==0) {
					return pt;
				}
				pp--;
				pt--;
			}
			pt+=(skip[txt.charAt(pt)]>patlen-pp) ? skip[txt.charAt(pt)]:patlen-pp;
			
		}
		return -1;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ؽ�Ʈ:");
		String s1 = sc.next();
		System.out.print("����:");
		String s2 =sc.next();
		int idx = bmMatch(s1, s2);
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
