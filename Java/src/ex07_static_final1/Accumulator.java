//정적 필드가 있는 클래스
//total 필드는 객체마다 따로 생기지만
//grandTotal필드는 특정 객체에 상관없이 클래스 자체에 하나만 생기는 정적 필드

package ex07_static_final1;

class Accumulator {
	
	static final int UPPER_LIMIT = 100000; //정적 필드를 선언하는 선언문
	int value;
	
	void setValue (int value) {
		if (value < UPPER_LIMIT)
			this.value = value;
		else
			this.value = UPPER_LIMIT;
		
		
	}
}