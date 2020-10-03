package algorithmStudy;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon9095 {
	 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int times = Integer.parseInt(br.readLine());
 
        int[] d = new int[11];
 
        d[0] = 1;
        // n ���� 0�� ���� ���� �ƹ��͵� ���� �ʴ� �Ѱ��� ����� �־�� �ϳ�] 
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;
        // 1,2,3�� �Է����� ���� �� ������� ����
 
        for (int i = 4; i < 11; i++) {
            d[i] = d[i - 1] + d[i - 2] + d[i - 3];
            // ������� Ȱ���� 4���� �ִ� �Է��� 11���� ���ؼ� �迭�� ����
        }
 
        for (int i = 0; i < times; i++) {
 
            int n = Integer.parseInt(br.readLine());
            // �׽�Ʈ ���̽� �ް�
            bw.write(String.valueOf(d[n]));
            // ���
            bw.write('\n');
            bw.flush();
 
        }
 
    }
 
}
