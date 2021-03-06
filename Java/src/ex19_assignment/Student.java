package ex19_assignment;
import java.util.ArrayList;
public class Student implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	static void sort(ArrayList<Student> students) {
			Student imsi;
			for (int i = 0; i < students.size()-1 ; i++) {
				for (int j = i + 1; j < students.size(); j++) {
					if (students.get(i).getTotal() < students.get(j).getTotal()) {
						imsi = students.get(i);
						students.set(i,students.get(j));
						students.set(j,imsi);
						
					}
				}
			}
	} 
}
