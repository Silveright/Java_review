package ex06_1_array;


public class ArrayExample9_2차원배열4 {

	public static void main(String[] args) {
		
		int table[][] = { { 10, 20 }, { 30, 40 }, { 50 } };

		for (int i =0; i<table.length; i++) {
			for (int j = 0; j<table[i].length; j++) {
				System.out.println("table[" + i + "][" + j + "]="+ table[i][j]);
			}
		}
		System.out.println();

	}
}


