package Study;
class  Data2{
	int x;
}
public class Studt2 {
public static void main(String[] args) {
	Data2 d =new Data2();
	d.x=10;
	System.out.println(d.x);
	change(d);
	System.out.println(d.x);
}

private static void change(Data2 c) {
	// TODO Auto-generated method stub
	c.x = 1000;
	System.out.println(c.x);
}
}
