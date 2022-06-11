package Study;

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	 String info() {
		return name + "," + ban + "," + no + "," + kor + "," +
	 eng + "," + math + "," +(kor+eng+math)+ ","  + (int)(kor+eng+math)/3;
		// TODO Auto-generated method stub
		
	}
	 
	 int getTotal() {
		 return  kor+math+eng;
	 }
	 
	 float getAverage() {
		 return (int)(getTotal()/3f*10+0.05f)/10f;
	 }
}

