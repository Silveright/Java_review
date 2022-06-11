package Study;
class  Data{
	int x;
}
public class Studt01 {
public static void main(String[] args) {
	Data d =new Data();
	d.x=10;
	System.out.println(d.x);
	change(d.x);
	System.out.println(d.x);
}

private static void change(int x) {
	// TODO Auto-generated method stub
	x = 1000;
	System.out.println(x);
}
}
