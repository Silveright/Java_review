package ex06_1_array;

public class ArrayExample3_2_�迭���� {

	public static void main(String[] args) {
		
		int score[] = {95,70,80,75,100};
		int sum =0;
		
		for(int i =0; i<score.length; i++) {
			sum+=score[i];//sum=sum+score[i]
			System.out.println("score[" + i + "]=" + score[i]);
		}
		System.out.println("����="+sum);
	}
}


