package algorithmStudy;


import java.util.Arrays;

public class Marathon {
	public String solution(String[] participants, String[] completion) {
		Arrays.sort(participants);
		Arrays.sort(completion);
		int i = 0;
		for (i = 0; i < completion.length; i++) {
			if (!participants[i].equals(completion[i])) {
				return participants[i];
			}
		}
		
		return participants[i];
		
	}
}
