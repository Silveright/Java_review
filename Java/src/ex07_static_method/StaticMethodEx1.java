package ex07_static_method;

public class StaticMethodEx1 {
	public static void main(String args[]) {
		int grandTotal = Accumulator.getGrandTotal();
		System.out.println("ÃÑ°è =" +grandTotal);
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		obj1.accumulate(10);
		obj1.accumulate(20);
		
		grandTotal = Accumulator.getGrandTotal();
		System.out.println("obj1.total =" +obj1.total);
		System.out.println("obj2.total =" +obj2.total);
		System.out.println("ÃÑ°è =" +grandTotal);
	}

}
