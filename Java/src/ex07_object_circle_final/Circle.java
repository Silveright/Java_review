package ex07_object_circle_final;

class Circle {
	//???? (????????)
	double radius;
	final double PI = 3.14;
	/*
	//??????-
	 * ?ν??Ͻ? ?????? ?ʱ?ȭ ?۾??? ?ַ? ?????Ǹ? ?ν??Ͻ? ?????ÿ? ?????Ǿ??? ?? ?۾??? ???ؼ??? ????
	 * ?????ڵ? ?????ε??? ???ɶ??? ???????? ?????ڰ? ?????? ?? ????
	 *
	 * 
//	 ?????? ????
	 ???????? ?̸??? Ŭ?????? ?̸??? ???ƾ? ?Ѵ?
	 ?????ڴ? ???? Ÿ???? ????
	 
//	 ?Ű??????? ???? ?????? - ?⺻ ??????
	 Ŭ???????? ?ݵ??? ?ϳ? ?̻??? ?????ڰ? ???ǵǾ? ?־??? ?Ѵ?
	 ?????ڰ? ???? ???? ?ڵ????? ?߰??Ǵ? ??????
	 ?Ű??????? ?ִ? ?????ڰ? ?Ѱ????? ?ۼ??? ???? ?⺻ ?????ڴ? ?ڵ? ?߰????? ?ʴ???
*/
	Circle(double radius){
		this.radius = radius;
	}
	
	double getArea() {
		double area= PI* radius * radius;
		return area;
	} 
}
	

