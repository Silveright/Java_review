package ex06_1_array;

public class ArrayExample6 {

	public static void main(String[] args) {
		
		int[] data = {20, 30,40,80,10};
		
		int max = data[0];
		int min =data[0];
		
		for(int i =1; i<data.length; i++) {
			if(data[i]>max) {
				max = data[i];
			}  if (data[i]<min) {
				min = data[i];
			}
		}
		
		System.out.println("max=" +max);
		System.out.println("min=" +min);
	}
}


