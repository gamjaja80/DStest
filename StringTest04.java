package review;

public class StringTest04 {

	public static void main(String[] args) {
		String scores = "11,22,33,44,55";
		
		String[] arScore = scores.split(",");
		//split�� �ϸ� �˾Ƽ� �迭�� ����ȴ�.
		double total = 0;
		double avg = 0.0;
		for(int i = 0; i<arScore.length; i++) {
			total += Double.parseDouble(arScore[i]);
		}
		
		avg = total/(double)arScore.length; //����ȯ
		
		System.out.println("���� : " + (int)total + 
							"\n��� : " + String.format("%.1f", avg));
		
	}

}
