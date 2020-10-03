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
        // n 으로 0이 들어올 경우는 아무것도 하지 않는 한가지 방법이 있어야 하나] 
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;
        // 1,2,3이 입력으로 들어올 때 기저사례 세팅
 
        for (int i = 4; i < 11; i++) {
            d[i] = d[i - 1] + d[i - 2] + d[i - 3];
            // 기저사례 활용해 4부터 최대 입력인 11까지 구해서 배열에 저장
        }
 
        for (int i = 0; i < times; i++) {
 
            int n = Integer.parseInt(br.readLine());
            // 테스트 케이스 받고
            bw.write(String.valueOf(d[n]));
            // 출력
            bw.write('\n');
            bw.flush();
 
        }
 
    }
 
}
