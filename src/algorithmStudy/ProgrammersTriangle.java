package algorithmStudy;

public class ProgrammersTriangle {
	public int solution(int[][] triangle) {
		for (int i = 0; i < triangle.length-1; i++) {
			triangle[i+1][0] += triangle[i][0];
			triangle[i+1][triangle[i+1].length-1]+=triangle[i][triangle[i].length-1];
			for (int j = 1; j < triangle[i+1].length-2; j++) {
				if (triangle[i][j-1]<triangle[i][j]) {
					triangle[i+1][j] += triangle[i][j];
				}else {
					triangle[i+1][j] += triangle[i][i-1];
				}
			}
		}
		int answer=0;
		for (int i = 0; i < triangle[triangle.length-1].length; i++) {
			if (answer<triangle[triangle.length-1][i]) {
				answer = triangle[triangle.length-1][i];
			}
		}
		return answer;
		
	}
}
