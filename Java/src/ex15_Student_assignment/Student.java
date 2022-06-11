//정적 필드가 있는 클래스
//total 필드는 객체마다 따로 생기지만
//grandTotal필드는 특정 객체에 상관없이 클래스 자체에 하나만 생기는 정적 필드

package ex15_Student_assignment;

public class Student {
	String name;
	int kor,eng,math;
	
	static int korTotal, mathTotal, engTotal;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		korTotal +=kor;
		mathTotal += math;
		engTotal += eng;
	}
	
	int getTotal() {
		return kor+eng+math;
	} 
	
	float getavrage() {
		return (getTotal()/3f);
	} 
	public String toString() { //toString() 오버라이딩
		return "" + name +"\t" + kor +"\t" +eng+"\t" +math+"\t"+ getTotal()+"\t"
				+Math.round(getavrage()*10)/10.0 ;
				//String.format("%.1F",getAverage()); 
	}
} 

