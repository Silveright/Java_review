package ex06_1_array;


public class ArrayExample9_2�����迭 {

	public static void main(String[] args) {
		
		int table[][] = new int[3][4];
		table[0][0] = 10;
		table[1][1] = 20;
		table[2][3] = table[0][0] + table[1][1];
		
		for (int i=0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
			System.out.println("table[" + i + "]["+ j + "]=" + table[i][j]);
		}
	}
	}	
}


