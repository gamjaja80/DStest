package review;

public class StringTest04 {

	public static void main(String[] args) {
		String scores = "11,22,33,44,55";
		
		String[] arScore = scores.split(",");
		//split을 하면 알아서 배열로 저장된다.
		double total = 0;
		double avg = 0.0;
		for(int i = 0; i<arScore.length; i++) {
			total += Double.parseDouble(arScore[i]);
		}
		
		avg = total/(double)arScore.length; //형변환
		
		System.out.println("총점 : " + (int)total + 
							"\n평균 : " + String.format("%.1f", avg));
		
	}

}
