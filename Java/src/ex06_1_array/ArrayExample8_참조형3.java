package ex06_1_array;

import java.util.Scanner;

public class ArrayExample8_참조형3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name[] = { "홍길동", "이순신", "홍길동", "세종대왕" };
		
		int index = -1;
		
		 
		System.out.println("이름을 입력하세요.");
		System.out.println("이름:");

		String inputname = sc.next();
		
		for(int i =0; i<name.length; i++) {
			if(inputname.equals(name[i])) {
				index = i;
				break;
			}
		}
		if(index != -1) {
				System.out.println(inputname + "은 배열의 인덱스" + index +"에서 찾았습니다.");
			
			} else{
			System.out.println(inputname + "은 배열방에서 찾지 못했습니다.");
		}
		sc.close();
	}
}


