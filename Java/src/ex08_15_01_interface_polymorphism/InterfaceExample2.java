//단행본 클래스와 부록 CD 클래스를 사용하는 프로그램
package ex08_15_01_interface_polymorphism;
public class InterfaceExample2 {
	public static void main(String[] args) {
		Lendable arr0, arr1, arr2;
		//arr0=new Lendable(); 오류 발생
		arr0 = new SeparateVolume("883ㅇ", "푸코의 진자", "에코");
		arr1 = new SeparateVolume("609.2", "서양미술사", "곰브리치");
		arr2 = new AppCDInfo("02-17","마이크로서비스를 위한 자바 프로그래밍");
		
		//같은 사람이 같은 날짜에 단행본 2권과 부록 CD를 빌리는 경우
		checkOut(arr0, "수지", "2022-06-02");
		checkOut(arr1, "수지", "2022-06-02");
		checkOut(arr2, "수지", "2022-06-02");
		
	
	}
	
	//자바 컴파일러는 컴파일 할 때 변수의 타입만 보고 메서드나 필드 존재 여부를 체크하기 때문에
	//Lendable 인터페이스에 checkOut메서드가 있어야 컴파일 에러가 없다.
	 static void checkOut(Lendable arr, String borrower, String date) {
		arr.checkOut(borrower, date);
	}
}
